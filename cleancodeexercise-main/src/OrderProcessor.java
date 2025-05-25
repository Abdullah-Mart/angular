public class OrderProcessor {
    public void processOrder(String customerName, String address, String product, int quantity, double price) {
        double total = quantity * price;
        if (total > 100) {
            total = total * 0.9; // 10% discount
        }
        System.out.println("Order placed for " + customerName + " at " + address);
        System.out.println("Product: " + product + ", Quantity: " + quantity + ", Total Price: " + total);
    }
}
