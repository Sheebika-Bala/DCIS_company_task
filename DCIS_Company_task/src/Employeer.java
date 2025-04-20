public class Employeer {
    private String name;
    private String role;

    public Employeer(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String toString() {
        return name + " - " + role;
    }
}
