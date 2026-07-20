Desafio de Controlo de Fluxo

Sobre o Projeto

Este projeto foi desenvolvido como um exercício prático para a trilha de Java Básico, com o objetivo de consolidar a aprendizagem sobre estruturas de controlo de fluxo, laços de repetição e o mecanismo de tratamento de exceções personalizadas em Java.

O sistema recebe dois números inteiros através do terminal. A partir desses números, o programa calcula a quantidade de interações necessárias e realiza uma contagem progressiva na consola. Caso as regras de negócio sejam violadas (por exemplo, se o primeiro número for maior do que o segundo), o fluxo é interrompido por uma exceção customizada.

Funcionalidades Principais

Captura de Dados: Leitura segura de dois números inteiros fornecidos pelo utilizador.

Validação de Regras: Verificação condicional para garantir a integridade dos parâmetros de entrada.

Exceções Personalizadas: Lançamento da exceção ParametrosInvalidosException quando o fluxo de dados estiver incorreto.

Contagem Progressiva: Execução de um laço de repetição for que exibe mensagens numeradas de forma sequencial.

Regra de Ouro do Sistema:
O primeiro parâmetro deve ser, obrigatoriamente, menor ou igual ao segundo parâmetro. Caso contrário, a contagem não será iniciada e o sistema apresentará um aviso de erro.

Demonstração de Fluxo

A tabela abaixo exemplifica o comportamento do programa de acordo com as entradas fornecidas:

Primeiro Parâmetro

Segundo Parâmetro

Comportamento Esperado

Resultado na Consola

12

30

Sucesso (18 interações)

Imprime do número 1 ao 18

30

12

Falha detetada

Mensagem: "O segundo parâmetro deve ser maior que o primeiro"

Exemplo de Execução Correta

Digite o primeiro parâmetro:
12
Digite o segundo parâmetro:
30
Imprimindo o número 1
Imprimindo o número 2
...
Imprimindo o número 18


Estrutura do Código

O projeto está dividido em dois ficheiros de código fonte complementares:

Contador.java

Contém o ponto de entrada do programa (método main).

Faz a leitura dos parâmetros utilizando a classe Scanner.

Trata potenciais erros através de uma estrutura try-catch.

Implementa o método contar(int parametroUm, int parametroDois).

ParametrosInvalidosException.java

Classe de exceção personalizada que estende Exception.

Representa o erro de negócio específico do nosso domínio.

Como Executar o Programa

Para compilar e correr esta aplicação na sua máquina local, siga os passos indicados abaixo no seu terminal.

Certifique-se de que tem o Java JDK instalado no seu computador.

Aceda à pasta onde se encontram os ficheiros do projeto:

cd caminho/para/o/projeto/src


Compile os dois ficheiros Java em simultâneo:

javac Contador.java ParametrosInvalidosException.java


Execute a aplicação principal:

java Contador


Aprendizagens Adquiridas

O desenvolvimento deste projeto permitiu dominar técnicas essenciais do ecossistema Java:

Utilização correta da classe Scanner para interagir com o terminal.

Diferenciação clara entre os conceitos de throw (para lançar erros no fluxo ativo) e throws (para declarar perigos na assinatura de métodos).

Estruturação de blocos try-catch para captura de eventos inesperados.

Isolamento de regras de negócio em classes dedicadas a exceções, promovendo um código limpo e de fácil manutenção.
