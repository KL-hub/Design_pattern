package observer;

public class Test {
    public static void main(String[] args) {
        XiaoMei xiaoMei=new XiaoMei();
        xiaoMei.addPerson(new LaoWang());
        xiaoMei.addPerson(new LaoLi());
        xiaoMei.notifyPerson();
    }
}
