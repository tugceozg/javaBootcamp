public class Product {
    public Product(int id, String name, String description, int stockAmount, double price,String renk){
        System.out.println("Yapici blok calisti");
        this._id = id;
        this._price = price;
        this._description = description;
        this._stockAmount = stockAmount;
        this._renk = renk;
        this._name = name;

    }
    public Product(){

    }
    //attributes
    private int _id;
    private  String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _renk;

    public int getId(){
        return _id;
    }
    public void setId(int id){
        _id = id;
    }
    public String getName(){
        return _name;
    }
    public void setName(String name){
        _name=name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = _description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = _price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getRenk() {
        return _renk;
    }

    public void setRenk(String renk) {
        _renk = _renk;
    }
    public String getKod(){
        return _name.substring(0,1) + _id;
    }
}
