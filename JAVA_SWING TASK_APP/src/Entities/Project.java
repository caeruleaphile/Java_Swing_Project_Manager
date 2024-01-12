package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents a project with various properties such as manager, id, end date, etc.
 */
public class Project {

    private String id;
    private Manager manager;
    private LocalDate endDate;
    private List<Objective> objectiveList;
    private LocalDate startDate;
    private String description;

    /**
     * Constructs a Project object with the specified parameters.
     *
     * @param id           The unique identifier for the project.
     * @param manager      The manager associated with the project.
     * @param endDate      The end date of the project.
     * @param objectiveList The list of objectives associated with the project.
     * @param startDate    The start date of the project.
     * @param description  The description of the project.
     */
    public Project(String id, Manager manager, LocalDate endDate, List<Objective> objectiveList,
                   LocalDate startDate, String description) {
        this.id = generateId();
        this.manager = manager;
        this.endDate = endDate;
        this.objectiveList = new ArrayList<>(objectiveList);
        this.startDate = startDate;
        this.description = description;
    }


    // Getters and setters

    public String getId() {
        return id;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<Objective> getObjectiveList() {
        return new ArrayList<>(objectiveList);
    }

    public void setObjectiveList(List<Objective> objectiveList) {
        this.objectiveList = new ArrayList<>(objectiveList);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Generates a random ID for the project.
     *
     * @return A randomly generated project ID.
     */
    private String generateId() {
        int length = 4;
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String generatedId = "";

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            generatedId += characters.charAt(randomIndex);
        }

        return generatedId;
    }

}
