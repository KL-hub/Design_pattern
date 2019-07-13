package Proxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        //真实对象
        Subject subject=new RealSubject();
        MyInvocationHandle myInvocationHandle=new MyInvocationHandle(subject);
        //代理对象
        Subject  proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Subject.class},myInvocationHandle);

        proxyClass.sellBooks();

        proxyClass.speak();

    }
}
