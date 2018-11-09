import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ObjToArrayList {
	public static void main (String[]args) {
		try {
			File file = new File(args[0]);
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
	            String i = sc.nextLine();
	            System.out.println(i);
			}
			 catch (FileNotFoundException e) {
					System.out.println("File is not founded.");
			 }
		}
	}
}
