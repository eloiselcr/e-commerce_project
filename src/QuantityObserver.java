public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getItemCount() > 5) {
            order.setShippingCost(0);
            System.out.println("QuantityObserver: Free shipping.");
        } else {
            order.setShippingCost(10);
            System.out.println("QuantityObserver: Standard shipping applied. ($10)");
        }
    }
}
