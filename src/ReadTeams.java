import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class ReadTeams {
	public static void main(String[]args) {
		ArrayList<Team> teamsinfo = new ArrayList<Team>();
		ArrayList<Match> footballmatches = new ArrayList<Match>();
		try {
			File file = new File(args[0]);
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String teams = sc.nextLine();
				String[] fteams = teams.split("::");
				Team team = new Team();
				team.setname(fteams[0]);
				team.setcategory(fteams[1]);
				team.setcountry(fteams[2]);
				team.setleague(fteams[3]);
				teamsinfo.add(team);
				
			File file2 = new File(args[1]);
			Scanner sc2 = new Scanner(file);
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
			}
		}
		catch (FileNotFoundException e) {
				System.out.println("File is not founded.");
		}
	}
}
