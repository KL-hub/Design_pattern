package Facade;

/**
 * 外观模式
 * 隐藏系统的复杂性，并向客户端提供一个可以访问系统的接口
 */
public interface Computer {
    void open();
}
class  Cpu implements  Computer{
    @Override
    public void open() {
        System.out.println("启动Cpu");
    }
}
class  Ddr implements  Computer{
    @Override
    public void open() {
        System.out.println("ddr启动了");
    }
}
class  Memory implements  Computer{
    @Override
    public void open() {
        System.out.println("内存启动了");
    }
}
