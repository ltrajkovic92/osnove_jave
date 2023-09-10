package d08_09_2023.Zadatak2;

public class FacebookPost {

    public String user;
    public String profile;
    public String post;
    public int likes;
    public int shares;

    public void like () {
        this.likes = this.likes + 1;
    }
    public void dislike () {
        this.likes = this.likes - 1;
        if (this.likes < 0) {
            this.likes = 0;
        }
    }
    public void share () {
        this.shares = this.shares + 1;
    }
    public void print () {
        System.out.println(this.user + " >>> " + this.profile);
        System.out.println(this.post);
        System.out.println("Likes: " + this.likes + " | Shares " + this.shares);
    }
}
