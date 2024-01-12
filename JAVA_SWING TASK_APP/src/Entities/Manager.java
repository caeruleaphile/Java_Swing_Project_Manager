package Entities;
import java.io.*;
import java.time.LocalDate;
import java.util.List;

/**
 * Represents a manager in the system, extending the User class.
 */
public class Manager extends User {
    private List<Project> projects;
    private Skill skill;
    private List<Material> materials;

    public Manager(String username, String password, String fullName, String phoneNumber,
                   LocalDate birthDay, String email, String role, Sex sex, Skill skill, List<Project> projects, List<Material> materials) {
        super(username, password, fullName, phoneNumber, birthDay, email, role, sex, skill);
        this.skill = skill;
        this.projects = projects;
        this.materials = materials;
    }

    // Getters and setters

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }













}