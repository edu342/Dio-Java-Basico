##Projeto: Monte Seu Carro (Java)
Este projeto foi desenvolvido para praticar conceitos básicos de Programação Orientada a Objetos (POO) e a manipulação de entradas do usuário utilizando a classe Scanner na linguagem Java.

## Funcionalidades
O sistema demonstra duas abordagens diferentes para lidar com os dados de um veículo:

Abordagem POO (Estática): Cria uma instância da classe, define a marca e o modelo sequencialmente e exibe os resultados no console.

Abordagem Interativa (Scanner): Solicita que o usuário digite as informações do carro (marca, modelo e ano) via terminal em tempo de execução.

## Estrutura de Arquivos
Carro.java: Classe que representa a entidade do carro. Possui o atributo carroEscolhido e os métodos para definir a marca e o modelo.

MonteSeuCarroOOP.java: Classe principal (main) que executa a lógica estruturada em objetos.

MonteSeuCarroScanner.java: Classe principal (main) que executa a lógica de leitura de dados do teclado.

## Detalhes dos Componentes
1. Classe de Objeto (Carro.java)
Contém a lógica de armazenamento temporário dos dados do veículo:

MarcaEscolhida(String marca): Atribui o texto da marca à variável carroEscolhido.

ModeloEscolhido(String modelo): Atribui o texto do modelo à mesma variável carroEscolhido.

## Execução OOP (MonteSeuCarroOOP.java)
Instancia a classe Carro e exibe as informações conforme os métodos são chamados:

Java
Carro Carro = new Carro();
Carro.MarcaEscolhida("Porche"); // Define e exibe a marca
Carro.ModeloEscolhido("GT3 RS"); // Define e exibe o modelo
3. Execução Interativa (MonteSeuCarroScanner.java)
Captura o texto e os números digitados pelo usuário utilizando a configuração Locale.US:

Lê a marca (scanner.next()).

Lê o modelo (scanner.next()).

Lê o ano do veículo (scanner.nextInt()).
