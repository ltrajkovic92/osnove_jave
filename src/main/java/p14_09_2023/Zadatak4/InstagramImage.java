package p14_09_2023.Zadatak4;

import java.util.ArrayList;

public class InstagramImage {
    private ArrayList<InstagramTag> tags;
    private int width;
    private int height;
    private String link;

    public InstagramImage(int width, int height, String link) {
        this.width = width;
        this.height = height;
        this.link = link;
        this.tags = new ArrayList<>();
    }
    public void addTag (InstagramTag tag) {this.tags.add(tag);}
    public ArrayList<InstagramTag> getTags() {
        return tags;
    }

    public void print (){
        System.out.println("Slika ima sirinu: " + this.width + ", visinu: " + this.height);
        System.out.println("Putanja slike je: " + this.link);
        System.out.println("Tagovani: ");
        for (int i = 0; i < this.tags.size(); i++) {
            this.tags.get(i).getTaggetUser().print();
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getLink() {
        return link;
    }
}
