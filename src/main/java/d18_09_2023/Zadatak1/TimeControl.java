package d18_09_2023.Zadatak1;

public class TimeControl extends Control{
    private boolean isForward;

    public TimeControl(boolean isForward) {
        this.isForward = isForward;
    }
    public void makeAction (VideoPlayer videoPlayer) {
        if (this.isForward) {
            if (videoPlayer.getCurrentTime() + 15 <= videoPlayer.getLenght()) {
                videoPlayer.setCurrentTime(videoPlayer.getCurrentTime() + 15);
            } else {
                videoPlayer.setCurrentTime(videoPlayer.getCurrentTime());
            }
        } else {
            if (videoPlayer.getCurrentTime() - 15 > 0) {
                videoPlayer.setCurrentTime(videoPlayer.getCurrentTime() - 15);
            } else {
                videoPlayer.setCurrentTime(0);
            }
        }
    }

    public boolean isForward() {
        return isForward;
    }

    public void setForward(boolean forward) {
        isForward = forward;
    }
}
