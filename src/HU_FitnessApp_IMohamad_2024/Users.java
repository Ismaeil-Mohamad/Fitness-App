package HU_FitnessApp_IMohamad_2024;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Users {
    private String name;
    private String surName;
    private int age;
    private double weight;
    private double height;
    private double vo2Max;
    private double bmi;
    private ArrayList<Double> weightHistory;
    private ArrayList<Double> bmiHistory;
    private ArrayList<Double> vo2MaxHistory;
    private LanguageManager languageManager;

    public Users(String name, String surName, int age, double weight, double height, LanguageManager languageManager) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.languageManager = languageManager;
        this.vo2Max = calculateVO2Max();
        this.bmi = calculateBMI();
        this.bmiHistory = new ArrayList<>();
        this.vo2MaxHistory = new ArrayList<>();
        this.weightHistory = new ArrayList<>();
        addHistory(weight, bmi, vo2Max);
        displayBMIResult(bmi);
    }

    public double calculateBMI() {
        double heightInMeters = height / 100.0;
        double bmi = weight / (heightInMeters * heightInMeters);
        return bmi;
    }

public void displayBMIResult(double bmi) {
    if (bmi <= 0) {
        System.out.println(languageManager.getPrompt("InvalidBMI"));
    } else if (bmi <= 18.5) {
        System.out.println(languageManager.getPrompt("underweight"));
    } else if (bmi <= 24.9) {
        System.out.println(languageManager.getPrompt("normalWeight"));
    } else if (bmi <= 29.9) {
        System.out.println(languageManager.getPrompt("Overweight"));
    } else if (bmi <= 34.9) {
        System.out.println(languageManager.getPrompt("Obesity1"));
    } else if (bmi <= 39.9) {
        System.out.println(languageManager.getPrompt("Obesity2"));
    } else if (bmi > 39.9) {
        System.out.println(languageManager.getPrompt("Obesity3"));
    } else {
        System.out.println(languageManager.getPrompt("extremeObesity"));
    }


}

    public double calculateIdealWeight() {
        return (height - 100) - ((height - 150) / 4);
    }

    public void checkWeight() {
        double idealWeight = calculateIdealWeight();
        if (weight > idealWeight) {
            System.out.println("You are over your ideal weight by " + (weight - idealWeight) + " kg.");
        } else if (weight < idealWeight) {
            System.out.println("You are under your ideal weight by " + (idealWeight - weight) + " kg.");
        } else {
            System.out.println("You are at your ideal weight.");
        }
    }

    public double calculateVO2Max() {
        return 206.3 - (0.67 * age);
    }

    public void addHistory(double newWeight, double newBmi, double newVo2Max) {
        weightHistory.add(newWeight);
        bmiHistory.add(newBmi);
        vo2MaxHistory.add(newVo2Max);
    }

    public void showHistory() {
        System.out.println(languageManager.getPrompt("your_history"));
        DecimalFormat formatType = new DecimalFormat("#.##");

        System.out.println(languageManager.getPrompt("weight_history") + weightHistory.stream().map(formatType::format).toList());
        System.out.println(languageManager.getPrompt("bmi_history") +        bmiHistory.stream().map(formatType::format).toList());
        System.out.println(languageManager.getPrompt("vo2_max_history" )+ vo2MaxHistory.stream().map(formatType::format).toList());
        System.out.println("---------------------------------------------");
    }
    public void updateUserData(double newWeight, double newHeight) {
        this.weight = newWeight;
        this.height = newHeight;
        this.bmi = calculateBMI();
        this.vo2Max = calculateVO2Max();
        addHistory(weight, bmi, vo2Max);
        displayBMIResult(bmi);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVo2Max() {
        return vo2Max;
    }

    public void setVo2Max(double vo2Max) {
        this.vo2Max = vo2Max;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getsurName() {
        return surName;
    }

    public void setsurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        DecimalFormat formatType = new DecimalFormat("#.##");
        return "User Information {" +
                "\nName='" + name + '\'' +
                "\nSurName='" + surName + '\'' +
                "\nAge=" + age +
                "\nWeight=" + formatType.format(weight) +
                "\nHeight=" + formatType.format(height) +
                "\nVo2Max=" + formatType.format(vo2Max) +
                "\nBmi=" + formatType.format(bmi) +
                '}';
    }
}
