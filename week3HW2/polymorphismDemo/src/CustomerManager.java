public class CustomerManager {
    private BaseLogger baseLogger;
    //burada FileLogger,DatabaseLogger,EmailLogger hepsini kullanabilirim cunku parent BaseLogger
    public CustomerManager(BaseLogger baseLogger){
        this.baseLogger = baseLogger;
    }
    public void add(){
        System.out.println("Musteri eklendi");
        this.baseLogger.log("Log mesaji");
    }
}
