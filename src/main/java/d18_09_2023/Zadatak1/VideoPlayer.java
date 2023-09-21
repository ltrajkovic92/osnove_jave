package d18_09_2023.Zadatak1;

public class VideoPlayer {
    private int lenght;
    private int currentTime;
    private int volume;
    private int quality;

    public VideoPlayer(int lenght, int currentTime, int volume, int quality) {
        this.lenght = lenght;
        this.currentTime = currentTime;
        this.volume = volume;
        this.quality = quality;
    }
    public void print () {
        int min = this.currentTime/60;
        int sec = this.currentTime%60;
        System.out.println("Trenutno vreme: " + min + ":" + sec);
        System.out.println("Jacina zvuka: " + this.volume);
        System.out.println("Kvalitet: " + this.quality + "p");
        System.out.println();
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
