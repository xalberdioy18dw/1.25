import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListIterator {
	
	public static void main (String[]args) {
		ArrayList<Match> footballmatches = new ArrayList<Match>();
		try {
			// We create a new file argument
			File file = new File(args[0]);
			Scanner sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
	            String matches = sc.nextLine();
	            System.out.println(matches);
	            // We separate the string by ::
	            String[] fmatch = matches.split("::");
	            Match match = new Match();
	            // We create the variables for the Local/Visitor Teams and goals
	            match.setLocalTeam(fmatch[0]);
				match.setVisitorTeam(fmatch[1]);
				match.setGoalsLocal(Integer.parseInt(fmatch[2]));
				match.setGoalsVisitor(Integer.parseInt(fmatch[3]));
				// We add all the variables in the ArrayList
				footballmatches.add(match);
				//We create a ListIterator.
				ListIterator it = footballmatches.listIterator();
				Match mtch = new Match();
				mtch = (Match) it.next();
				// We crete a condition, if they are the same.
				if (mtch.getGoalsLocal() == mtch.getGoalsVisitor()) {
					System.out.println(mtch.getLocalTeam() + "and" + mtch.getVisitorTeam()+ "drawed." );
					// Remove the drawed matches.
					it.remove();
				
				}
	            
			}
	            
	      for (int z = 0; z < footballmatches.size(); z++) {
	        System.out.println(footballmatches.get(z).getLocalTeam()+ "-" + footballmatches.get(z).getVisitorTeam() + ":" + footballmatches.get(z).getGoalsLocal() + "-" + footballmatches.get(z).getGoalsVisitor() );
	        System.out.println("There are " + footballmatches.size() + " matches." );	
	      }
			
			System.out.println(footballmatches);
			
		}
		  catch (FileNotFoundException e) {
			System.out.println("File is not founded.");
		  }
		
	}
}
