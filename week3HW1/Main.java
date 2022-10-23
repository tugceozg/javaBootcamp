public class Main {
    //IoC container
    //new ler varsa zaafiyet vardir
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.giveCredit();




























     /*    CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Ankara");


        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();


        Company company = new Company();
        company.setTaxNumber("100000");
        company.setCompanyName("Arcelik");
        company.setId(100);

        CustomerManager customerManager2 = new CustomerManager(new Person());
        
        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();


        Person person = new Person();
        person.setNationalId("112354");
        person.setFirstName("Tugce");;
        */
    }
}
