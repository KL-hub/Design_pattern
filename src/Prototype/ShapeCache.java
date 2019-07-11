package Prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable <String,Shape>hashtable=new Hashtable<String,Shape>();
    public static Shape getShape(String shapeId){
        Shape cachedShape=hashtable.get(shapeId);
        return  (Shape) cachedShape.clone();
    }


    public  static  void loadCache(){
        Circle circle=new Circle();
        circle.setId("1");
        hashtable.put(circle.getId(),circle);

        Rectangle rectangle=new Rectangle();
        rectangle.setId("2");
        hashtable.put(rectangle.getId(),rectangle);

        Square square=new Square();
        square.setId("3");
        hashtable.put(square.getId(),square);
        
    }
}
