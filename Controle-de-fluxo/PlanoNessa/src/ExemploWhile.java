import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
  public static void main(String[] args) {
     double salario = 5000.0;
     while(salario > 0){
      double despesa = valorAleatorio();
       if(despesa > salario)
         despesa = salario;

      System.out.println("Valor da despesa: " + despesa + " Adicionado no carrinho"); 
      salario = salario - despesa;
     }
     System.out.println("salario: " + salario);
     System.out.println("Eduardo gastou todo o salario em jogos");
  }


private static double valorAleatorio(){
  return ThreadLocalRandom.current().nextDouble(100.0 , 500.0);
}

}