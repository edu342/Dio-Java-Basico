public class Concessionaria {
    public static void main(String[] args) {
        // Criando instâncias da classe Carro (Padrão OOP)
        Carro carro1 = new Carro("BMW", "M4 confortline");
        Carro carro2 = new Carro("Mercedes", "AMG 63");

        Carro carroPreferido = carro2;

        // Uso do .equals() para comparação de conteúdo
        if (carroPreferido.getMarca().equals("BMW")) {
            System.out.println("Meu carro favorito é: " + carro1.getDetalhes());
        } else {
            System.out.println("Meu carro favorito é: " + carro2.getDetalhes());
        }
    }
}

class Carro {
    private String marca; // Atributos privados (Encapsulamento)
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() { return marca; }

    // Único método para retornar os detalhes, evitando duplicidade
    public String getDetalhes() {
        return marca.concat(" ").concat(modelo);
    }
}
