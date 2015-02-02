import java.io.File;

/**
 * Exercise 2: Day-16
 * @author Gareth Moore
 */
public class Mkdir {

	public static void main(String[] args) {
		String fileName = "";
		for (int i = 0; i < args.length; i++) {
			fileName = fileName + " " + args[i];
		}
		File dirName = new File(fileName);
		boolean created = dirName.mkdir();
		if (!created) {
			System.out.println("Error! Dir was not created");
		}
	}
}