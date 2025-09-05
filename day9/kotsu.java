public class kotsu extends Kosensei{
	private String kotsu;
	public kotsu(int year, String major, String name, String kotsu){
		super(year, major, name);
		this.kotsu = kotsu;
	}
        public kotsu(int year, String major, String name){
                super(year, major, name);
                this.kotsu = null;
        }
	
	public String getKotsu(){return this.kotsu;}
	public void shokai(){
		System.out.println("私は" + super.getGakunen() + "年" + super.getBunnya() + "の" + super.getNamae() + "です.私は" +  this.kotsu + "で通っています.ふぁっきゅー");
	}
}
