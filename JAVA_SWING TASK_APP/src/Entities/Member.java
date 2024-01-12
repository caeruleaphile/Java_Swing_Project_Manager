package Entities;

import java.time.LocalDate;
import java.util.List;

/**
 * Represents a member in the system, extending the User class.
 */
public class Member extends User {
    private Skill skill;
    private List<Task> tasks;

    public Member(String username, String password, String fullName, String phoneNumber,
                  LocalDate birthDay, String email, String role, Sex sex, Skill skill) {
        super(username, password, fullName, phoneNumber, birthDay, email, role, sex, skill);
        this.skill = skill;
    }

    // Getters and setters

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
