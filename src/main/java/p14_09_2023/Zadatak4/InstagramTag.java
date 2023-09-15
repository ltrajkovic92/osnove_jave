package p14_09_2023.Zadatak4;

public class InstagramTag {
    private int xCoordinate;
    private int yCoordinate;
    private InstagramUser taggetUser;

    public InstagramTag(int xCoordinate, int yCoordinate, InstagramUser taggetUser) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.taggetUser = taggetUser;
    }
    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public InstagramUser getTaggetUser() {
        return taggetUser;
    }
}
