public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getItemCost() > 200) {
            order.setItemCost(order.getItemCost() - 20);
            System.out.println("PriceObserver: A $20 discount has been applied.");
        }
    }
}
