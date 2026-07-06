public class Concessionaria {

   public static void main(String[] args) {
        String marca = "BMW";
        String modelo = "M4 confortline";
        String marca2 = "Mercedes";
        String modelo2 = "AMG 63";
        // 1. Agora chama o método correto
        String carro1 = carro1(marca, modelo); 
        System.out.println(carro1);
        
        String carro2 = carro2(marca2, modelo2); 
        System.out.println(carro2);
    } 
    // 2. Método renomeado para 'carro' e variáveis ajustadas
      public static String carro1(String marca, String modelo) {
        // O método concat junta a marca com o modelo
        return marca.concat(modelo);
      } 
      public static String carro2(String marca2, String modelo2) {
            // O método concat junta a marca com o modelo
        return marca2.concat(modelo2);
      } 
    }
