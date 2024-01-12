package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents an objective with various properties such as id, end date, etc.
 */
public class Objective {

    private String id;
    private LocalDate endDate;
    private List<Task> taskList;
    private LocalDate startDate;
    private String description;

    /**
     * Constructs an Objective object with the specified parameters.
     *
     * @param endDate     The end date of the objective.
     * @param taskList    The list of tasks associated with the objective.
     * @param startDate   The start date of the objective.
     * @param description The description of the objective.
     */
    public Objective(LocalDate endDate, List<Task> taskList,LocalDate startDate, String description) {
        this.id = generateId();
        this.endDate = endDate;
        this.taskList = new ArrayList<>(taskList);
        this.startDate = startDate;
        this.description = description;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<Task> getTaskList() {
        return new ArrayList<>(taskList);
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = new ArrayList<>(taskList);
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
     * Generates a random ID for the objective.
     *
     * @return A randomly generated objective ID.
     */
    private static String generateId() {
        int length = 4;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        char[] generatedId = new char[length];

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            generatedId[i] = characters.charAt(randomIndex);
        }

        return new String(generatedId);
    }
}
