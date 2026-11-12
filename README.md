# Treinamento Java Básico

![Java](https://img.shields.io/badge/Java-17+-ED8B00?logo=openjdk&logoColor=white)
![DIO](https://img.shields.io/badge/Bootcamp-DIO%20%2B%20Claro-E94D5F)

Exercícios que resolvi durante o bootcamp **Coding The Future Claro — Java com Spring Boot**, da [DIO](https://www.dio.me/). O repositório registra meus primeiros passos na linguagem: entrada de dados pelo terminal, controle de fluxo, laços de repetição e orientação a objetos.

## Conteúdo

| Pasta | Tema | O que pratiquei |
|-------|------|-----------------|
| [`Projeto Conta Banco`](Projeto%20Conta%20Banco/ContaTerminal/src) | Entrada de dados | Leitura com `Scanner`, tipos de variáveis e concatenação de texto |
| [`Controle-fluxo`](Controle-fluxo/src) | Condicionais | `if/else`, operador ternário e `switch case` |
| [`Estruturas-de-repeticao`](Estruturas-de-repeticao/Estudo-estruturas-repeticao-Java/src) | Laços | `for`, `for` percorrendo array, `while` e `do while` |
| [`Sistema de TV`](Sistema%20de%20TV/sistema-smart-tv/src) | Orientação a objetos | Classe, atributos, métodos e criação de objeto |

## Exercícios

### Projeto Conta Banco
Desafio de projeto do bootcamp. O programa `ContaTerminal` pede número da conta, agência, nome e saldo pelo terminal e devolve uma mensagem de boas-vindas com os dados informados.

### Controle de fluxo
- `CaixaEletronico` — verifica se há saldo antes de liberar o saque
- `ResultadoEscolar` — classifica a nota em aprovado, recuperação ou reprovado com `if/else if`
- `ResultadoEscolarTernario` — o mesmo exercício resolvido com operador ternário
- `SistemaMedida` — converte a sigla P, M ou G no tamanho correspondente com `switch`
- `PlanoOperadoraTelefonia` — mostra os benefícios de cada plano, aceitando maiúsculas e minúsculas no `case`

### Estruturas de repetição
- `exemploEstruturaFor` — contagem simples com `for`
- `estruturaRepeticaoForArray` — percorre uma lista de alunos pelo índice
- `ExemploWhile` — gasta a mesada em doces de valor aleatório até o saldo zerar
- `ExemploDoWhile` — o telefone toca até alguém atender, com sorteio a cada toque

### Sistema de TV
Primeira classe com estado e comportamento. `SmartTv` guarda se está ligada, o canal e o volume, e oferece métodos para ligar, desligar, trocar de canal e ajustar o volume. A classe `Usuario` cria a TV e usa cada método.

## Como executar

Requisito: JDK 17 ou superior.

Cada pasta é um projeto independente. Entre na pasta `src` do exercício, compile e rode:

```bash
cd Controle-fluxo/src
javac CaixaEletronico.java
java CaixaEletronico
```

No Sistema de TV, compile as duas classes juntas:

```bash
cd "Sistema de TV/sistema-smart-tv/src"
javac SmartTv.java Usuario.java
java Usuario
```

Também dá para abrir qualquer pasta no VS Code com o *Extension Pack for Java* e executar pelo botão **Run**.

## Autor

**Italo Ismailey** — Palmas, TO · [GitHub](https://github.com/italoismailey)
