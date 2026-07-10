import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Por favor, digite o número da Agência!");
       int numberAgencia = scanner.nextInt();
       scanner.nextLine(); // Limpa o buffer do enter

       System.out.println("Por favor, digite o nome da sua Agência!");
       String nameAgencia = scanner.nextLine(); // Agora aceita espaços
 
       System.out.println("Por favor, digite o seu Nome!");
       String nameCliente = scanner.nextLine(); // Agora aceita nome completo

       System.out.println("Por favor, digite o seu Saldo!");
       double saldoCliente = scanner.nextDouble();

       // Adicionado espaços e corrigido o texto
       System.out.println("Olá " + nameCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
           + nameAgencia + ", conta " + numberAgencia + " e seu saldo " + saldoCliente + " já está disponível para saque.");
    }
}