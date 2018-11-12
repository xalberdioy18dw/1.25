import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ObjToArrayList {
	
	public static void main (String[]args) {
		ArrayList<Match> footballmatches = new ArrayList<Match>();
		try {
			File file = new File(args[0]);
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
	            String matches = sc.nextLine();
	            System.out.println(matches);
	            String[] fmatch = matches.split("::");
	            Match match = new Match();
	            match.setLocalTeam(fmatch[0]);
				match.setVisitorTeam(fmatch[1]);
				match.setGoalsLocal(Integer.parseInt(fmatch[2]));
				match.setGoalsVisitor(Integer.parseInt(fmatch[3]));
				footballmatches.add(match);
	            
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
