import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class ObjToArrayList {
	public static void main (String[]args) {
		ArrayList<String> footballmatches = new Arraykust<String>();
		try {
			File file = new File(args[0]);
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
	            String i = sc.nextLine();
	            System.out.println(i);
	            FootballMatch match = new FootballMatch();
	            for (int z = 0; z < word.length; z++) {
	            	match.getLocalTeam
	            }
			}
			System.out.println(footballmatches);
			System.out.println("There are " + footballmatches.size() + " matches." );
		}
		 catch (FileNotFoundException e) {
			System.out.println("File is not founded.");
			 }
		
	}
}
