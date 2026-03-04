package Models;

public class Player {
    private int id;
    private String name;
    private String username;
    private String role;
    private int teamId;
    private String teamName; 

    public Player() {}

    public Player(int id, String name, String username, String role, int teamId) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.role = role;
        this.teamId = teamId;
    }

    public int getId()                      { return id; }
    public void setId(int id)               { this.id = id; }

    public String getName()                 { return name; }
    public void setName(String name)        { this.name = name; }

    public String getUsername()             { return username; }
    public void setUsername(String u)       { this.username = u; }

    public String getRole()                 { return role; }
    public void setRole(String role)        { this.role = role; }

    public int getTeamId()                  { return teamId; }
    public void setTeamId(int teamId)       { this.teamId = teamId; }

    public String getTeamName()             { return teamName; }
    public void setTeamName(String t)       { this.teamName = t; }

    @Override
    public String toString() { return name + " [" + username + "]"; }
}