# Lights Out 4×4 Swing MVC デザイン草案

## 1. 全体構成（MVC）

| 役割 | クラス例 | 内容 |
|-------|---------|------|
| **Model** | `LightsOutModel` | 盤面状態（4x4のboolean配列）管理、操作ルール、初期化・勝利判定 |
| **View** | `LightsOutView` (JPanel) | 配列を描画。ON/OFFで色分け。描画のみ。 |
| **Controller** | `LightsOutController` (JFrame) | 盤面の表示・ボタン配置・マウス入力・リセット操作管理。ModelとViewの仲介役。 |

---

## 2. Model設計方針

- 内部データ構造
  - 4x4の配列: `board[row][col]`
  - `true` → ON, `false` → OFF
- メソッド例
  - `pressCell(row, col)` … 自分＋上下左右の反転
  - `reset()` … 初期化
  - `isCleared()` … 全OFFか判定
- **初期盤面生成（安全版）**
  1. まずすべてOFF
  2. ランダムに複数回 `pressCell()` を呼ぶ（例: 10〜20回）
  3. これで必ず解ける盤面を生成
- **リセット時も同じ処理を呼ぶ** → コード再利用性が高い

---

## 3. View設計方針

- 描画専用
- 4x4マスをループで描画
  - ON → 黄色、OFF → 黒など
- Viewは状態を変更しない
- Controllerから再描画命令を受けるのみ

---

## 4. Controller設計方針

- JFrameをベースに配置
- マスクリック → `(x, y)` → `(row, col)` に変換
- Modelの `pressCell(row, col)` を呼ぶ
- Modelの状態に応じて `view.repaint()`
- リセットボタン → `Model.reset()` → View再描画
- 勝利時はダイアログ表示やラベル更新

---

## 5. 初回起動／リセットの処理

- 共通メソッド `initializeBoard()` で以下を行う
  1. boardを全OFFに初期化
  2. ランダムに複数回 `pressCell()` を呼ぶ
  3. Viewを再描画
- この方法で**必ず解ける初期盤面**を生成

---

制作:釧路工業高等専門学校 情報工学科4年 高島唯琉
