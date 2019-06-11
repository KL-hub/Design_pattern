package singleton;
/**
 * 枚举实现单例模式
 * 枚举类在被虚拟机加载的时候会保证线程安全的被初始化。
 * 除此之外，在序列化方面，Java中有明确规定，枚举的序列化和反序列化是有特殊定制的。这就可以避免反序列化过程中由于反射而导致的单例被破坏问题。
 */
public enum  Singleton_5 {
    INSTANCE;
    public void whatevermethod(){};
}
