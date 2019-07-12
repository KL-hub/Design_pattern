package Bridge;

public class RedCircle  implements  DrawAI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Circle  color :red   radius"+radius+"  x："+x +"y"+y);
    }
}
