package inputoutput;
import java.io.*;
import static java.lang.System.out;

public class ByteStreamsSrctoDest {
	public static void main(String args[]) throws IOException{

	FileInputStream fin=null;
	FileOutputStream fout=null;
	
	try {
		fin= new FileInputStream("source.txt");
		fout= new FileOutputStream("destination.txt");
		
		int c; 
		while((c=fin.read())!=-1) { //end of line
			out.write(c);
		}
	}finally {
		if(fin!=null) {
			fin.close();
		}
		if(fout!=null) {
			fout.close();
		}
			
	}
}
}