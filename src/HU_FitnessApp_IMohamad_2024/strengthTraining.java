package HU_FitnessApp_IMohamad_2024;

import java.time.LocalDateTime;

    class StrengthTraining extends Activities {
        private final LanguageManager languageManager;

        public StrengthTraining(LanguageManager languageManager, String type, String description, LocalDateTime dateTime, float duration, float repeat, float distance, String device, float strengthWeight) {
            super(languageManager, type, description, dateTime, duration, (int) repeat, distance, device, strengthWeight);
            this.languageManager = languageManager;
        }

        @Override
        void calculate() {
            if (repeat == 0) {
                System.out.println(languageManager.getPrompt("repeatZero"));
                return;
            }

            float workload = strengthWeight * repeat;

            System.out.println("   *********");
            System.out.printf("%-20s: %.1f kg%n", languageManager.getPrompt("weightIs"), strengthWeight);
            System.out.printf("%-20s: %d%n", languageManager.getPrompt("repeatIs"), repeat);
            System.out.printf("%-20s: %.1f kg%n", languageManager.getPrompt("totalWorkload"), workload);
        }
    }
