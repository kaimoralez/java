# Sistema de Folha de Pagamento em Java

Aplicação desenvolvida em **Java** para gerenciamento e cálculo da folha de pagamento de diferentes colaboradores de uma empresa.

O projeto tem como principal objetivo aplicar conceitos de **Programação Orientada a Objetos (POO)**, utilizando encapsulamento, abstração, herança e polimorfismo.

---

## 📌 Objetivo do Sistema

O sistema permite:

- Cadastrar diferentes tipos de funcionários;
- Armazenar dados contratuais dos colaboradores;
- Calcular bonificações específicas de cada cargo;
- Calcular a remuneração total de cada funcionário;
- Validar dados de entrada;
- Exibir o holerite detalhado de cada profissional;
- Calcular o custo total da folha de pagamento.

---

## 💰 Regras de Negócio

Cada cargo possui uma regra específica para cálculo da bonificação:

| Cargo | Regra de Bonificação |
|---|---|
| **Gerente** | Adicional de **20%** sobre o salário base |
| **Desenvolvedor** | Adicional de **10%** sobre o salário base |
| **Vendedor** | Comissão de **5%** sobre o total vendido no mês |

### Remuneração Total

A remuneração total é calculada pela soma:

```text
Remuneração Total = Salário Base + Bonificação/Comissão
```

No caso do **Vendedor**, a comissão é calculada sobre o total vendido no mês, enquanto o salário base permanece fixo.

---

## 🧩 Aplicação dos Pilares de POO

### Encapsulamento

O projeto utiliza encapsulamento para proteger os dados dos funcionários.

- Atributos como `nome`, `cpf` e `salario`, presentes em `Funcionario`, são definidos como `private`.
- O atributo `totalMes`, presente em `Vendedor`, também possui acesso restrito.
- Os dados não podem ser alterados diretamente fora de suas respectivas classes.
- O acesso às informações é realizado por meio de métodos `getters`.
- Os construtores realizam validações para impedir a criação de objetos com dados inválidos.

Exemplos de validações:

- Nome não pode estar em branco;
- CPF não pode estar vazio;
- Salário deve ser maior que zero;
- Valor total de vendas não pode ser negativo.

Quando uma regra é violada, o sistema lança uma `IllegalArgumentException`.

---

### Abstração

A classe `Funcionario` é definida como uma **classe abstrata**.

```java
public abstract class Funcionario
```

Isso impede que um funcionário genérico seja instanciado diretamente:

```java
new Funcionario(...);
```

A classe também define métodos abstratos que estabelecem um contrato para suas subclasses:

```java
public abstract double calcularBonificacao();

public abstract String cargo();
```

Dessa forma, `Funcionario` define **o que deve ser feito**, enquanto cada classe filha define **como a operação deve ser realizada**.

---

### Herança

As classes:

- `Gerente`
- `Desenvolvedor`
- `Vendedor`

herdam da classe `Funcionario` utilizando `extends`.

```java
public class Gerente extends Funcionario
```

```java
public class Desenvolvedor extends Funcionario
```

```java
public class Vendedor extends Funcionario
```

Isso permite reutilizar atributos, métodos e comportamentos comuns entre os diferentes tipos de funcionários.

---

### Polimorfismo

O polimorfismo é utilizado principalmente na classe `Main`.

Uma única lista do tipo `Funcionario` pode armazenar diferentes subclasses:

```java
ArrayList<Funcionario> funcionarios
```

Por exemplo:

```java
funcionarios.add(new Gerente(...));
funcionarios.add(new Desenvolvedor(...));
funcionarios.add(new Vendedor(...));
```

Ao percorrer a lista:

```java
for (Funcionario f : funcionarios) {
    f.exibirHolerite();
}
```

Java identifica em tempo de execução qual implementação deve ser utilizada.

Assim, `calcularBonificacao()` executará automaticamente a regra correspondente ao cargo, sem a necessidade de utilizar vários `if/else` para identificar o tipo de funcionário.

---

## 📂 Estrutura do Projeto

A atividade está localizada no seguinte diretório:

```text
backend/
└── src/
    └── atividades/
        └── atv09/
            ├── Funcionario.java
            ├── Gerente.java
            ├── Desenvolvedor.java
            ├── Vendedor.java
            └── Main.java
```

---

## ⚙️ Como Compilar e Executar

### Pré-requisitos

Para executar o projeto, é necessário ter instalado:

- **Java JDK 17 ou superior**
- **Git**
- Terminal/Prompt de Comando ou **IntelliJ IDEA**

---

### 💻 Opção 1 — Linha de Comando

Clone o repositório:

```bash
git clone https://github.com/kaimoralez/cursos.git
```

Acesse o diretório do projeto:

```bash
cd cursos/senai/backend
```

Compile os arquivos Java:

```bash
javac -d bin src/atividades/atv09/*.java
```

Os arquivos compilados serão gerados dentro da pasta `bin`.

Execute a aplicação:

```bash
java -cp bin atividades.atv09.Main
```

---

### 🧠 Opção 2 — IntelliJ IDEA

1. Abra o **IntelliJ IDEA**.
2. Selecione **File > Open**.
3. Abra a pasta `cursos`.
4. No painel **Project**, navegue até:

```text
senai
└── backend
    └── src
        └── atividades
            └── atv09
                └── Main.java
```

5. Clique com o botão direito em `Main.java`.
6. Selecione:

```text
Run 'Main.main()'
```

Também é possível executar pelo botão verde de **Play ▶** ao lado do método `main`.

---

## 🖥️ Exemplos de Execução

### Execução com Sucesso

Exemplo de saída no console:

```text
===== Funcionario =====
Nome = Kaique
Cargo = Vendedor
Salario = R$ 20000,00
Bonificação = R$ 75,00
Remuneração = R$ 20075,00

===== Funcionario =====
Nome = Carlos Lima
Cargo = Desenvolvedor
Salario = R$ 7000,00
Bonificação = R$ 700,00
Remuneração = R$ 7700,00

===== Funcionario =====
Nome = Mariana Souza
Cargo = Gerente
Salario = R$ 10000,00
Bonificação = R$ 2000,00
Remuneração = R$ 12000,00

Remuneração total dos funcionários = R$ 39775,00
```

---

## 🚨 Tratamento de Dados Inválidos

O sistema realiza validações durante a criação dos objetos.

Quando os dados não atendem às regras de negócio, uma `IllegalArgumentException` é lançada.

### Nome vazio

```java
new Desenvolvedor("", "12345678900", 5000.0);
```

Retorno:

```text
IllegalArgumentException: O nome não pode estar em branco
```

### CPF vazio

```java
new Gerente("Mariana", "", 8000.0);
```

Retorno:

```text
IllegalArgumentException: O cpf não pode ser em branco
```

### Salário inválido

```java
new Vendedor("Roberto", "12345678900", 0.0, 5000.0);
```

Retorno:

```text
IllegalArgumentException: O salário não pode ser igual a 0
```

### Valor de vendas negativo

```java
new Vendedor("Roberto", "12345678900", 3000.0, -500.0);
```

Retorno:

```text
IllegalArgumentException: O valor é invalido
```

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Programação Orientada a Objetos (POO)**
- **ArrayList**
- **Tratamento de exceções**
- **Git / GitHub**

---

## 📚 Conceitos Praticados

Este projeto foi desenvolvido com foco nos seguintes conceitos:

- [x] Classes e objetos
- [x] Encapsulamento
- [x] Construtores
- [x] Getters
- [x] Classes abstratas
- [x] Métodos abstratos
- [x] Herança
- [x] Polimorfismo
- [x] Sobrescrita de métodos
- [x] ArrayList
- [x] Validação de dados
- [x] `IllegalArgumentException`
- [x] Organização de código

---

## 👨‍💻 Autor

**Kaique Moralez**

- GitHub: [kaimoralez](https://github.com/kaimoralez)
- LinkedIn: [Kaique Pereira da Conceição](https://www.linkedin.com/in/kaique-p-conceicao/)
