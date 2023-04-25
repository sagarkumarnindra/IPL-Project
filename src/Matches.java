class Matches {

    String id;
    String season;
    String city;
    String date;
    String team1;
    String team2;
    String toss_winner;
    String toss_decision;
    String result;
    String dl_applied;
    String winner;
    String win_by_runs;
    String win_by_wickets;
    String player_of_match;
    String venue;
    String umpire1;
    String umpire2;
    String umpire3;

    public Matches(String id,
    String season,
    String city,
    String date,
    String team1,
    String team2,
    String toss_winner,
    String toss_decision,
    String result,
    String dl_applied,
    String winner,
    String win_by_runs,
    String win_by_wickets,
    String player_of_match,
    String venue,
    String umpire1,
    String umpire2,
    String umpire3) // Constructor to assign values.
    {

        this.id = id;
        this.season = season;
        this.city = city;
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.toss_winner = toss_winner;
        this.toss_decision = toss_decision;
        this.result = result;
        this.dl_applied = dl_applied;
        this.winner = winner;
        this.win_by_runs = win_by_runs;
        this.win_by_wickets = win_by_wickets;
        this.player_of_match = player_of_match;
        this.venue = venue;
        this.umpire1 = umpire1;
        this.umpire2 = umpire2;
        this.umpire3 = umpire3;

    }


}
