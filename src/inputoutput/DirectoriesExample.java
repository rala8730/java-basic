package inputoutput;
import java.io.File;
public class DirectoriesExample {

	public static void main(String[] args) {
		String directoryName=("C:/test/tmp");//creates a folder test and tmp inside test in C
		File directory= new File(directoryName);
				directory.mkdirs();//creating directory

	}

}
