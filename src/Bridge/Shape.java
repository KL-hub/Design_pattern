package Bridge;

/**
 * 把抽象化与实现化解耦，使两者可以独立变化
 */
public  abstract  class Shape {
    protected  DrawAI drawAI;
    protected  Shape(DrawAI drawAI){
        this.drawAI=drawAI;
    }
    public  abstract  void draw();
}
