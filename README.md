<h1 align="center">📘 Calculadora de Média Final – Java</h1>

<p align="center">
Projeto acadêmico em Java para cálculo de média final, com foco em boas práticas,
tratamento de exceções e experiência do usuário.
</p>

---

<h2 align="center">📌 Descrição</h2>

Este projeto consiste em uma **calculadora de média final acadêmica**, desenvolvida em **Java**, que calcula a situação do aluno com base em duas avaliações:

- **Prova Presencial** (peso 6.0)
- **Produção de Aprendizagem Significativa - PAS** (peso 4.0)

O sistema foi construído com foco em **boas práticas de programação**, evitando erros comuns de entrada de dados com `Scanner` e aplicando validações seguras.

---

<h2 align="center">🧠 Conceitos Aplicados</h2>

- Estrutura sequencial  
- Estruturas condicionais (`if / else if / else`)  
- Estruturas de repetição (`do while`)  
- Métodos  
- Parâmetros e retorno  
- Escopo de variáveis  
- Tratamento de exceções (`try / catch`)  
- Validação de entrada do usuário  
- Boas práticas com `Scanner`  
- Organização e legibilidade de código  

---

<h2 align="center">⚙️ Regras de Cálculo</h2>

| Avaliação | Peso |
|---------|------|
| Prova Presencial | 6.0 |
| Produção de Aprendizagem Significativa - PAS | 4.0 |

**Fórmula da média final:**

mediaFinal = (prova * 6 + pas * 4) / 10


---

<h2 align="center">📊 Resultado Final</h2>

| Média Final | Situação |
|------------|----------|
| ≥ 6.0 | Aprovado |
| ≥ 4.0 e < 6.0 | Prova Final |
| < 4.0 | Reprovado |

---

<h2 align="center">🛡️ Tratamento de Entrada</h2>

Para evitar problemas comuns com o `Scanner`, todas as entradas do usuário são lidas utilizando:

- `nextLine()`

As notas são inicialmente armazenadas como `String` e convertidas para `double` somente após validação, garantindo:

- Nenhum bug de quebra de linha  
- Nenhuma falha por entrada inválida  
- Melhor experiência do usuário  

---

<h2 align="center">🧩 Método de Validação</h2>

O método `lerNota` é responsável por:

- Exibir a mensagem personalizada ao usuário  
- Ler a entrada como texto  
- Converter o valor para `double`  
- Validar se a nota está entre 0 e 10  
- Repetir a pergunta em caso de erro  

Esse método centraliza a validação e evita duplicação de código.

---

<h2 align="center">▶️ Como Executar</h2>

1. Clone ou baixe o repositório  
2. Abra o projeto em uma IDE Java (IntelliJ, Eclipse ou VS Code)  
3. Compile e execute a classe `MediaFinalUnit`  
4. Siga as instruções exibidas no terminal  

---

<h2 align="center">🚀 Melhorias Futuras</h2>

- Versão orientada a objetos (POO)  
- Cadastro de múltiplos alunos  
- Menu interativo  
- Persistência de dados  
- Interface gráfica (GUI)  

---

<h2 align="center">👨‍💻 Autor</h2>

<p align="center">
<b>Juan Pablo de Santana Ramos</b><br>
Projeto desenvolvido como parte dos estudos em <b>Lógica de Programação</b>, <b>Java</b> e
<b>boas práticas de desenvolvimento</b>, com foco na evolução para
<b>Programação Orientada a Objetos (POO)</b>.
</p>
