package singleton;

/**
 * 懒汉式-线程安全
 */
public class Singleton_3 {
    private static  Singleton_3 singleton;
    private Singleton_3(){}
    public  static synchronized Singleton_3 getInstance(){
        if(singleton ==null){
            return new Singleton_3();
        }
        return  singleton;
    }
}
