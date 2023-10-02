class Team{

	String teamName;
	int teamRank;
	String players;

	public Team(String teamName){
		this.teamName = teamName;
	}

	public void setRank(int teamRank){
		this.teamRank=teamRank;
	}

	public String toString(){
		return "Team: "+this.teamName+" is ranked nr: "+this.teamRank;
	}

}