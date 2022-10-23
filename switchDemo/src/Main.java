public class Main {
    public static void main(String[] args) {

        char grade = 'D';
        switch (grade){
            case 'A':
                System.out.println("Mukemmel : Gectiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi : Gectiniz");
                break;
            case 'D':
                System.out.println("Fena Degil : Gectiniz");
                break;
            case 'F':
                System.out.println("Maalesef kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");
        }
    }
}