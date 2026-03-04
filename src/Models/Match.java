package Models;

import java.sql.Timestamp;

public class Match {
    private int id;
    private int tournamentId;
    private int team1Id;
    private int team2Id;
    private int winnerId;
    private Timestamp scheduledDate;
    private String status;
    private int roundNum;
    private int matchOrder;

   
    private String team1Name;
    private String team2Name;
    private String winnerName;
    private String tournamentName;

    public Match() {}

    public int getId()                              { return id; }
    public void setId(int id)                       { this.id = id; }

    public int getTournamentId()                    { return tournamentId; }
    public void setTournamentId(int t)              { this.tournamentId = t; }

    public int getTeam1Id()                         { return team1Id; }
    public void setTeam1Id(int t)                   { this.team1Id = t; }

    public int getTeam2Id()                         { return team2Id; }
    public void setTeam2Id(int t)                   { this.team2Id = t; }

    public int getWinnerId()                        { return winnerId; }
    public void setWinnerId(int w)                  { this.winnerId = w; }

    public Timestamp getScheduledDate()             { return scheduledDate; }
    public void setScheduledDate(Timestamp d)       { this.scheduledDate = d; }

    public String getStatus()                       { return status; }
    public void setStatus(String s)                 { this.status = s; }

    public int getRoundNum()                        { return roundNum; }
    public void setRoundNum(int r)                  { this.roundNum = r; }

    public int getMatchOrder()                      { return matchOrder; }
    public void setMatchOrder(int o)                { this.matchOrder = o; }

    public String getTeam1Name()                    { return team1Name != null ? team1Name : "TBD"; }
    public void setTeam1Name(String n)              { this.team1Name = n; }

    public String getTeam2Name()                    { return team2Name != null ? team2Name : "TBD"; }
    public void setTeam2Name(String n)              { this.team2Name = n; }

    public String getWinnerName()                   { return winnerName != null ? winnerName : "-"; }
    public void setWinnerName(String n)             { this.winnerName = n; }

    public String getTournamentName()               { return tournamentName; }
    public void setTournamentName(String n)         { this.tournamentName = n; }

    public String getRoundLabel() {
        return "Round " + roundNum;
    }
}