package p14_09_2023.Zadatak2;

public class Reakcija {
    private String reaction;
    private String fullNameReact;

    public Reakcija(String reaction, String fullNameReact) {
        this.reaction = reaction;
        this.fullNameReact = fullNameReact;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    public String getFullNameReact() {
        return fullNameReact;
    }

    public void setFullNameReact(String fullNameReact) {
        this.fullNameReact = fullNameReact;
    }
}
