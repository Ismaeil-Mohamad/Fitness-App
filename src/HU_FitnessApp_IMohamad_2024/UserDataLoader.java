package HU_FitnessApp_IMohamad_2024;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserDataLoader {
    private final LanguageManager languageManager;

    public UserDataLoader(LanguageManager languageManager) {
        this.languageManager = languageManager;
    }

    public Users loadUserInfo(){
Gson gson = new Gson();
Users users = null;

try (BufferedReader  reader = new BufferedReader(new FileReader("user_data.json"))){
    users = gson.fromJson(reader,Users.class);
    System.out.println(languageManager.getPrompt("dataLoadSuccess"));
} catch (IOException e) {
    System.err.println(languageManager.getPrompt("dataLoadError") + e.getMessage());
}
return users;
}
}
