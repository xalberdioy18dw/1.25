import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class ReadTeams {
	public static void main(String[]args) {
		ArrayList<Team> teamsinfo = new ArrayList<Team>();
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
			System.out.println(team.getname());
			}
		}
		catch (FileNotFoundException e) {
				System.out.println("File is not founded.");
		}
	}
}
