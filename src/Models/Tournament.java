package Models;

import java.sql.Date;

public class Tournament {
    private int id;
    private String name;
    private String game;
    private Date startDate;
    private String status; 

    public Tournament() {}

    public Tournament(int id, String name, String game, Date startDate, String status) {
        this.id = id;
        this.name = name;
        this.game = game;
        this.startDate = startDate;
        this.status = status;
    }

    public int getId()                          { return id; }
    public void setId(int id)                   { this.id = id; }

    public String getName()                     { return name; }
    public void setName(String name)            { this.name = name; }

    public String getGame()                     { return game; }
    public void setGame(String game)            { this.game = game; }

    public Date getStartDate()                  { return startDate; }
    public void setStartDate(Date startDate)    { this.startDate = startDate; }

    public String getStatus()                   { return status; }
    public void setStatus(String status)        { this.status = status; }

    @Override
    public String toString() { return name + " [" + game + "]"; }
}