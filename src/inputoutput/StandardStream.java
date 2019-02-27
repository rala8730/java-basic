package inputoutput;

import java.io.*;
import static java.lang.System.out;
//reading data
public class StandardStream {

	public static void main(String[] args) throws IOException {
		out.println("Enter a Character");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		char c= (char)br.read();
		
		}
	
	}

