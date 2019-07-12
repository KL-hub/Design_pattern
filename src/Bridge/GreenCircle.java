package Bridge;

public class GreenCircle  implements  DrawAI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Circle  color :green   radius"+radius+"  x："+x +"y"+y);
    }
}
