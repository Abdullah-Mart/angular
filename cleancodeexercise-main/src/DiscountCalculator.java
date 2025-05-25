public class DiscountCalculator {
    public double calculateDiscount(double amount) {
        if (amount > 100) {
            return amount * 0.1;
        }
        return 0;
    }

    public double calculateTotal(double amount) {
        double discount = 0;
        if (amount > 100) {
            discount = amount * 0.1;
        }
        return amount - discount;
    }
}
