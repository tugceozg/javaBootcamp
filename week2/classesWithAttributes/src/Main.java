public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Lenovo Laptop",3,5000,"Siyah");



        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getKod());



    }
}