package AbstractFactory;

/**
 * 抽象工厂的测试类
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory factory=FactoryProduct.getFactory("Color");
        Color red=factory.getColor("Red");
        red.fill();

        AbstractFactory shapeType=FactoryProduct.getFactory("Color");
        Color blue=factory.getColor("Blue");
        blue.fill();
    }
}
