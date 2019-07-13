package ResponsibilityChain;

public class ErrorLoggeer  extends  AbstractLoggeer {
    public ErrorLoggeer(int level) {
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Cnsole :: Logger"+message);
    }
}
