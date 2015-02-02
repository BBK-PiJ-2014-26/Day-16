import java.io.File;

/**
 * Exercise 3a: Day-16
 * @author Gareth Moore
 */
public class Cat {

	public static void main(String[] args) {
		String userInput = "";
		for (int i = 0; i < args.length; i++) {
			userInput = userInput + args[i];
		}
		String pathName = ".";
		File dir = new File(pathName);
		String[] dirContents = dir.list();
		for (int i = 0; i < dirContents.length; i++) {
			if (dirContents[i].equals(userInput)) {
				Ls.printDirContents(dirContents[i].toString());
			}
		}
	}
}