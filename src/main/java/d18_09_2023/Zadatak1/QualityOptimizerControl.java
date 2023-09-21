package d18_09_2023.Zadatak1;

public class QualityOptimizerControl extends Control{
    private double internetSpeed;

    public QualityOptimizerControl(double internetSpeed) {
        this.internetSpeed = internetSpeed;
    }

    @Override
    public void makeAction(VideoPlayer videoPlayer) {
        double quality = this.internetSpeed * 10.1;
        if (quality > 0 && quality <= 144) {
            videoPlayer.setQuality(144);
        } else if (quality <= 240) {
            videoPlayer.setQuality(240);
        } else if (quality <= 360) {
            videoPlayer.setQuality(360);
        } else if (quality <= 480) {
            videoPlayer.setQuality(480);
        } else if (quality <= 720) {
            videoPlayer.setQuality(720);
        } else {videoPlayer.setQuality(1080);}
    }

    public double getInternetSpeed() {
        return internetSpeed;
    }

    public void setInternetSpeed(double internetSpeed) {
        this.internetSpeed = internetSpeed;
    }
}
