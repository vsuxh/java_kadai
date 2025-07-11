class KosenseiApp
{
    public static void main(String[] args)
    {
        Kosensei jej = new Kosensei(4, "電気", "ジョンソンエンドジョンソン", "寮");
        Kosensei jonson = new Kosensei(3, "建築", "ジョンソン", "下宿");
	Kosensei json = new Kosensei(5, "建築", "ジェイソン", "下宿");
        jej.shokai(); // 通常版メソッドを呼び出す
        jonson.shokai(); // 通常版メソッドを呼び出す
	jej.hantei(jonson);	
        Kosensei.shokai(jonson); // static版メソッドを呼び出す
        Kosensei.shokai(json); // static版メソッドを呼び出す
	Kosensei.hantei(jonson, json);
	json.shinkyu();
	Kosensei.shinkyu(jonson);
    }
}
