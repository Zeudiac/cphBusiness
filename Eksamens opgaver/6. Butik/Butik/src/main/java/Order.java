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
        String finite="Orderlines: \n";

        for (OrderLine o: orderlines){
            finite+=o.getItem().getName()+" - Amount: "+o.getAmount()+"\n";
        }
        return finite+"Total price for all orderlines: "+getTotalPrice();
    }
}
