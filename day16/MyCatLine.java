import java.io.*; // インポート文はプログラムの最初に

public class MyCatLine {
    public static void main(String[] args) {
        try
	{
    		FileReader fr = new FileReader(args[0]);
		BufferedReader br = new BufferedReader(fr);
    		String buf;
		String all = "";
    		while ((buf = br.readLine()) != null)
		{
			all += buf;
                	all += System.getProperty("line.separator");

    		}
		System.out.println(all);
    	br.close();
    	fr.close(); 
}
	catch (IOException ex) 
	{
    		System.out.println("ファイル読込みエラー");
    		System.exit(1);
	}
	
    }
}
