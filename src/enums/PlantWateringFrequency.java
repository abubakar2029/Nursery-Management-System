package enums;

public enum PlantWateringFrequency {
    LOW("Twice a week"),
    MEDIUM("Every alternate day"),
    HIGH("Daily");

    private final String description;

    PlantWateringFrequency(String description) {
        this.description = description;
    }
}
