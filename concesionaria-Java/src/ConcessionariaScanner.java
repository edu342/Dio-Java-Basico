import java.util.Locale;
import java.util.Scanner;

public class ConcessionariaScanner {
    public static void main(String[] args) {
        // Criando instâncias da classe Carro (Padrão OOP)
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

     System.out.println("digite sua marca do seu carro");
     String marca = scanner.next();

     System.out.println("digite o modelo do seu carro");
     String modelo = scanner.next();

     System.out.println("digite o ano do seu carro");
     int ano = scanner.nextInt();

     
    System.out.println("seu carro é "+ marca + "-" + modelo);
    System.out.println("Do ano:"+ ano);

    }
}

