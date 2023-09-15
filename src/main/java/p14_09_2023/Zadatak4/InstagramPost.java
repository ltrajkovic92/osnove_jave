package p14_09_2023.Zadatak4;

import java.util.ArrayList;

public class InstagramPost {
    private ArrayList<InstagramImage> images;
    private String description;

    public InstagramPost(String description) {
        this.description = description;
        this.images = new ArrayList<>();
    }

    public void addImage (InstagramImage image) {this.images.add(image);}

    public void print(){
        for (int i = 0; i < images.size(); i++) {
            images.get(i).print();
        }
        System.out.println("Opis: "+this.description);
    }


}
