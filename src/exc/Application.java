package exc;

public class Application {

public  class Fortress {
	public void openDrawbridge() throws Exception { // p1
		try {
		throw new Exception("Circle");
		} catch (Exception e) {
		System.out.print("Opening!");
		} finally {
		System.out.print("Walls"); // p2
		}
		}
		public void main(String[] moat) throws Exception {
		 new Fortress().openDrawbridge(); // p3
		}

}
}
