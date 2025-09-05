public class ArrayListInt {
	private int saidai;
	private int[] a;
	private int jissai;
	public ArrayListInt() {
		this.saidai = 5;
		this.a = new int[this.saidai];
		this.jissai = 0;
	}
	public void add(int x) {
		if (this.jissai <= 5){
			this.a[jissai] = x;
			this.jissai +=1;
		} else {System.out.println("格納上限ぞよ");}
	}

	public int getSize() {return this.jissai;}
	public int getShell(int x) {return this.a[x];}

	public void print(){
		int i;
		for(i=0;i<jissai;i++){
			System.out.println(a[i]);
		}
	}
}
