package Mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert=new User("Robert");
        User john=new User("John");
        robert.sendMessage("Hi, Hohn");
        john.sendMessage("Hello,Robert");
    }
}
