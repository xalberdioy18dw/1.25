public class Match {

	private Team LocalTeam;
	private Team VisitorTeam;
	private int goalsLocal;
	private int goalsVisitor;

	public Team getLocalTeam() {
		return LocalTeam;
	
    }

	public void setLocalTeam(Team LocalTeam) {
		this.LocalTeam = LocalTeam;
	}

	public Team getVisitorTeam() {
		return VisitorTeam;
	}

	public void setVisitorTeam(Team visitorTeam) {
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