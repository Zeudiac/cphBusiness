public class OrderLine {
    private Item item;
    private int amount;

    public OrderLine(Item item, int amount){
        this.item=item;
        this.amount=amount;
    }
    public double getTotalPrice(){
        return item.getPrice()*amount;
    }

    @Override
    public String toString() {
        return "Amount purchased: "+amount+"\n"+item.getName()+" is priced at: "+item.getPrice()+"\nTotal cost: "+getTotalPrice();
    }

    public Item getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }
}
