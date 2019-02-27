package exc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//Checked: compiler expect you to handle
public class Main_one {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {

			FileReader file = null;
				file = new FileReader("C:/test/a.txt");
			BufferedReader fileInput = new BufferedReader(file);

			for (int counter = 0; counter < 3; counter++)
					System.out.println(fileInput.readLine());
				fileInput.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}

	}
}