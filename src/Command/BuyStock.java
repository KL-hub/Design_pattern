package Command;

public class BuyStock  implements Order {
    private  Stock abStock;

    public BuyStock(Stock abStock) {
        this.abStock = abStock;
    }

    @Override
    public void execcute() {
        abStock.buy();

    }
}
