package decorator;

public class Bread extends  Food{
    private  Food basic_food;
    public  Bread(Food basic_food){
        this.basic_food=basic_food;
    }
    public String make(){
        System.out.println("面包");
        return basic_food.make()+"+面包";
    }
}
