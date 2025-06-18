import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private int itemCount = 0;
    private double itemCost = 0;
    private double shippingCost = 10;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(int id) {
        this.id = id;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public void addItem(double price) {
        itemCount++;
        itemCost += price;
        System.out.println("Item added: " + price + "$\"");
        notifyObservers();
    }

    // Getters
    public int getItemCount() {
        return itemCount;
    }

    public double getItemCost() {
        return itemCost;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public double getTotalPrice() {
        return itemCost + shippingCost;
    }

    // Setters used by observers
    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public String toString() {
        return "Order number: #" + id +
                "\n* Items: " + itemCount +
                "\n* Item total: $" + itemCost +
                "\n* Shipping fees: $" + shippingCost +
                "\n* Total: $" + getTotalPrice();
    }
}
