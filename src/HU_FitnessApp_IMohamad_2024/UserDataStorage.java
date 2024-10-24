package HU_FitnessApp_IMohamad_2024;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class UserDataStorage {
    private final LanguageManager languageManager;

    public UserDataStorage(LanguageManager languageManager) {
        this.languageManager = languageManager;
    }

    public void saveUserData(Users user){
        Gson gson = new Gson();
                String jasonString = gson.toJson(user);
        try(FileWriter writer = new FileWriter("user_data.json")){
            writer.write(jasonString);
            System.out.println(languageManager.getPrompt("dataSaveSuccess"));
        } catch (IOException e) {
            throw new RuntimeException(languageManager.getPrompt("dataSaveError") + e.getMessage());
        }

    }
}
