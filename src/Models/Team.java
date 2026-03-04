package Models;

public class Team {
    private int id;
    private String name;
    private String game;
    private int managerId;
    private String managerName; 

    public Team() {}

    public Team(int id, String name, String game, int managerId) {
        this.id = id;
        this.name = name;
        this.game = game;
        this.managerId = managerId;
    }

    public int getId()                          { return id; }
    public void setId(int id)                   { this.id = id; }

    public String getName()                     { return name; }
    public void setName(String name)            { this.name = name; }

    public String getGame()                     { return game; }
    public void setGame(String game)            { this.game = game; }

    public int getManagerId()                   { return managerId; }
    public void setManagerId(int managerId)     { this.managerId = managerId; }

    public String getManagerName()              { return managerName; }
    public void setManagerName(String n)        { this.managerName = n; }

    @Override
    public String toString() { return name; }
}