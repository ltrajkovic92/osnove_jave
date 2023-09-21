package d18_09_2023.Zadatak1;

public class AudioControl extends Control{
    private boolean isVolumeUp;

    public AudioControl(boolean isVolumeUp) {
        this.isVolumeUp = isVolumeUp;
    }

    @Override
    public void makeAction(VideoPlayer videoPlayer) {
        if (this.isVolumeUp) {
            if (videoPlayer.getVolume()<100) {
                videoPlayer.setVolume(videoPlayer.getVolume() + 1);
            } else {videoPlayer.setVolume(100);}
        } else {
            if (videoPlayer.getVolume()>0) {
                videoPlayer.setVolume(videoPlayer.getVolume() - 1);
            } else {videoPlayer.setVolume(0);}
        }
    }

    public boolean isVolumeUp() {
        return isVolumeUp;
    }

    public void setVolumeUp(boolean volumeUp) {
        isVolumeUp = volumeUp;
    }
}
