package HU_FitnessApp_IMohamad_2024;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class Running extends Activities{
    private final LanguageManager languageManager;

    public Running(String type, String description, LocalDateTime dateTime, float duration, int repeat, float distance, String device, float strengthWeight, LanguageManager languageManager) {
        super(languageManager, type, description, dateTime, duration, repeat, distance, device, strengthWeight);
        this.languageManager = languageManager;
    }

    void calculate() {
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("   *********");
        System.out.printf("%-20s: %.1f min%n", languageManager.getPrompt("Duration"), duration);
        System.out.printf("%-20s: %.1f km%n", languageManager.getPrompt("Distance"), distance);
        float speed = (distance / duration) * 60;
        System.out.printf("%-20s: %.2f km/h%n", languageManager.getPrompt("RunningSpeed"), speed);
    }

}
