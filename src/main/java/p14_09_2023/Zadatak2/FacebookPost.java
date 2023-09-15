package p14_09_2023.Zadatak2;

import java.util.ArrayList;

public class FacebookPost {
    private String fullNamePost;
    private String textPost;
    private ArrayList<Reakcija> reaction;

    public FacebookPost(String fullNamePost, String textPost) {
        this.fullNamePost = fullNamePost;
        this.textPost = textPost;
        this.reaction = new ArrayList<>();
    }
    public void react (Reakcija newReaction) {
        this.reaction.add(newReaction);
    }
    private int returnNoReaction (String type) {
        int reactionNo = 0;
        for (int i = 0; i < this.reaction.size(); i++) {
            if (this.reaction.get(i).getReaction().equals(type)) {
                reactionNo++;
            }
        }
        return reactionNo;
    }
    public void print () {
        System.out.println(this.fullNamePost);
        System.out.println(this.textPost);
        System.out.print("Smajli " + returnNoReaction("smajli") + "|" + "Like " +
                returnNoReaction("like") + "| Srce " + returnNoReaction("srce"));
    }
}
