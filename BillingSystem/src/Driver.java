public class Driver {
    public static void main(String[]args){
        //dish and cost are in same order
        String[] dish = {"Break", "Coffee", "Tea", "Noodle", "Burger"};
        double[] cost = {2.33, 5.7, 6.1, 7.66, 4.5};
        Bill myBill = new Bill();
        myBill.addOrder("Tea", 4, dish, cost);
        myBill.addOrder("Coffee", 3, dish, cost);
        myBill.addOrder("Noodle", 2, dish, cost);
        myBill.getOrder();
        
        System.out.println(myBill.getTotal());
    }
}