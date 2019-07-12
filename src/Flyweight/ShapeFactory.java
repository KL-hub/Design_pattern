package Flyweight;

import java.util.HashMap;

public class ShapeFactory {
    public  static  final HashMap<String,Shape> cicleMap=new HashMap<>();
    public  static Shape  getCircle(String color){
        Circle circle= (Circle) cicleMap.get(color);
        if(circle== null){
            circle=new Circle(color);
            cicleMap.put(color,circle);
            System.out.println("Createing cirle of  color "+color);
        }
        return  circle;
    }
}
