package decorator;

/**
 * 对已有的业务逻辑进一步封装，使其增加额外的功能
 * eg.Java中的IO流等。
 */
public class Food {
    public  Food(){}
    private  String food_name;
    public  Food(String food_name){
        this.food_name=food_name;
    }
    public String make(){
        return  food_name;
    }
}
