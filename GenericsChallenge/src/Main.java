
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		Team<FootballPlayer> melbourne = new Team<>("Melbourne");
		Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
	    Team<FootballPlayer> fremantle= new Team<>("Fremantle");
	    footballLeague.addTeams(adelaideCrows);
	    footballLeague.addTeams(melbourne);
	    footballLeague.addTeams(hawthorn);
	    footballLeague.addTeams(fremantle);
        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
        footballLeague.displayRankings();
        
	}

}
