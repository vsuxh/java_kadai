public class game_main_status{
	private String	gname;
	private int	gprice;
	private String	gtype;

	public game_main_status(String name, int price, String type){
		this.gname = name;
		this.gprice = price;
		this.gtype = type;
	}

	public String getGname(){ return this.gname; }
	public int getGprice(){ return this.gprice; }
	public String getGtype(){ return this.gtype;}

	public void print(){
		System.out.println(" game name:" + this.gname);
		System.out.println("price(yen):" + this.gprice);
		System.out.println(" game type:" + this.gtype);
	}


	
}
