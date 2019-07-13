package Menmento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Menmento> list=new ArrayList<Menmento>();
    public void add(Menmento state){
        list.add(state);
    }
    public Menmento get(int index){
        return list.get(index);
    }

}
