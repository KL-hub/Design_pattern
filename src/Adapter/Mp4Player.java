package Adapter;

public class Mp4Player  implements  AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //  nothing todo
    }

    @Override
    public void piayMp4(String fileName) {
        System.out.println("Palying   mp4 file.Name"+fileName);
    }
}
