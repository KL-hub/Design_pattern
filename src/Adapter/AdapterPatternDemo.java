package Adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.paly("mp3","beyond the horizon.mp3");
    }
}
