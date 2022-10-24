//Urunu db'ye ekler
public class ProductManager {
    public void add(Product product) {

        if (ProductValidator.inValid(product)) {
            System.out.println("Eklendi");
        }
        else{
            System.out.println("Urun bilgileri gecersizdir");
        }

    }

}
