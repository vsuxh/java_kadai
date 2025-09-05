public class Kosensei
{
    private int gakunen;
    private String bunnya;
    private String namae;

    public Kosensei(int year, String major, String name){
    	this.gakunen = year;
    	this.bunnya = major;
    	this.namae = name;
    }

    public int getGakunen() {return this.gakunen;}
    public String getBunnya() {return this.bunnya;}
    public String getNamae (){return this.namae;}
    public void shokai(){
        	System.out.println("私は" + this.gakunen + "年" + this.bunnya + "の" + this.namae + "です.ふぁっきゅー");
    }
}
