class Deliveries {

    String match_id;
    String inning;
    String batting_team;
    String bowling_team;
    String over;
    String ball;
    String batsman;
    String non_striker;
    String bowler;
    String is_super_over;
    String wide_runs;
    String bye_runs;
    String legbye_runs;
    String noball_runs;
    String penalty_runs;
    String batsman_runs;
    String extra_runs;
    String total_runs;
    String player_dismissed;
    String dismissal_kind;
    String fielder;

    public Deliveries(
            String match_id,
    String inning,
    String batting_team,
    String bowling_team,
    String over,
    String ball,
    String batsman,
    String non_striker,
    String bowler,
    String is_super_over,
    String wide_runs,
    String bye_runs,
    String legbye_runs,
    String noball_runs,
    String penalty_runs,
    String batsman_runs,
    String extra_runs,
    String total_runs,
    String player_dismissed,
    String dismissal_kind,
    String fielder)     // Constructor to assign the values
    {

        this.match_id = match_id;
        this.inning = inning;
        this.batting_team = batting_team;
        this.bowling_team = bowling_team;
        this.over = over;
        this.ball = ball;
        this.batsman = batsman;
        this.non_striker = non_striker;
        this.bowler = bowler;
        this.is_super_over = is_super_over;
        this.wide_runs = wide_runs;
        this.bye_runs = bye_runs;
        this.legbye_runs = legbye_runs;
        this.noball_runs = noball_runs;
        this.penalty_runs = penalty_runs;
        this.batsman_runs = batsman_runs;
        this.extra_runs = extra_runs;
        this.total_runs = total_runs;
        this.player_dismissed = player_dismissed;
        this.dismissal_kind = dismissal_kind;
        this.fielder = fielder;

    }


}
