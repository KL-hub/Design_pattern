package ResponsibilityChain;

/**
 * 为请求创建了一个接受者对象的链。
 * 通常每个接收者都包含另一个接受者的引用，如果 一个对象不能处理该请求，那么会把相同的请求给下一个接受者。
 */
public abstract class AbstractLoggeer {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;
    protected  int level;

    protected  AbstractLoggeer nextLogger;
    public  void setNextLogger(AbstractLoggeer nextLogger){
        this.nextLogger=nextLogger;
    }
    public void logMesage(int level,String message){
        if(this.level <= level){
            write(message);
        }
        if (nextLogger != null){
            nextLogger.logMesage(level,message);
        }
    }
    abstract  protected void  write(String message);
}
