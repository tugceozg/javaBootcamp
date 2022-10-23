public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditManager;
    public CustomerManager(Customer customer, ICreditManager creditManager){
       _customer = customer;
       _creditManager = creditManager;
    }
    public void save(){
        System.out.println("Musteri kaydedildi : " );
    }

    public void delete(){
        System.out.println("Musteri silindi : " );
    }
    public void giveCredit(){
        _creditManager.Calculate();
        System.out.println("Kredi verildi");
    }
    }

