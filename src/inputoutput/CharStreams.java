package inputoutput;
import java.io.*;
import static java.lang.System.out;


public class CharStreams {

	public static void main(String[] args) throws IOException{
		FileReader sourceStream= null;
		try {
			sourceStream= new FileReader("test.txt");
			//reading sourcefile and writing content to
			//targeting file character by character
			int temp;
			while((temp=sourceStream.read())!=-1)
				out.println((char)temp);
		}finally {
			//closing stream as no longer in use
			if(sourceStream!=null)
				sourceStream.close();
		}

	}

}
