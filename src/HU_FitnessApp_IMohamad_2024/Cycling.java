package HU_FitnessApp_IMohamad_2024;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class Cycling extends Activities {
    private final LanguageManager languageManager;

    public Cycling(String type, String description, LocalDateTime dateTime, float duration, int repeat, float distance, String device, LanguageManager languageManager) {
        super(languageManager, type, description, dateTime, duration, repeat, distance, device, 0);
        this.languageManager = languageManager;
    }
    @Override
    void calculate() {
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("   *********");
        System.out.printf("%-20s: %.1f min%n", languageManager.getPrompt("Duration"), duration);
        System.out.printf("%-20s: %.1f km%n", languageManager.getPrompt("Distance"), distance);
        if (duration > 0) {
            float speed = distance / (duration / 60);
            System.out.printf("%-20s: %.2f km/h%n", getLanguageManager().getPrompt("cyclingSpeed"), speed);
        } else {
            System.out.println("Duration must be greater than zero.");
        }
    }

}
