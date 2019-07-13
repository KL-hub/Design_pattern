package Command;

public class SellStock implements Order {
    private  Stock abStock;

    public SellStock(Stock abStock) {
        this.abStock = abStock;
    }

    @Override
    public void execcute() {
        abStock.sell();
        
    }
}
