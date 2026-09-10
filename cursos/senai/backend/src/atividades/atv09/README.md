Markdown
# Sistema de Folha de Pagamento em Java

## 1. Objetivo do Sistema
Aplicação desenvolvida para gerenciar e calcular a folha de pagamento de diferentes colaboradores de uma empresa, aplicando os pilares da Programação Orientada a Objetos (POO) em Java. O sistema consolida dados contratuais, calcula bonificações específicas para cada cargo, valida regras de entrada e exibe o holerite detalhado de cada profissional, além do custo total da folha.

---

## 2. Regras de Negócio e Bonificação

* **Gerente:** Recebe um adicional de **20%** sobre o seu salário base.
* **Desenvolvedor:** Recebe um adicional de **10%** sobre o seu salário base.
* **Vendedor:** Recebe uma comissão de **5%** calculada sobre o **total vendido no mês**, mantendo seu salário base fixo.
* **Remuneração Total:** É a soma direta do salário base com o valor da bonificação/comissão calculada.

---

## 3. Aplicação dos Pilares de POO

### Encapsulamento
* **Atributos Privados:** Campos como `nome`, `cpf`, `salario` (em `Funcionario`) e `totalMes` (em `Vendedor`) utilizam o modificador `private`, impedindo acesso ou alteração direta fora de seus escopos.
* **Validação no Construtor:** O estado inicial dos objetos é protegido defensivamente. Tentativas de cadastrar nomes em branco, CPFs vazios, salários $\le 0$ ou valores de vendas negativos disparam `IllegalArgumentException`.
* **Acesso Controlado:** Métodos seletores (`getters`) expõem apenas as informações necessárias para leitura.

### Abstração
* **Classe Abstrata (`Funcionario`):** Funciona como a espinha dorsal do sistema, impedindo instanciações genéricas (`new Funcionario(...)` é proibido pelo compilador).
* **Métodos Abstratos:** Os métodos `calcularBonificacao()` e `cargo()` definem um contrato obrigatório. A classe mãe estabelece *o que* deve ser feito, mas delega *como* fazer para as classes que possuem a responsabilidade real do cálculo.

### Herança e Polimorfismo
* **Reuso de Código:** `Gerente`, `Desenvolvedor` e `Vendedor` estendem `Funcionario` via `extends`, reutilizando a infraestrutura de dados base e o fluxo centralizado de `exibirHolerite()`.
* **Polimorfismo:** Na classe `Main`, uma única lista genérica (`ArrayList<Funcionario>`) armazena instâncias heterogêneas. Ao iterar sobre a coleção, chamadas a `f.exibirHolerite()` e `f.calcularRemuneracaoTotal()` resolvem dinamicamente a versão correta do método de cada classe filha em tempo de execução, sem necessidade de condicionais manuais (`if/else`).

---

## 4. Como Compilar e Executar

### Pré-requisitos
* Java Development Kit (JDK) versão 17 ou superior instalado.
* Git instalado.
* Terminal/Prompt de comando ou IntelliJ IDEA.

---

### Opção 1: Linha de Comando (Terminal)

1. Clone o repositório e navegue até a pasta raiz do módulo:
   ```bash
   git clone [https://github.com/kaimoralez/cursos.git](https://github.com/kaimoralez/cursos.git)
   cd cursos/senai/backend
Compile os arquivos fonte gerando os binários na pasta bin:

Bash
javac -d bin src/atividades/atv09/*.java
Execute a aplicação informando o classpath e a classe principal:

Bash
java -cp bin atividades.atv09.Main

---
### Opção 2: IntelliJ IDEA
Abra a pasta do repositório no IntelliJ (File > Open > selecione a pasta cursos).

No painel Project à esquerda, navegue pelo caminho:

senai ➔ backend ➔ src ➔ atividades ➔ atv09 ➔ Main.java.

Clique com o botão direito sobre o arquivo Main.java e selecione Run 'Main.main()' (ou clique no ícone verde de Play ao lado da assinatura da classe/método main).

---
##5. Exemplos de Execução
###Saída no Console (Execução com Sucesso)


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

---
### Demonstração de Tratamento de Dados Inválidos
Tentativas de instanciação fora das regras de negócio disparam exceções interceptáveis:

- Nome vazio:

new Desenvolvedor("", "12345678900", 5000.0)

Retorno: IllegalArgumentException: O nome não pode estar em branco
---

- CPF vazio:

new Gerente("Mariana", "", 8000.0)

Retorno: IllegalArgumentException: O cpf não pode ser em branco
---

- Salário inválido:

new Vendedor("Roberto", "12345678900", 0.0, 5000.0)

Retorno: IllegalArgumentException: O salário não pode ser igual a 0
---

- Vendas negativas:

new Vendedor("Roberto", "12345678900", 3000.0, -500.0)

Retorno: IllegalArgumentException: O valor é invalido
