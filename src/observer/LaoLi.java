package observer;

public class LaoLi  implements  Person{
    private  String name="老李";
    public  LaoLi(){}

    @Override
    public void getMessage(String s) {
        System.out.println(name+"接收到小美的通知"+s);
    }
}
