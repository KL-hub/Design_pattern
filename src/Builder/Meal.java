package Builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> itemList=new ArrayList<>();
    public  void  add(Item item){
        itemList.add(item);
    }
    public  float getCost(){
        float cost=0.0f;
        for(Item item:itemList){
            cost += item.price();
        }
        return cost;
    }
    public  void  showItems(){
        for(Item  item:itemList){
            System.out.println("Item"+item.name());
            System.out.println(",Packkin"+item.packing());
            System.out.println("price"+item.price());
        }
    }
}
