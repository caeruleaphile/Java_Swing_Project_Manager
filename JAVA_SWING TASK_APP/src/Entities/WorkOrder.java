package Entities;

import java.util.Random;

/**
 * Represents a work order with various properties such as title, description .
 */
public class WorkOrder {

    private String title;
    private String description;
    private String id;

    /**
     * Constructs a WorkOrder object with a generated ID and the specified parameters.
     *
     * @param title       The title of the work order.
     * @param description The description of the work order.
     */
    public WorkOrder(String title, String description) {
        this.title = title;
        this.description = description;
        this.id = generateId();
    }

    // Getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    /**
     * Generates a random ID for the work order.
     *
     * @return A randomly generated work order ID.
     */
    private static String generateId() {
        int length = 8;  // Set the desired length of the ID
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

