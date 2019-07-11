package Factory;

public class FactoryPatternDamo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape=shapeFactory.getShape("Square");
        shape.draw();
        //其余雷同
        Shape shape1=shapeFactory.getShape("Circle");
        shape1.draw();
    }
}
