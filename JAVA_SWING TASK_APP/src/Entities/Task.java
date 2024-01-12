package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents a task with various properties such as description, priority, materials, etc.
 */
public class Task {

    private String id;
    private String description;
    private int priority;
    private List<Material> materials;
    private List<Notification> notifications;
    private LocalDate startDate;
    private List<Member> members;
    private List<WorkOrder> workOrders;
    private LocalDate endDate;
    private TaskStatus status;

    /**
     * Constructs a Task object with a randomly generated ID.
     *
     * @param description  The description of the task.
     * @param priority     The priority level of the task (must be greater than or equal to 1).
     * @param materials    The list of materials associated with the task.
     * @param notifications The list of notifications associated with the task.
     * @param startDate    The start date of the task (must not be after the end date).
     * @param members      The list of members assigned to the task.
     * @param workOrders   The list of work orders related to the task.
     * @param endDate      The end date of the task.
     * @param status       The status of the task.
     * @throws IllegalArgumentException if priority is less than 1 or if startDate is after endDate.
     */
    public Task(String description, int priority, List<Material> materials,
                List<Notification> notifications, LocalDate startDate, List<Member> members,
                List<WorkOrder> workOrders, LocalDate endDate, TaskStatus status) {
        this.id = generateRandomId();
        this.description = description;
        setPriority(priority);
        setMaterials(materials);
        setNotifications(notifications);
        setStartDate(startDate);
        setMembers(members);
        setWorkOrders(workOrders);
        setEndDate(endDate);
        setStatus(status);
    }

    // Getters and setters with validation

    /**
     * Gets the description of the task.
     *
     * @return The description of the task.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the list of notifications associated with the task.
     *
     * @param notifications The list of notifications to be set.
     */
    public void setNotifications(List<Notification> notifications) {
        this.notifications = new ArrayList<>(notifications);
    }


    /**
     * Sets the description of the task.
     *
     * @param description The description to be set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the priority level of the task.
     *
     * @return The priority level of the task.
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the priority level of the task.
     *
     * @param priority The priority level to be set.
     * @throws IllegalArgumentException if priority is less than 1.
     */
    public void setPriority(int priority) {
        if (priority < 1) {
            throw new IllegalArgumentException("Priority must be greater than or equal to 1.");
        }
        this.priority = priority;
    }

    /**
     * Gets the list of materials associated with the task.
     *
     * @return The list of materials associated with the task.
     */
    public List<Material> getMaterials() {
        return new ArrayList<>(materials);
    }

    /**
     * Sets the list of materials associated with the task.
     *
     * @param materials The list of materials to be set.
     */
    public void setMaterials(List<Material> materials) {
        this.materials = new ArrayList<>(materials);
    }

    /**
     * Gets the start date of the task.
     *
     * @return The start date of the task.
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date of the task.
     *
     * @param startDate The start date to be set.
     * @throws IllegalArgumentException if startDate is after the end date.
     */
    public void setStartDate(LocalDate startDate) {
        if (endDate != null && startDate.isAfter(endDate)) {
            throw new IllegalArgumentException("Start date cannot be after the end date.");
        }
        this.startDate = startDate;
    }

    /**
     * Gets the list of members assigned to the task.
     *
     * @return The list of members assigned to the task.
     */
    public List<Member> getMembers() {
        return new ArrayList<>(members);
    }

    /**
     * Sets the list of members assigned to the task.
     *
     * @param members The list of members to be set.
     */
    public void setMembers(List<Member> members) {
        this.members = new ArrayList<>(members);
    }

    /**
     * Gets the list of work orders related to the task.
     *
     * @return The list of work orders related to the task.
     */
    public List<WorkOrder> getWorkOrders() {
        return new ArrayList<>(workOrders);
    }

    /**
     * Sets the list of work orders related to the task.
     *
     * @param workOrders The list of work orders to be set.
     */
    public void setWorkOrders(List<WorkOrder> workOrders) {
        this.workOrders = new ArrayList<>(workOrders);
    }

    /**
     * Gets the end date of the task.
     *
     * @return The end date of the task.
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Sets the end date of the task.
     *
     * @param endDate The end date to be set.
     * @throws IllegalArgumentException if endDate is before the start date.
     */
    public void setEndDate(LocalDate endDate) {
        if (startDate != null && endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("End date cannot be before the start date.");
        }
        this.endDate = endDate;
    }

    /**
     * Gets the status of the task.
     *
     * @return The status of the task.
     */
    public TaskStatus getStatus() {
        return status;
    }

    /**
     * Sets the status of the task.
     *
     * @param status The status to be set.
     */
    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    /**
     * Generates a random ID using the specified logic.
     *
     * @return A randomly generated ID.
     */
    private static String generateRandomId() {
        int length = 10;
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder generatedId = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            generatedId.append(characters.charAt(randomIndex));
        }

        return generatedId.toString();
    }
}
