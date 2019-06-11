package observer;

public class LaoWang  implements  Person{
    private  String name ="小王";
    public LaoWang(){}

    @Override
    public void getMessage(String s) {
        System.out.println(name +"收到小美的通知"+s);
    }
}
