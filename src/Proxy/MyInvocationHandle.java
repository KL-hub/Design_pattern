package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandle  implements InvocationHandler {
    Subject subject;

    public MyInvocationHandle(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("正在调用代理类");
        if(method.getName().equalsIgnoreCase("sellBooks")){
            int invoke=(int)method.invoke(subject,args);
            System.out.println("调用的是卖书的方法");
            return  invoke;
        }else {
            String invoke=(String)method.invoke(subject,args);
            System.out.println("调用的是说话的方法");
            return  invoke;
        }
       // return null;
    }
}
