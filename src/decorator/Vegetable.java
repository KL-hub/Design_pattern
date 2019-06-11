package decorator;

public class Vegetable extends  Food{
    private  Food basic_food;
    public Vegetable(Food basic_food){
        this.basic_food=basic_food;
    }
    public String make(){

        System.out.println("蔬菜");
        return basic_food.make()+"+蔬菜";
    }
}
