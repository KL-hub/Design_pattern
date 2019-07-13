package ResponsibilityChain;

public class ChainPatternDemo {

    private  static  AbstractLoggeer getChainOfLoggers(){
        AbstractLoggeer errorLogger =new ErrorLoggeer(AbstractLoggeer.ERROR);
        AbstractLoggeer fileLogger =new ErrorLoggeer(AbstractLoggeer.DEBUG);
        AbstractLoggeer consoleLogger =new ErrorLoggeer(AbstractLoggeer.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return  errorLogger;
    }

    public static void main(String[] args) {
        AbstractLoggeer loggeer=getChainOfLoggers();
        loggeer.logMesage(AbstractLoggeer.INFO,"This is INFO");
        loggeer.logMesage(AbstractLoggeer.DEBUG,"This is Debug");
        loggeer.logMesage(AbstractLoggeer.ERROR,"This is Error");

    }
}
