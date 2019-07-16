package State;
/**
 * 状态模式
 * 类的行为是基于它的状态改变的，创建表示各种状态的对象和一个行为随着状态改变而改变的context对象。
 * 对象的行为依赖它的状态（属性），并且可以根据状态对象改变而改变它的相关行为。
 */
public interface State {
  public void doAction(Context context);
}
