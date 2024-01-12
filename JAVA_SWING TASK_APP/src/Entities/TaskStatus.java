package Entities;

/**
 * Enumeration representing the status of a task.
 */
public enum TaskStatus {
    CANCELED("Canceled"),
    IN_PROGRESS("InProgress"),
    PENDING("Pending"),
    DONE("Done"),
    TO_DO("ToDo"),
    BLOCKED("Blocked"),
    TO_REVIEW("ToReview"),
    REJECTED("Rejected");

    private final String description;

    TaskStatus(String description) {
        this.description = description;
    }

    /**
     * Gets the description associated with the task status.
     *
     * @return The description of the task status.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the French representation of the task status.
     *
     * @return The French representation of the task status.
     */
    public String getInFrench() {
        // Provide French representations for each status
        switch (this) {
            case CANCELED:
                return "Annulé";
            case IN_PROGRESS:
                return "En cours";
            case PENDING:
                return "En attente";
            case DONE:
                return "Terminé";
            case TO_DO:
                return "À faire";
            case BLOCKED:
                return "Bloqué";
            case TO_REVIEW:
                return "À revoir";
            case REJECTED:
                return "Rejeté";
            default:
                return "Unknown";
        }
    }
}
