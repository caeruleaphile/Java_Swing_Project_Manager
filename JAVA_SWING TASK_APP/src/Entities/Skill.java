package Entities;

/**
 * Represents a skill associated with users in the system.
 */
public class Skill {
    private String name;
    private String level;

    public Skill(String name) {
        this.name = name;
    }

    // Getter and setter
    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

}
