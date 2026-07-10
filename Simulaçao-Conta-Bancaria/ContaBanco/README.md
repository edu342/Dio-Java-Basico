#  Conta de Banco - Terminal Java

---

###  Descrição
O sistema recebe dados via console (nome, agência, número e saldo) e retorna uma mensagem de boas-vindas formatada. O foco principal foi lidar com o fluxo de dados e resolver problemas comuns de buffer do teclado em Java.

---

###  Funcionalidades
- [x] Captura de dados via `Scanner`.
- [x] Tratamento de exceções de buffer (limpeza de `\n` após `nextInt()`).
- [x] Formatação de saída com `System.out.println`.
---

###  Tecnologias
- **Linguagem:** Java (JDK 17)
- **Biblioteca:** `java.util.Scanner`
- **Padrão:** Google Java Style Guide [8]

---

## Lições Aprendidas
Apliquei o conceito de previsibilidade ao refatorar a entrada de dados. Aprendi que o método next() lê apenas até o primeiro espaço, por isso migrei para o nextLine() para suportar nomes completos, garantindo um código mais robusto [Histórico da Conversa].
