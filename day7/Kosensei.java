class Kosensei
{
    int gakunen;   // 学年: 1〜5の整数
    String bunnya; // 分野: "情報", "機械", "電気", "電子", "建築"のいずれかの文字列
    String namae;  // 名前: 文字列
    String jukyo;

    Kosensei(int grade, String major, String name, String residence){
	this.gakunen = grade;
	this.bunnya = major;
	this.namae = name;
	this.jukyo = residence;
    }

    void shokai() // 通常版
    {
        // gakunen, bunnya, namaeはthis(主たるインスタンス)のフィールドを使う.
        System.out.println("私は" + this.gakunen + "年" + this.bunnya + "の" + this.namae + "です.私の住居は" +  this.jukyo + "です.");
    }
    static void shokai(Kosensei a) // static版
    {
        // gakunen, bunnya, namaeは引数aのフィールドを使う.
        System.out.println("彼は" + a.gakunen + "年" + a.bunnya + "の" + a.namae + "さんです.私の住居は" + a.jukyo + "です.");
    }

    void hantei(Kosensei b){
    	if(this.namae.equals(b.namae)){
		System.out.println("私「" + this.namae + "」と「" + b.namae + "」は通学仲間です.");
	}else{
		System.out.println("私「" + this.namae + "」と「" + b.namae + "」は通学仲間ではありません.");
	}
    }
    static void hantei(Kosensei a, Kosensei b){
        if(a.namae.equals(b.namae)){
                System.out.println("私「" + a.namae + "」と「" + b.namae + "」は通学仲間です.");
        }else{
                System.out.println("私「" + a.namae + "」と「" + b.namae + "」は通学仲間ではありません.");
        }
    }
    void shinkyu(){
    	this.gakunen = this.gakunen + 1;
	System.out.println("やったー" + this.namae + "は" + this.gakunen + "年に進級したでゲス.");
	if(this.gakunen == 6) System.out.println("ん?" + this.gakunen + "年はおかしいでゲスね." + this.namae + "は卒業したか専攻科に投げ入れられたでゲス.");
    }
    static void shinkyu(Kosensei a){
        a.gakunen = a.gakunen + 1;
        System.out.println("やったー" + a.namae + "は" + a.gakunen + "年に進級したでゲス.");
	if(a.gakunen == 6) System.out.println("ん?" + a.gakunen + "年はおかしいでゲスね." + a.namae + "は卒業したか専攻科に投げ入れられたでゲス.");
    }

}
