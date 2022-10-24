public class ConsoleLogger extends BaseLogger{
    public void log(String mesaj){
        System.out.println("Logged to console : " + mesaj);
    }
}
