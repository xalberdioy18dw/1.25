public class FootballMatch {

	private String LocalTeam;
	private String VisitorTeam;
	private int goalsLocal;
	private int goalsVisitor;

	public String getLocalTeam() {
		return LocalTeam;
	
    }

	public void setLocalTeam(String LocalTeam) {
		this.LocalTeam = LocalTeam;
	}

	public String getVisitorTeam() {
		return VisitorTeam;
	}

	public void setVisitorTeam(String visitorTeam) {
		this.VisitorTeam = VisitorTeam;
		
	}

	public int getGoalsLocal() {
		return goalsLocal;
	}

	public void setGoalsLocal(int goalsLocal) {
		this.goalsLocal = goalsLocal;
	}

	public int getGoalsVisitor() {
		return goalsVisitor;
	}

	public void setGoalsVisitor(int goalsVisitor) {
		this.goalsVisitor = goalsVisitor;
	}
}