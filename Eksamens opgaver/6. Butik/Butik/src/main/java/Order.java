import java.util.ArrayList;

public class Order {
    private ArrayList<OrderLine> orderlines = new ArrayList<>();

    public double getTotalPrice(){
        double totalPrice=0;
        for(OrderLine o: orderlines){
            totalPrice+=o.getTotalPrice();
        }
        return totalPrice;
    }
    public void addOrderLine(OrderLine orderLine){
        orderlines.add(orderLine);
    }

    @Override
    public String toString() {
        System.out.println("Orderlines: ");
        for (OrderLine o: orderlines){
            System.out.println(o.getItem().getName());
        }
        return "Total price for all orderlines: "+getTotalPrice();
    }
}
