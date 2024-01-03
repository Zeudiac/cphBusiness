public class Main {
    public static void main(String[] args) {
        //Creating items
        Item apple = new Item("apple",5);
        Item banana = new Item("banana",6);
        Item pear = new Item("pear",8);
        Item f35Fighter = new Item("fighter jet",9954733.87);
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

        System.out.println(o1.toString());
    }
}