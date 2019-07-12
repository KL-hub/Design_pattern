package Flyweight;

public class FlyweightPatternDemo {
    private  static  final  String [] colors={"red","Green","blue","white"};

    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            Circle circle= (Circle) ShapeFactory.getCircle(colors[(int)(Math.random()*colors.length)]);
            circle.setX((int)(Math.random()*100));
            circle.setY((int)(Math.random()*100));
            circle.setRedius((int)(Math.random()*100));
            circle.draw();
        }
    }

}
