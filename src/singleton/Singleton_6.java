package singleton;

/**
 * 双重检查锁实现单例模式
 * 线程安全
 */
public class Singleton_6 {
    private volatile static Singleton_6 singleton;
    private Singleton_6 (){}
    public  static Singleton_6 getInstance(){
        if(singleton == null){
            synchronized (Singleton_6.class){
                singleton=new Singleton_6();
            }
        }
        return singleton;
    }
}
