package Mediator;

import java.util.Date;

/**
 * 中介者模式
 *  是用来降低多个对象和类之间的通信复杂性，该类通常处理不同类之间的通信。
 */
public interface ChatRoom {
    public static  void showMessage(User user,String message){
        System.out.println(new Date().toString()+" [" +user.getName() +"]"+message);
    }
}
