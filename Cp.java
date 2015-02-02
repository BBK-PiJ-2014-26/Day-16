import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.lang.ArrayIndexOutOfBoundsException;

/**
 * Exercise 4a: Day-16
 * @author Gareth Moore
 */
public class Cp {

	public static void main(String[] args) {
		try {
			File checkFileName = new File(args[0]);
			File createFileDir = new File(args[1]);
			if (checkFileName.exists()) {
				if (!createFileDir.exists()) {
					createFileDir.mkdir();
					createFileDir = new File("." + "/" + createFileDir.getName() + "/" + checkFileName.getName());
					createFileDir.createNewFile();
				} else {
					System.out.println("FILE EXISTS: Do you wish to overwrite? y/n ");
					Scanner sc = new Scanner(System.in);
					if (sc.hasNext("y")) {
						createFileDir.delete();
						createFileDir.mkdir();
					} else if (sc.hasNext("n")) {
						System.out.println("Goodbye.");
					} else {
						System.out.println("Failure. Please try again.");
					}
				}
			} else {
				System.out.println("Error! File doesn't exist!");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
	}
}