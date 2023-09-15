package d11_09_2023.Zadatak3;

public class YoutubePlayer {
    private Video video;
    private int quality;
    private String mode;
    private int volume;
    private int currentTime;

    public YoutubePlayer () {
        this.quality = 144;
        this.volume = 75;
        this.mode = "mini player";
    }
    public void loadVideo (Video video) {
        this.video = video;
        this.currentTime = 0;
        video.view();
    }
    public void volumeUp () {
        this.volume += 10;
        if (this.volume > 100) {
            this.volume = 100;
        }
    }
    public void volumeDown () {
        this.volume -= 10;
        if (this.volume < 0) {
            this.volume = 0;
        }
    }
    public void setQuality (int downloadSpeed) {
        if (downloadSpeed < 2) {
            this.quality = 144;
        } else if (downloadSpeed < 4) {
            this.quality = 240;
        } else if (downloadSpeed < 6) {
            this.quality = 360;
        } else if (downloadSpeed < 8) {
            this.quality = 720;
        } else if (downloadSpeed >= 8) {
            this.quality = 1080;
        }
    }
    public void activateMiniPlayerMode () {
        this.mode = "mini player";
    }
    public void activateCinemaMode () {
        this.mode = "bioskopski";
    }
    public void activateFullScreenMode () {
        this.mode = "preko celog ekrana";
    }
    public void fastForward () {
        if (this.video != null) {
            this.currentTime += 10;
            if (this.currentTime > this.video.getLength()) {
                this.currentTime = this.video.getLength();
            }
        } else {
            System.out.println("Video nije ucitan! Ucitajte video.");
        }
    }
    public void rewind () {
        if (this.video != null) {
            this.currentTime -= 10;
            if (this.currentTime < 0) {
                this.currentTime = 0;
            }
        } else {
            System.out.println("Video nije ucitan! Ucitajte video.");
        }
    }
    public void printVolume () {
        int numberOfDashes = volume / 10;
        if (numberOfDashes == 0) {
            System.out.print("</");
        } else {
            System.out.print("<: ");
            for (int i = 0; i < numberOfDashes; i ++) {
                System.out.print("|");
            }
        }
        System.out.println();
    }
    public void printMode () {
        if (this.mode.equals("mini player")) {
            System.out.println("[]");
        } else if (this.mode.equals("bioskopski")) {
            System.out.println("[..]");
        } else {
            System.out.println("[||||]");
        }
    }
    public void printCurrentTime () {
        if (this.video != null) {
            int minute = this.currentTime/60;
            int second = this.currentTime % 60;
            int minuteTotal = this.video.getLength()/60;
            int secondTotal = this.video.getLength()%60;
            System.out.println(minute + ":" + second + " / " + minuteTotal + ":" + secondTotal);
        } else {
            System.out.println("Video nije ucitan! Ucitajte video.");
        }
    }
    public void printTimeline () {
        if (this.video != null) {
            int asterisk = this.currentTime * 100 / this.video.getLength();
            for (int i = 0; i < 100; i++) {
                if (i<asterisk) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
        } else {
            System.out.println("Video nije ucitan! Ucitajte video.");
        }
    }
    public void read () {
        if(this.video != null) {
            this.printCurrentTime();
            System.out.print("Zvuk ");
            this.printVolume();
            System.out.println();
            System.out.print("Timeline: ");
            this.printTimeline();
            System.out.println();
            System.out.println("Kvalitet: "+this.quality);
            System.out.println("Rezim: "+this.mode);
            System.out.println(this.video.getName());
            System.out.println("Likes: "+this.video.getLike()+" | Dislikes: "+this.video.getDislike());
            System.out.println(this.video.getViewers() + " Pregleda");
        }
        else {
            System.out.println("Video nije ucitan! Ucitajte video.");
        }
    }
    public String share () {
        if(this.video != null){
            return "https://youtu.be/"+this.video.getId();
        }
        return "Video nije ucitan";
    }

    public Video getVideo () {return this.video;}
    public int getQuality () {return this.quality;}
    public String getMode () {return this.mode;}
    public int getVolume() {return this.volume;}
    public int getCurrentTime () {return this.currentTime;}
}
