package Proxy.cglib;



import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description //TODO
 * @Author 李项
 * @Date 2020/5/22
 * @Version 1.0
 */
public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("这里对方法进行了增强");
        return methodProxy.invokeSuper(o,objects);
    }
}
