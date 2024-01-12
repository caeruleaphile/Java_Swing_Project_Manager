package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents a material with various properties such as materialId, tasks, etc.
 */
public class Material {

    private String materialId;
    private List<Task> tasks;
    private String name;
    private String type;

    /**
     * Constructs a Material object with a generated materialId and the specified parameters.
     *
     * @param tasks The list of tasks associated with the material.
     * @param name  The name of the material.
     * @param type  The type of the material.
     */
    public Material(List<Task> tasks, String name, String type) {
        this.materialId = generateId();
        this.tasks = new ArrayList<>(tasks);
        this.name = name;
        this.type = type;
    }

    // Getters and setters

    public String getMaterialId() {
        return materialId;
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = new ArrayList<>(tasks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Generates a random ID for the material.
     *
     * @return A randomly generated material ID.
     */
    private static String generateId() {
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
