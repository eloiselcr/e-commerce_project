import java.util.List;

public class Order {
    public Order(int id) {}

    public void attach(OrderObserver observer) {}
    public void detach(OrderObserver observer) {}
    public void notifyObservers() {}
    public void addItem(double price) {}

    public int getItemCount() { return 0; }
    public double getItemCost() { return 0; }
    public double getShippingCost() { return 0; }
    public double getTotalPrice() { return 0; }

    public void setItemCost(double itemCost) {}
    public void setShippingCost(double shippingCost) {}

    @Override
    public String toString() { return null; }
}
