import java.io.File;

/**
 * Exercise 1: Day-16
 * @author Gareth Moore
 */
public class Ls {

	public static void printDirContents(String pathName) {
		File dir = new File(pathName);
		String[] dirContents = dir.list();
		for (int i = 0; i < dirContents.length; i++) {
			System.out.println(dirContents[i]);
		}
	}

	public static void main(String[] args) {
		String pathName = "/GitHub/Day-15";
		printDirContents(pathName);
	}
}