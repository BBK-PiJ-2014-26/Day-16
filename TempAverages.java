import java.io.FileReader;
import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Question7: Day-16
 * @author Gareth Moore
 */
public class TempAverages {

	public static void main(String[] args) {
		try {
			File myFile = new File("./Temperature averages.csv");
			FileReader myFR = new FileReader(myFile);
			BufferedReader in = new BufferedReader(myFR);
			String input = in.readLine();
			double fileTotal = 0;
			int lineCount = 0;
			while(input != null) {
				Scanner sc = new Scanner(input);
				double lineTotal = 0;
				int inputCount = 0;
				while (sc.hasNextDouble()) {
					lineTotal = lineTotal + sc.nextDouble();
					inputCount++;
				}
				System.out.println("Line Average: " + (fileTotal / inputCount));
				fileTotal = fileTotal + lineTotal;
				lineCount++;
				input = in.readLine();
			}
			System.out.println("Line Average: " + (fileTotal / lineCount));
		} catch (IOException ex) {
			System.out.println("INVALID");
		}
	}
}