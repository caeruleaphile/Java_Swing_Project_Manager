package Entities;
import java.time.LocalDateTime;
import java.util.Random;

/**
 * Represents a notification associated with a task.
 */
public class Notification {

    private String id;
    private LocalDateTime date;
    private NotificationType type;
    private Task task;
    private String description;

    /**
     * Constructs a Notification object with the specified parameters.
     *
     * @param date        The date and time of the notification.
     * @param type        The type of the notification (e.g., EMAIL, SMS).
     * @param task        The task associated with the notification.
     * @param description The description of the notification.
     */
    public Notification(LocalDateTime date, NotificationType type, Task task, String description) {
        this.id = generatedId();
        this.date = date;
        this.type = type;
        this.task = task;
        this.description = description;
    }

    // Getters and setters

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Generates a random alphanumeric ID.
     *
     * @return The randomly generated alphanumeric ID.
     */
    private String generatedId() {
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

