public class game_sale_type extends game_main_status{
	private String stype;
	private String s_status;

	public game_sale_type(String name, int price, String type, String stype, String status){
		super (name, price, type);
		this.stype = stype;		//only white package or download
		this.s_status = status;		//package:white Sales store
						//download:white Space required for download
	
	}
	public game_sale_type(String name, int price, String type){
                super (name, price, type);
                this.stype = null;
                this.s_status = null;

        }
	public String getStype(){ return this.stype;}
	public String getS_status(){ return this.s_status;}

	public void setStype(String type){
		this.stype = type;
		System.out.println(this.getGname() + "のstypeが「" + this.stype + "」に変更されました");
	}
	public void setS_status(String status){
        	this.s_status = status;
        	System.out.println(this.getGname() + "(" + this.stype + ")のs_statusが「" + this.s_status + "」に変更されました");
        }

	public void print(){
		System.out.println("購入体型:" + this.stype);
		if (this.stype == "package"){System.out.println("取り扱い店舗:" + this.s_status);}
		else if (this.stype == "download"){System.out.println("ダウンロードに必要な領域:" + this.s_status);}
	 	else {System.out.println("error : 入力したstypeがこのプログラムに非対応デス");}
	}
}
