package Interpreter;

/**
 * 解释器模式
 * 实现了一个表达式接口，该接口解释一个特定的上下文。这种模式常用在Sql解析，符号处理引擎等。
 */
public interface Expression {
    public  boolean interpret(String context);
}
