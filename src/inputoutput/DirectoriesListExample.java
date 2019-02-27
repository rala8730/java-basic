package inputoutput;
import java.io.File;

public class DirectoriesListExample {

	public static void main(String[] args) {
		try {
			File file= new File("C:/test/tmp");//creates a new file object
			String[] paths= file.list();//array of files and directories
			for(String path:paths) {//for each name in the path
				System.out.println(path);//prints filename and directory name
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
