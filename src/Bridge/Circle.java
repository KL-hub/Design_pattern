package Bridge;

public class Circle  extends  Shape {
    private int x,y,radius;
    protected Circle(int x,int y,int redius,DrawAI drawAI) {
        super(drawAI);
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    @Override
    public void draw() {
        drawAI.drawCircle(radius,x,y);
    }
}
