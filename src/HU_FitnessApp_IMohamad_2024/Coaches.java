package HU_FitnessApp_IMohamad_2024;

public class Coaches{
    String coachName;
    String coachSurName;

    public Coaches( String coachName, String coachSurName) {
        this.coachName = coachName;
        this.coachSurName = coachSurName;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getCoachSurName() {
        return coachSurName;
    }

    public void setCoachSurName(String coachSurName) {
        this.coachSurName = coachSurName;
    }

    @Override
    public String toString() {
        return
                "\ncoachName = " + coachName + '\'' +
                        "\ncoachSurName = " + coachSurName;

    }
}
