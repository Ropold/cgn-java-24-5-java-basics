package JavaInterfaces;

public class Main {
    public static void main(String[] args) {

        Playable playable1 = new MusicPlayer();
        Playable playable2 = new VideoPlayer();
        //MediaController playable3 = new MediaController();

        MediaController.playMedia(playable1);
        MediaController.playMedia(playable2);
    }
}
