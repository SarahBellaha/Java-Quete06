public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname) {
        this.firstname = firstname;
        this.aware = false;
    }

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String newFirstname) {
        this.firstname = newFirstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setAware(boolean newValue) {
        this.aware = newValue;
    }

    public String whoAmI() {
        return aware ? "Je m'appelle " + this.firstname + " et je suis aware." :
                "Je m'appelle " + this.firstname + " et je ne suis pas aware.";
    }
}
