import java.util.Locale;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
     System.out.println("O segundo parâmetro deve ser maior que o primeiro");       
		}	
	}
static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
			// 1. Validar se parametroUm é MAIOR que parametroDois
			if (parametroUm > parametroDois) {
					// Lançar a exceção aqui dentro usando: throw new ParametrosInvalidosException();
					throw new ParametrosInvalidosException();
			}
			
			int contagem = parametroDois - parametroUm;
			// 2. Realizar o laço for aqui embaixo...
			for(int count = 1; count <= contagem; count++){
				System.out.println("imprimindo numero " + count);
			}
	}

}
