package HU_FitnessApp_IMohamad_2024;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Activities {
    private final LanguageManager languageManager;
    protected String type;

    protected String description;
    protected LocalDateTime dateTime;
    protected float duration;
    protected int repeat;
    protected float distance;
    protected String device;
    protected float strengthWeight;

    public Activities(LanguageManager languageManager, String type, String description, LocalDateTime dateTime, float duration, int repeat, float distance, String device, float strengthWeight) {
        this.languageManager = languageManager;
        this.type = type;
        this.description = description;
        this.dateTime = dateTime;
        this.duration = duration;
        this.repeat = repeat;
        this.distance = distance;
        this.device = device;
        this.strengthWeight = strengthWeight;
    }

    public LanguageManager getLanguageManager() {
        return languageManager;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public float getStrengthWeight() {
        return strengthWeight;
    }

    public void setStrengthWeight(float strengthWeight) {
        this.strengthWeight = strengthWeight;
    }

    abstract void calculate();


    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s : %s\n", languageManager.getPrompt("activity"), type));
        if (description != null && !description.contains("not found")) {
            sb.append(String.format("%s : %s\n", languageManager.getPrompt("description"), description));
        }
        sb.append(String.format("%s : %s\n", languageManager.getPrompt("dateTime"), dateTime.format(formatter)));
        sb.append(String.format("%s : %.1f min\n", languageManager.getPrompt("duration"), duration));
        if (distance > 0) {
            sb.append(String.format("%s : %.1f km\n", languageManager.getPrompt("distance"), distance));
        }
        if (device != null && !device.contains("not found")) {
            sb.append(String.format("%s : %s\n", languageManager.getPrompt("device"), device));
        }
        if (strengthWeight > 0) {
            sb.append(String.format("%s : %.1f kg\n", languageManager.getPrompt("weight1"), strengthWeight));
        }
        if (repeat > 1) {
            sb.append(String.format("%s : %d\n", languageManager.getPrompt("repetitions"), repeat));
        }
        return sb.toString();
    }
}
