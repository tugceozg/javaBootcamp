public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        //Bellekte CustomerManager turunde bir nesne uretmis olduk
        customerManager.add();
        customerManager.remove();
        customerManager.update();
    }
}