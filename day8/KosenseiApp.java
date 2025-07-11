class KosenseiApp
{
    public static void main(String args[])
    {
    	Kosensei pepsi = new Kosensei();
	Sumaho pepsi = new Sumaho();
	pepsi.setGakunen(6);
	pepsi.shokai();
	pepsi.setGakunen(4);
	pepsi.shokai();
	pepsi.setBunnya("化学");
	pepsi.shokai();
	pepsi.setBunnya("情報");
	pepsi.shokai();
	pepsi.setSumaho("temu");
	pepsi.sprint();
    }
} 
