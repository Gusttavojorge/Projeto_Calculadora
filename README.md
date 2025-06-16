# 🧮 Projeto Calculadora em Java

Este projeto consiste em uma calculadora simples desenvolvida em Java, com foco na prática de Programação Orientada a Objetos (POO), testes automatizados com JUnit 5, gerenciamento de dependências com Maven e versionamento de código com Git.

---

## 📌 Funcionalidades

- [x] Soma
- [x] Subtração
- [x] Multiplicação
- [x] Divisão (com tratamento para divisão por zero)
- [x] Menu interativo no terminal
- [x] Testes unitários com JUnit 5

---

## 📂 Estrutura do Projeto

```
src
├── main
│   └── java
│       └── br/gustavojorge/calculadora
│           ├── entities
│           │   └── Calculadora.java
│           └── program
│               └── Program.java
├── test
│   └── java
│       └── br/gustavojorge/calculadora
│           └── CalculadoraTest.java
pom.xml
```

---

## 🚀 Como Executar

### Pré-requisitos
- Java 21
- Maven instalado
- Git (opcional)

### 1. Clonar o repositório

```bash
git clone https://github.com/seu-usuario/Projeto_Calculadora.git
cd Projeto_Calculadora
```

### 2. Executar a calculadora

```bash
mvn compile exec:java
```

### 3. Rodar os testes

```bash
mvn test
```

---

## 🔀 Controle de Versão

- Branch principal: `main`
- Branch secundária: `feature/calculadora` (criada para simulação de fluxo colaborativo)
- Foi realizado merge da branch de feature para a main

---

## 📥 Repositório Clonado

Durante o projeto, também foi clonado um repositório externo com estrutura similar de uma calculadora para fins de análise e comparação de práticas de codificação.

---

## 👨‍💻 Autor

- Gustavo Jorge Milhomem de Oliveira  
- Projeto acadêmico para o curso de Análise e Desenvolvimento de Sistemas – PUC-GO

---

## 📝 Licença

Este projeto é de uso acadêmico e livre para fins de aprendizado.