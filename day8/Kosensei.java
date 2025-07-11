class Kosensei
{
    private int gakunen;
    private String bunnya;
    String namae;
    String jukyo;

    Kosensei(){
    this.gakunen = 0;
    this.bunnya = null;
    this.namae = null;
    this.jukyo = null;
    }

    void setGakunen(int grade){
    	if ((grade>=1)&&(grade<=5)) this.gakunen = grade;
    }
    void setBunnya(String major){
    	if((major=="情報")||(major=="機械")||(major=="電気")||(major=="電子")||(major=="建築")) this.bunnya = major;
    }

        void shokai(){
        System.out.println("私は" + this.gakunen + "年" + this.bunnya + "の" + this.namae + "です.私の住居は" +  this.jukyo + "です.");
    }

}
