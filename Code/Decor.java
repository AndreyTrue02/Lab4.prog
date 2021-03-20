
public class Decor {
    private String Stairs;

    public String getStairs() {
        return " Лестница";
    }

    private String Window;

    public String getWindow() {
        return " Окно";

    }

    private String Ceiling;

    public String getCeiling() {
        return " Потолок";
    }

    private String DampEarth;

    public String getDampEarth() {
        return " Сырой земле";

    }

    private String Sill;

    public String getSill() {
        return " Подоконник";

    }
    public String rail() {
        return "перилы ";

    }
    public static class Bed {
        public boolean getEngaged(){
            return true;
        }
        private String beds;

        public String getBeds() {
            return " кровать";
        }
    }
}
