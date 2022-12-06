
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class ZeichenLesen{
	public static void main(String[] args){
		FileInputStream fis = null;
		InputStreamReader isr = null;
		try{
			fis = new FileInputStream("testdatei.txt");
			isr = new InputStreamReader(fis, "utf-8");
			int inChar;
			while((inChar = isr.read())!=-1){
				System.out.print((char)inChar);
			}
		} catch(IOException ioe){ //Ausnahmebeh.
			ioe.printStackTrace();
		} finally {
			try{
				isr.close();
				fis.close();
			} catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
}
