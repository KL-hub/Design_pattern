package Facade;

public class Facade {
    private  Computer cpu;
    private Computer ddr;
    private  Computer ssd;
    private  Computer mem;
    public void onCPU(){
        cpu=new Cpu();
        cpu.open();
    }
    public void onMem(){
        mem=new Memory();
        mem.open();
    }
    public void onDDr(){
        ddr=new Ddr();
        ddr.open();
    }
}
