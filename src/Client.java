import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate 3 different random orders
        for (int i = 1; i <= 3; i++) {
            // Generate random id
            int orderId = rand.nextInt(1) + 100;
            Order order = new Order(orderId);

            // Attach observers to the order
            order.attach(new PriceObserver());
            order.attach(new QuantityObserver());

            int numberOfItems = rand.nextInt(6) + 5;
            System.out.println("========== Order #" + orderId + " ==========");
            System.out.println("Adding " + numberOfItems + " items:\n");

            // Add random items (price between $10 and $60)
            for (int j = 1; j <= numberOfItems; j++) {
                double price = rand.nextInt(51) + 10;
                order.addItem(price);
            }

            // Print the final order
            System.out.println("\n--- Order Summary ---");
            System.out.println(order);
            System.out.println();
        }
    }
}
