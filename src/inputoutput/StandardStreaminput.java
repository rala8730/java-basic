package inputoutput;

import static java.lang.System.out;
import java.io.*;
public class StandardStreaminput {
//reading data line by line
		public static void main(String args[]) throws IOException {
			String text;
			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader br= new BufferedReader(isr);
			text=br.readLine();
			out.println(text);
		}

}
