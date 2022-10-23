public class Main {
    public static void main(String[] args) {
        for(int i = 2; i<10; i+=2){
            System.out.println(i);
        }
        System.out.println("Dongu bitti");

        //while
        int i=1;
        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Dongusu bitti");

        //do-while
        int j=1;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("Do while dongusu bitti");
    }
}