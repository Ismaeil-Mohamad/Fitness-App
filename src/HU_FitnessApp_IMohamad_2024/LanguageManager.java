package HU_FitnessApp_IMohamad_2024;

import java.util.HashMap;

public class LanguageManager {
    private final HashMap<String, String> promptsEN;
    private final HashMap<String, String> promptsNL;
    private final HashMap<String, String> promptsTR;

    private final HashMap<String, String> selectedPrompts;

    public LanguageManager(int choice) {
        promptsEN = new HashMap<>();
        promptsNL = new HashMap<>();
        promptsTR = new HashMap<>();

        loadPrompts();
        switch (choice) {
            case 1:
                selectedPrompts = promptsEN;
                break;
            case 2:
                selectedPrompts = promptsNL;
                break;
            case 3:
                selectedPrompts = promptsTR;
                break;
            default:
                System.out.println("Invalid choice, defaulting to English.");
                selectedPrompts = promptsEN;
                break;
        }
    }


    private void loadPrompts() {
        promptsEN.put("name", "Enter your name: ");
        promptsEN.put("surname", "Enter your last name: ");
        promptsEN.put("message", "Invalid input. Please enter letters only. ");
        promptsEN.put("age", "Enter your age: ");
        promptsEN.put("numMessage", "Invalid input. Please enter only numbers. ");
        promptsEN.put("weight", "Enter your weight in kg: ");
        promptsEN.put("height", "Enter your height in cm: ");
        promptsEN.put("underweight", "Underweight: ");
        promptsEN.put("normalWeight", "Normal weight. Good job!: ");
        promptsEN.put("Overweight", "Overweight. Consider a healthier lifestyle. ");
        promptsEN.put("Obesity1", "Obesity (Class 1). Seek advice.: ");
        promptsEN.put("Obesity2", "Obesity (Class 2). It's important to take action. ");
        promptsEN.put("Obesity3", "Obesity (Class 3). Please consult a doctor. ");
        promptsEN.put("extremeObesity", "Extreme obesitas ");
        promptsEN.put("InvalidBMI", "Invalid BMI value. ");
        promptsEN.put("activity", "Activity: ");
        promptsEN.put("description", "Description: ");
        promptsEN.put("dateTime", "Date and Time: ");
        promptsEN.put("duration", "Duration: ");
        promptsEN.put("repetitions", "Repetitions: ");
        promptsEN.put("distance", "Distance: ");
        promptsEN.put("device", "Device: ");
        promptsEN.put("weight1", "Weight: ");
        promptsNL.put("activity", "Activiteit: ");
        promptsNL.put("description", "Beschrijving: ");
        promptsNL.put("dateTime", "Datum en Tijd: ");
        promptsNL.put("duration", "Duur: ");
        promptsNL.put("repetitions", "Herhalingen: ");
        promptsNL.put("distance", "Afstand: ");
        promptsNL.put("device", "Apparaat: ");
        promptsNL.put("weight1", "Gewicht: ");
        promptsEN.put("dataSaveSuccess", "User data saved successfully.");
        promptsEN.put("dataSaveError", "Error saving user data: ");
        promptsEN.put("dataLoadSuccess", "User data loaded successfully.");
        promptsEN.put("dataLoadError", "Error loading user data: ");
        promptsEN.put("enterCoachName", "Enter the coach's name:");
        promptsEN.put("enterCoachSurname", "Enter the coach's last name ");
        promptsEN.put("selectedCoach", "Name of selected coach: ");
        promptsEN.put("ChooseACoach", "Choose a Coach: ");
        promptsEN.put("chooseActivity", "Choose an activity: ");
        promptsEN.put("cycling", "Cycling");
        promptsEN.put("cyclingSpeed", " Cycling speed ");
        promptsEN.put("running", "Running");
        promptsEN.put("strengthTraining", "Strength Training");
        promptsEN.put("swimming", "Swimming");
        promptsEN.put("enterDistance", "Enter distance in kilometers: ");
        promptsEN.put("enterDuration", "Enter duration in minutes: ");
        promptsEN.put("RunningSpeed", "Running Speed : ");
        promptsEN.put("Distance", "Distance : ");
        promptsEN.put("Duration", "Duration : ");
        promptsEN.put("enterWeight", "Enter the weight in kilograms: ");
        promptsEN.put("enterRepeats", "Enter the number of repeats: ");
        promptsEN.put("enterPoolLength", "Enter pool length in meters: ");
        promptsEN.put("invalidChoice", "Invalid activity choice");
        promptsEN.put("continuePrompt", "Do you want to continue? (yes/no): ");
        promptsEN.put("yes", "yes");
        promptsEN.put("no", "no");
        promptsEN.put("invalidInput", "Invalid input. Please enter 'yes' or 'no'.");
        promptsEN.put("invalidNumber", "Invalid input. Please enter a valid number.");
        promptsEN.put("closing", "Closing...");
        promptsEN.put("repeatZero", "Repeat cannot be zero.");
        promptsEN.put("weightIs", "The weight is : ");
        promptsEN.put("repeatIs", "The repeat is : ");
        promptsEN.put("totalWorkload", "The total workload is : ");
        promptsEN.put("enterPoolLength", "Swimming pool length :");
        promptsEN.put("enterRepeats", "Number of lanes : ");
        promptsEN.put("TotalSwimmingDistance", "Total swimming distance : ");

        promptsNL.put("name", "Voer uw naam in: ");
        promptsNL.put("surname", "Voer uw achternaam in : ");
        promptsNL.put("message", "Ongeldige invoer. Voer alleen letters in. ");
        promptsNL.put("age", "Voer uw leeftijd in : ");
        promptsNL.put("numMessage", "Ongeldige invoer. Voer alleen cijfers in.: ");
        promptsNL.put("weight", "Voer uw gewicht in kg : ");
        promptsNL.put("height", "Voer uw lengte in cm : ");
        promptsNL.put("underweight", "Ondergewicht  ");
        promptsNL.put("normalWeight", "Normaal gewicht. Goed gedaan! ");
        promptsNL.put("Overweight", "Overgewicht. Overweeg een gezondere levensstijl. ");
        promptsNL.put("Obesity1", "Obesitas (Klasse 1). Zoek advies. ");
        promptsNL.put("Obesity2", "Obesitas (Klasse 2). Het is belangrijk om actie te ondernemen. ");
        promptsNL.put("Obesity3", "Obesitas (klasse 3). Raadpleeg een arts.");
        promptsNL.put("extremeObesity", "Extreem overgewicht");
        promptsEN.put("InvalidBMI", "Ongeldige BMI-waarde.. ");
        promptsNL.put("dataSaveSuccess", "Gebruikersgegevens succesvol opgeslagen.");
        promptsNL.put("dataSaveError", "Fout bij het opslaan van gebruikersgegevens : ");
        promptsNL.put("dataLoadSuccess", "Gebruikersgegevens succesvol geladen.");
        promptsNL.put("dataLoadError", "Fout bij het laden van gebruikersgegevens : ");
        promptsNL.put("enterCoachName", "Voer de naam van de coach in:");
        promptsNL.put("enterCoachSurname", "Voer de achternaam van de coach in : ");
        promptsNL.put("selectedCoach", "Naam van de geselecteerde coach :");
        promptsNL.put("ChooseACoach", "Kies een coach : ");
        promptsNL.put("chooseActivity", "Kies een activiteit: ");
        promptsNL.put("cycling", "Fietsen : ");
        promptsNL.put("running", "Hardlopen : ");
        promptsNL.put("strengthTraining", "Krachttraining : ");
        promptsNL.put("swimming", "Zwemmen : ");
        promptsNL.put("enterDistance", "Voer afstand in kilometers in : ");
        promptsNL.put("enterDuration", "Voer duur in minuten in : ");
        promptsNL.put("RunningSpeed", "Loopsnelheid: ");
        promptsNL.put("Distance", "Afstand : ");
        promptsNL.put("Duration", "Duur : ");
        promptsNL.put("cyclingSpeed", "Fietssnelheid : ");
        promptsNL.put("enterWeight", "Voer het gewicht in kilogrammen in: ");
        promptsNL.put("enterRepeats", "Voer het aantal herhalingen in: ");
        promptsNL.put("enterPoolLength", "Voer de zwembadlengte in meters in: ");
        promptsNL.put("invalidChoice", "Ongeldige keuze voor activiteit");
        promptsNL.put("continuePrompt", "Wil je doorgaan? (ja/nee): ");
        promptsNL.put("yes", "ja");
        promptsNL.put("no", "nee");
        promptsNL.put("invalidInput", "Ongeldige invoer. Voer 'ja' of 'nee' in.");
        promptsNL.put("invalidNumber", "Ongeldige invoer. Voer een geldig nummer in.");
        promptsNL.put("closing", "Afsluiten...");
        promptsNL.put("repeatZero", "Herhaling kan niet nul zijn.");
        promptsNL.put("weightIs", "Het gewicht is : ");
        promptsNL.put("repeatIs", "De herhaling is : ");
        promptsNL.put("totalWorkload", "De totale werkbelasting is : ");
        promptsNL.put("enterPoolLength", "Lengte zwembad :");
        promptsNL.put("enterRepeats", "Aantal banen : ");
        promptsNL.put("TotalSwimmingDistance", "Totale zwemafstand : ");

        promptsTR.put("name", "Adınızı girin: ");
        promptsTR.put("surname", "Soyadınızı girin: ");
        promptsTR.put("message", "Geçersiz giriş. Lütfen sadece harf girin.");
        promptsTR.put("age", "Yaşınızı girin: ");
        promptsTR.put("numMessage", "Geçersiz giriş. Lütfen sadece rakam girin.: ");
        promptsTR.put("weight", "Kilonuzu kilogram cinsinden girin: ");
        promptsTR.put("height", "Boyunuzu santimetre cinsinden girin: ");
        promptsTR.put("underweight", "Zayıf");
        promptsTR.put("normalWeight", "Normal kiloda. Tebrikler!");
        promptsTR.put("Overweight", "Fazla kilolu. Daha sağlıklı bir yaşam tarzını düşünün.");
        promptsTR.put("Obesity1", "Obezite (Sınıf 1). Tavsiye alın.");
        promptsTR.put("Obesity2", "Obezite (Sınıf 2). Harekete geçmek önemlidir.");
        promptsTR.put("Obesity3", "Obezite (Sınıf 3). Bir doktora danışın.");
        promptsTR.put("extremeObesity", "Aşırı obezite");
        promptsTR.put("InvalidBMI", "Geçersiz BMI değeri.");
        promptsTR.put("dataSaveSuccess", "Kullanıcı verileri başarıyla kaydedildi.");
        promptsTR.put("dataSaveError", "Kullanıcı verileri kaydedilirken hata oluştu: ");
        promptsTR.put("dataLoadSuccess", "Kullanıcı verileri başarıyla yüklendi.");
        promptsTR.put("dataLoadError", "Kullanıcı verileri yüklenirken hata oluştu: ");
        promptsTR.put("enterCoachName", "Koçun adını girin:");
        promptsTR.put("enterCoachSurname", "Koçun soyadını girin: ");
        promptsTR.put("selectedCoach", "Seçilen koçun adı:");
        promptsTR.put("ChooseACoach", "Bir koç seçin: ");
        promptsTR.put("chooseActivity", "Bir aktivite seçin: ");
        promptsTR.put("cycling", "Bisiklet: ");
        promptsTR.put("running", "Koşu: ");
        promptsTR.put("strengthTraining", "Kuvvet antrenmanı: ");
        promptsTR.put("swimming", "Yüzme: ");
        promptsTR.put("enterDistance", "Mesafeyi kilometre cinsinden girin: ");
        promptsTR.put("enterDuration", "Süreyi dakika cinsinden girin: ");
        promptsTR.put("RunningSpeed", "Koşu hızı: ");
        promptsTR.put("Distance", "Mesafe: ");
        promptsTR.put("Duration", "Süre: ");
        promptsTR.put("cyclingSpeed", "Bisiklet hızı: ");
        promptsTR.put("enterWeight", "Ağırlığı kilogram cinsinden girin: ");
        promptsTR.put("enterRepeats", "Tekrar sayısını girin: ");
        promptsTR.put("enterPoolLength", "Havuz uzunluğunu metre cinsinden girin: ");
        promptsTR.put("invalidChoice", "Geçersiz aktivite seçimi");
        promptsTR.put("continuePrompt", "Devam etmek istiyor musunuz? (evet/hayır): ");
        promptsTR.put("yes", "evet");
        promptsTR.put("no", "hayır");
        promptsTR.put("invalidInput", "Geçersiz giriş. 'evet' veya 'hayır' girin.");
        promptsTR.put("invalidNumber", "Geçersiz giriş. Geçerli bir sayı girin.");
        promptsTR.put("closing", "Kapatılıyor...");
        promptsTR.put("repeatZero", "Tekrar sıfır olamaz.");
        promptsTR.put("weightIs", "Ağırlık : ");
        promptsTR.put("repeatIs", "Tekrar: ");
        promptsTR.put("totalWorkload", "Toplam iş yükü: ");
        promptsTR.put("enterPoolLength", "Havuz uzunluğu :");
        promptsTR.put("enterRepeats", "Havuz turları: ");
        promptsTR.put("TotalSwimmingDistance", "Toplam yüzme mesafesi: ");
        promptsTR.put("weight1", "Ağırlik : ");
        promptsTR.put("device", "Cihaz: ");
        promptsTR.put("activity", "Aktivite: ");
        promptsTR.put("description", "Açıklama: ");
        promptsTR.put("dateTime", "Tarih ve Saat: ");
        promptsTR.put("duration", "Süre: ");
        promptsTR.put("repetitions", "Tekrarlar: ");
        promptsTR.put("distance", "Mesafe: ");

        promptsNL.put("morningRide", "Ochtendrit");
        promptsNL.put("bike", "Fiets");


        promptsEN.put("morningRide", "Morning Ride");
        promptsEN.put("bike", "Bike");




        promptsTR.put("morningRide", "Sabah Turu");
        promptsTR.put("bike", "Bisiklet");


        promptsNL.put("running", "Hardlopen");
        promptsNL.put("morning_run", "Ochtendloop");
        promptsNL.put("no_equipment", "Geen Apparatuur");
        promptsNL.put("morning_swim", "Ochtendzwemmen");
        promptsNL.put("gym_session", "Fitnesssessie: ");



        promptsEN.put("running", "Running");
        promptsEN.put("morning_run", "Morning Run");
        promptsEN.put("no_equipment", "No Equipment");
        promptsEN.put("morning_swim", "Morning Swim");
        promptsEN.put("gym_session", "Gym session: ");



        promptsTR.put("running", "Koşu");
        promptsTR.put("morning_run", "Sabah Koşusu");
        promptsTR.put("no_equipment", "Ekipmansız");
        promptsTR.put("morning_swim", "Sabah Yüzme");
        promptsTR.put("gym_session", "Spor salonu oturumu: ");

        promptsNL.put("weight_history", "Gewichtsgeschiedenis: ");
        promptsEN.put("weight_history", "Weight History: ");
        promptsTR.put("weight_history", "Ağırlık Geçmişi: ");

        promptsNL.put("bmi_history", "BMI Geschiedenis: ");
        promptsEN.put("bmi_history", "BMI History: ");
        promptsTR.put("bmi_history", "BMI Geçmişi: ");

        promptsNL.put("vo2_max_history", "VO2 Max Geschiedenis: ");
        promptsEN.put("vo2_max_history", "VO2 Max History: ");
        promptsTR.put("vo2_max_history", "VO2 Max Geçmişi: ");

        promptsNL.put("your_history", "Jouw Geschiedenis: ");
        promptsEN.put("your_history", "Your History: ");
        promptsTR.put("your_history", "Geçmişiniz: ");

        promptsNL.put("morning_exercise", "Ochtend oefening");
        promptsEN.put("morning_exercise", "Morning exercise");
        promptsTR.put("morning_exercise", "Sabah egzersizi");

        promptsNL.put("barbells", "Halters");
        promptsEN.put("barbells", "Barbells");
        promptsTR.put("barbells", "Halterler");
















    }

    public String getPrompt(String key) {

        return selectedPrompts.get(key);
    }


}
