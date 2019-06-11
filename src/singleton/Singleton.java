package singleton;

/**
 * 单例模式 懒汉式
 */

public class Singleton {
    private static  Singleton singleton;
    private Singleton(){}
    public  static  Singleton getInstance(){
        if(singleton ==null){
            return new Singleton();
        }
        return  singleton;
    }

}
