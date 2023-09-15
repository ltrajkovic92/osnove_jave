package d11_09_2023.Zadatak3;

public class Video {
    private String id;
    private String name;
    private int length;
    private int like;
    private int dislike;
    private int viewers;

    public Video (String id, String name, int length) {
        this.id = id;
        this.name = name;
        this.length = length;
    }
    public void like () {
        this.like += 1;
    }
    public void dislike () {
        this.dislike += 1;
    }
    public void view () {
        this.viewers += 1;
    }
    public String getId () {return this.id;}
    public String getName () {return this.name;}
    public int getLength () {return this.length;}
    public int getLike () {return this.like;}
    public int getDislike () {return this.dislike;}
    public int getViewers () {return this.viewers;}
}
