package Models;

public class Manager {
    private int id;
    private String name;
    private String username;
    private String email;
    private String password;

    public Manager() {}

    public Manager(int id, String name, String username, String email, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public int getId()                      { return id; }
    public void setId(int id)               { this.id = id; }

    public String getName()                 { return name; }
    public void setName(String name)        { this.name = name; }

    public String getUsername()             { return username; }
    public void setUsername(String u)       { this.username = u; }

    public String getEmail()                { return email; }
    public void setEmail(String email)      { this.email = email; }

    public String getPassword()             { return password; }
    public void setPassword(String p)       { this.password = p; }

    @Override
    public String toString() { return name + " (" + username + ")"; }
}