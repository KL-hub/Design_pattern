package Adapter;

public class VlcPlayer  implements  AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc  file Name"+fileName);
    }

    @Override
    public void piayMp4(String fileName) {
        //  nothing to do
    }
}
