public class Customer {
    public Customer(){
        System.out.println("Musteri  nesnesi baslatildi");
    }   
    private int id;
    private String city;

    public void setId(int id){
        this.id = id;
    }
   
    public int getId(){
        return id;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    
}
