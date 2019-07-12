package Bridge;

/**
 * 用于把抽象化与实现化解耦，使得两者可以独立变化
 */
public interface DrawAI {
    public void drawCircle(int radius,int x,int y);
}
