package HU_FitnessApp_IMohamad_2024;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class Swimming extends Activities {
    private final LanguageManager languageManager;

    public Swimming(LanguageManager languageManager, String type, String description, LocalDateTime dateTime, float duration, int repeat, float distance, String device, float strengthWeight) {
        super(languageManager, type, description, dateTime, duration, repeat, distance, device, strengthWeight);
        this.languageManager = languageManager;
    }

    @Override
    void calculate() {
        DecimalFormat df = new DecimalFormat("#.##");
        float totalDistance = distance * repeat;

        System.out.println("   *********");
        System.out.printf("%-20s: %.1f meters%n", languageManager.getPrompt("enterPoolLength"), distance);
        System.out.printf("%-20s: %d%n", languageManager.getPrompt("enterRepeats"), repeat);
        System.out.printf("%-20s: %.2f meters%n", languageManager.getPrompt("TotalSwimmingDistance"), totalDistance);
    }
}
