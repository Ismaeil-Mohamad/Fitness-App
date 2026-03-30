package HU_FitnessApp_IMohamad_2024;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static LanguageManager selectLanguage(Scanner input, LanguageManager languageManager) {
        int choice = 0;
        boolean validChoice = false;

        while (!validChoice) {
            try {
                System.out.println("Choose a language: ");
                System.out.println("1. English");
                System.out.println("2. Dutch");
                System.out.println("3. Turkish");

                choice = input.nextInt();
                input.nextLine();
                if (choice < 1 || choice > 3) {
                    System.out.println(languageManager.getPrompt("numMessage"));                }
                validChoice = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter 1 for English or 2 for Dutch of 3 for Turkish.");
                input.nextLine();
            }
        }
        return new LanguageManager(choice);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LanguageManager languageManager = selectLanguage(input,new LanguageManager(1));
        UserDataStorage userDataStorage = new UserDataStorage(languageManager);
        UserDataLoader userDataLoader = new UserDataLoader(languageManager);
        Users loadedUser = userDataLoader.loadUserInfo();


        DecimalFormat formatType = new DecimalFormat("#.##");

        if (loadedUser != null) {
            System.out.println(languageManager.getPrompt("lang_name") + loadedUser.getName());
            System.out.println(languageManager.getPrompt("lang_last_name")+ loadedUser.getsurName());
            System.out.println(languageManager.getPrompt("lang_age")+ loadedUser.getAge());
            System.out.println(languageManager.getPrompt("lang_weight")+ loadedUser.getWeight());
            System.out.println(languageManager.getPrompt("lang_height") + loadedUser.getHeight());
            System.out.println(languageManager.getPrompt("lang_bmi") + formatType.format(loadedUser.calculateBMI()));
            System.out.println(languageManager.getPrompt("lang_vo2max") + formatType.format(loadedUser.calculateVO2Max()));
        } else {
            System.out.println("No user data found. Please enter new user information.");
        }

        boolean isRunning = true;
        while (isRunning) {
            try {
                System.out.println("**********************************");
                System.out.print(languageManager.getPrompt("name"));
                String name = input.nextLine().trim();
                while (name.isEmpty() || !name.matches("[a-zA-Z]+")) {
                    System.out.println(languageManager.getPrompt("message"));
                    System.out.print(languageManager.getPrompt("name"));
                    name = input.nextLine().trim();
                }

                System.out.print(languageManager.getPrompt("surname"));
                String surName = input.nextLine().trim();
                while (surName.isEmpty() || !surName.matches("[a-zA-Z]+")) {
                    System.out.println(languageManager.getPrompt("message"));
                    System.out.print(languageManager.getPrompt("surname"));
                    surName = input.nextLine().trim();
                }

                System.out.print(languageManager.getPrompt("age"));
                int age;
                while (true) {
                    try {
                        age = input.nextInt();
                        if (age <= 0) {
                            throw new InputMismatchException();
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println(languageManager.getPrompt("numMessage"));
                        System.out.print(languageManager.getPrompt("age"));
                        input.nextLine();
                    }
                }

                System.out.print(languageManager.getPrompt("weight"));
                double weight;
                while (true) {
                    try {
                        weight = input.nextFloat();
                        if (weight <= 0) {
                            throw new InputMismatchException();
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println(languageManager.getPrompt("numMessage"));
                        System.out.print(languageManager.getPrompt("weight"));
                        input.nextLine();
                    }
                }
                input.nextLine();

                System.out.print(languageManager.getPrompt("height"));
                double height;
                while (true) {
                    try {
                        height = input.nextFloat();
                        if (height <= 0) {
                            throw new InputMismatchException();
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println(languageManager.getPrompt("numMessage"));
                        System.out.print(languageManager.getPrompt("height"));
                        input.nextLine();
                    }
                }
                input.nextLine();

                Users users = new Users(name, surName, age, weight, height, languageManager);
                System.out.println(languageManager.getPrompt("lang_bmi") + formatType.format(users.calculateBMI()));
                System.out.println(languageManager.getPrompt("lang_vo2max") + formatType.format(users.calculateVO2Max()));
                 users.showHistory();

                userDataStorage.saveUserData(users);
                loadedUser = users;
                System.out.println(languageManager.getPrompt("ChooseACoach"));
                System.out.println(" 1. physiotherapist");
                System.out.println(" 2. fitness instructor");
                int coachChoice = input.nextInt();
                input.nextLine();

                Coaches coach = null;
                switch (coachChoice) {
                    case 1:
                        System.out.print(languageManager.getPrompt("enterCoachName"));
                        name = input.nextLine();
                        System.out.print(languageManager.getPrompt("enterCoachSurname"));
                        surName = input.nextLine();
                        coach = new Coaches(name, surName);
                        System.out.println(languageManager.getPrompt("selectedCoach") + name + " " + surName);
                        break;
                    case 2:
                        System.out.print(languageManager.getPrompt("enterCoachName"));
                        name = input.nextLine();
                        System.out.print(languageManager.getPrompt("enterCoachSurname"));
                        surName = input.nextLine();
                        coach = new Coaches(name, surName);
                        System.out.println(languageManager.getPrompt("selectedCoach") + name + " " + surName);
                        break;
                    default:
                        System.out.println(languageManager.getPrompt("invalidCoachChoice"));
                        continue; // Skip the rest of the loop if the choice is invalid
                }

                System.out.println(languageManager.getPrompt("chooseActivity"));
                System.out.println("1. " + languageManager.getPrompt("cycling"));
                System.out.println("2. " + languageManager.getPrompt("running"));
                System.out.println("3. " + languageManager.getPrompt("strengthTraining"));
                System.out.println("4. " + languageManager.getPrompt("swimming"));

                int activityChoice = input.nextInt();
                input.nextLine();
                Activities activity = null;

                switch (activityChoice) {
                    case 1:
                        System.out.print(languageManager.getPrompt("enterDistance"));
                        float distance = input.nextFloat();
                        System.out.print(languageManager.getPrompt("enterDuration"));
                        float duration = input.nextFloat();
                        input.nextLine();
                        activity = new Cycling(languageManager.getPrompt("cycling"),
                                languageManager.getPrompt("morningRide"),
                                LocalDateTime.now(), duration, 1, distance,
                                languageManager.getPrompt("bike"), languageManager);
                        break;
                    case 2:
                        System.out.print(languageManager.getPrompt("enterDistance"));
                        distance = input.nextFloat();
                        System.out.print(languageManager.getPrompt("enterDuration"));
                        duration = input.nextFloat();
                        input.nextLine();
                        activity = new Running(languageManager.getPrompt("running"), languageManager.getPrompt("morning_run"), LocalDateTime.now(), duration, 0 , distance,  languageManager.getPrompt("no_equipment"), 0, languageManager);

                        break;
                    case 3:
                        System.out.print(languageManager.getPrompt("enterWeight"));
                        float strengthWeight = input.nextFloat();
                        System.out.print(languageManager.getPrompt("enterDuration"));
                        duration = input.nextFloat();
                        System.out.print(languageManager.getPrompt("repeatIs"));
                        float repeat = input.nextFloat();
                        input.nextLine();
                        activity = new StrengthTraining(languageManager, languageManager.getPrompt("gym_session"),  languageManager.getPrompt("morning_exercise"), LocalDateTime.now(), duration, repeat, 0,  languageManager.getPrompt("barbells"), strengthWeight);
                        break;
                    case 4:
                        System.out.print(languageManager.getPrompt("enterPoolLength"));
                        float poolLength = input.nextFloat();
                        System.out.print(languageManager.getPrompt("enterRepeats"));
                        int repeats = input.nextInt();
                        System.out.print(languageManager.getPrompt("enterDuration"));
                        duration = input.nextFloat();
                        input.nextLine();
                        activity = new Swimming(languageManager,
                                languageManager.getPrompt("swimming"),
                                languageManager.getPrompt("morning_swim"),
                                LocalDateTime.now(),
                                duration,
                                repeats,
                                poolLength,
                                languageManager.getPrompt("no_equipment"),
                                0
                                );

                        break;
                    default:
                        System.out.println(languageManager.getPrompt("invalidChoice"));
                        break;
                }

                if (activity != null) {
                    System.out.println(activity);
                    activity.calculate();
                }

                boolean validInput = false;
                while (!validInput) {
                    System.out.print(languageManager.getPrompt("continuePrompt"));
                    String response = input.nextLine().trim();

                    try {
                        if (response.equalsIgnoreCase(languageManager.getPrompt("no"))) {
                            System.out.println(languageManager.getPrompt("closing"));
                            isRunning = false;
                            validInput = true;
                        } else if (response.equalsIgnoreCase(languageManager.getPrompt("yes"))) {
                            validInput = true;
                        } else {
                            throw new InputMismatchException();
                        }
                    } catch (InputMismatchException e) {
                        System.out.println(languageManager.getPrompt("invalidInput"));
                    }
                }

            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                input.nextLine();
            }
        }

        input.close();
    }
}
