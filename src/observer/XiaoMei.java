package observer;

import java.util.ArrayList;
import java.util.List;

public class XiaoMei {
    List<Person> list=new ArrayList<>();
    public void  addPerson(Person person){
        list.add(person);
    }
    //遍历List，发送通知
    public void  notifyPerson(){
        for (Person person:list){
            person.getMessage("一块happy");
        }
    }
}
