import java.io.*;

public class MyCopy {
    public static void main(String[] args) {
        try
	{
    		FileReader fr = new FileReader(args[0]);
		BufferedReader br = new BufferedReader(fr);
    		String buf;
		FileWriter fw = new FileWriter(args[1]);
        	BufferedWriter bw = new BufferedWriter(fw);
		while ((buf = br.readLine()) != null)
		{
			System.out.println(buf);
        		bw.write(buf);
   		}
        bw.close();
        fw.close();
	bw.close();
	fw.close();
}
	catch (IOException ex) 
	{
    		System.out.println("ファイル読込みエラー");
    		System.exit(1);
	}
    }
}
