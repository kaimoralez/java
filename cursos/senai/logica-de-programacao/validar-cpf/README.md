🔍 Validador de CPF em Java
📌 Objetivo

Este projeto tem como objetivo validar um número de CPF (Cadastro de Pessoas Físicas) utilizando a linguagem Java, aplicando regras de validação estrutural e matemática.

⚙️ Funcionalidades

O sistema realiza as seguintes validações:

✔ Remove caracteres especiais (pontos e hífen)
✔ Verifica se o CPF possui 11 dígitos
✔ Garante que todos os caracteres são numéricos
✔ Detecta CPFs com todos os números iguais (ex: 11111111111)
✔ Calcula e valida os dois dígitos verificadores



🧪 Exemplo de uso

Entrada:

Informe seu CPF:
123.456.789-09

Saída:

CPF válido!
❌ Exemplo inválido

Entrada:

111.111.111-11

Saída:

CPF inválido
🧠 Lógica utilizada

A validação do CPF é feita em duas etapas principais:

Validação estrutural
Cálculo dos dígitos verificadores

Mais detalhes sobre o algoritmo estão disponíveis na documentação do projeto.

📁 Estrutura do projeto
validar-cpf/
│
├── Main.java
└── README.md
🚀 Tecnologias utilizadas
Java
Lógica de programação
Manipulação de strings
👨‍💻 Autor

Desenvolvido por Kaique Pereira
