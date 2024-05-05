package SoftEng2.SolidPrinciples;

public class OrderTest {
    public static void main(String[] args){

        OrderPlacer order = new OrderAction();
        TotalCalculator totalCalculator = new OrderAction();
        InvoiceGenerator invoice = new OrderAction();
        EmailNotifier notifier = new OrderAction();

        order.placeOrder("John Doe", "123 Main St");
        totalCalculator.calculateTotal(10.0, 2);
        invoice.generateInvoice("order_123.pdf");
        notifier.sendEmailNotification("johndoe@example.com");

    }
}
