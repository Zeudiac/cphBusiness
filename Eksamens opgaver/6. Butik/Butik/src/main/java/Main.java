public class Main {
    public static void main(String[] args) {
        //Creating items
        Item apple = new Item("Apple",5);
        Item banana = new Item("Banana",6);
        Item pear = new Item("Pear",8);
        Item f35Fighter = new Item("Fighter jet",9954733.87);
        //creating order lines
        OrderLine oL1 = new OrderLine(f35Fighter,2);
        OrderLine oL2 = new OrderLine(apple, 8);
        OrderLine oL3 = new OrderLine(pear, 10);
        OrderLine oL4 = new OrderLine(banana,1);
        //creating orders
        Order o1 = new Order();
        //adding orders to o1 (orderlines Arraylist)
        o1.addOrderLine(oL1);
        o1.addOrderLine(oL2);
        o1.addOrderLine(oL3);
        o1.addOrderLine(oL4);

        System.out.println(o1);
    }
}