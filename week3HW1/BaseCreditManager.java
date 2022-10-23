

public abstract class BaseCreditManager implements ICreditManager {
    public void Save(){
        System.out.println("Kaydedildi");
    }
    public abstract void Calculate();
}
