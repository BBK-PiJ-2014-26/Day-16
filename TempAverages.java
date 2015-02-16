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
			FileReader myFR = new FileReader("./Temperature averages.csv");
			BufferedReader in = new BufferedReader(myFR);
			String input = in.readLine();
			int fileTotal = 0;
			int fileInputCount = 0;
			while(input != null) {
				Scanner sc = new Scanner(input);
				sc.useDelimiter(", ");
				int lineTotal = 0;
				int inputCount = 0;
				while (sc.hasNextInt()) {
					int temp = sc.nextInt();
					lineTotal = lineTotal + temp;
					inputCount++;
				}
				System.out.println("Line Average: " + (lineTotal / inputCount));
				fileTotal = fileTotal + lineTotal;
				fileInputCount = fileInputCount + inputCount;
				input = in.readLine();
			}
			System.out.println("Total Average: " + (fileTotal / fileInputCount));
		} catch (IOException ex) {
			System.out.println("INVALID");
		}
	}
}