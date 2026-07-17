package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
  public static void main(String[] args) {
     String[] candidatos = { "Arthur", "Beatriz","Carlos","Daniela", "Eduardo"};
     for(String candidato: candidatos){
       
     }
  }
   static boolean atender(){
      return new Random().nextInt(3)==1;
   }
  

   static void imprimirSelecionados(){
     String[] candidatos = { "Arthur", "Beatriz","Carlos","Daniela", "Eduardo"};
    System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
    for(int indice=0; indice < candidatos.length;indice++){
  System.out.println("O candidato de numero " + indice + " é " + candidatos[indice]);      
    }
   }

  static void selecaoCandidatos() {
    String[] candidatos = { "Arthur", "Beatriz","Carlos","Daniela", "Eduardo",  "Fernanda", "Gabriel", "Helena","Igor",  "Julia"};
    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;
      while (candidatosSelecionados < 5) {
      String candidato = candidatos[candidatosAtual];
      double salarioPretendido = valorpretendido();

      System.out.println("O candidato "+ candidato + "Solicito esse valor de salario "+ salarioPretendido);
      if(salarioBase >= salarioPretendido){
        System.out.println("o candidato "+ candidato+ "foi selecionado para a vaga");
        candidatosSelecionados++;
      }
      candidatosAtual++;
    }
   }
 static double valorpretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
 }

 static void analizarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if(salarioBase > salarioPretendido){
      System.out.println("Ligar para o candidato");

     } else if(salarioBase == salarioPretendido){
      System.out.println("Ligar para o candidato com contra proposta");
     } else {
      System.out.println("Aguardando resultado dos demais candidatos");
     }
 }

}