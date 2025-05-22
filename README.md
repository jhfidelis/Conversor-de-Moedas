# Challenge Conversor de Moedas
O **Conversor de Moedas** é um desafio proposto na Formação [Oracle Next Education](https://www.oracle.com/br/education/oracle-next-education/), um programa de educação e empregabilidade com objetivo social de capacitar pessoas em tecnologia e conectá-las com o mercado de trabalho por meio das empresas parceiras que apoiam o programa.

## Sobre o Desafio
O desafio consiste na implementação de um sistema de conversão de moedas utilizando Java, com interação via console e utilizando uma API para obter os dados de câmbio atualizados.

## Funcionalidades
O sistema foi desenvolvido como uma aplicação de console, ou seja, não possui interface gráfica. Confira as principais funcionalidades do sistema:
- **Menu interativo:** apresenta opções de conversão de diferentes moedas.

- **Conversão de moedas:** permite inserir um valor e converter entre os pares de moedas disponíveis.

- **Validação de entrada:** trata erros como opções inválidas no menu.

- **Exibição do resultado:** mostra o valor convertido de forma clara e direta.

## Exemplo de execução

```bash
=============== CONVERSOR DE MOEDAS ===============

1 - Peso argentino (ARS)   =>  Dólar americano (USD)
2 - Dólar americano (USD)  =>  Peso argentino (ARS)
3 - Real brasileiro (BRL)  =>  Dólar americano (USD)
4 - Dólar americano (USD)  =>  Real brasileiro (BRL)
5 - Real brasileiro (BRL)  =>  Euro (EUR)
6 -            Euro (EUR)  =>  Real brasileiro (BRL)
7 - Dólar americano (USD)  =>  Euro (EUR)
8 -            Euro (EUR)  =>  Dólar americano (USD)
0 - Sair

Escolha a sua opção: 4
Insira o valor a ser convertido: 15,00

$ 15,00 USD é igual a $ 85,01 BRL

```

## Estrutura do projeto
O projeto foi desenvolvido com foco nos conceitos de orientação a objetos estudados durante a formação ONE até o momento. A API utilizada nesse projeto para fornecer valores das moedas de forma dinâmica é a [Exchange Rate](https://www.exchangerate-api.com/). Também foi utilizada a biblioteca GSON para formatar as respostas fornecidas pela API.

### Tecnologias utilizadas
- Java 17
- Exchange Rate API
- GSON

### Como executar o projeto
Caso queira testar essa aplicação em seu computador, verifique os seguintes requisitos:
- Java 17 ou superior instalado na sua máquina;
- Conta criada na Exchange Rate API para obter sua API Key;
- Biblioteca Gson configurada no projeto (adicione via Maven, Gradle ou manualmente).

Agora, siga essas etapas para realizar a execução desse projeto:
1. Clone esse repositório na sua máquina;
2. Abra o projeto na sua IDE (recomendado: IntelliJ IDEA);
3. No arquivo `ExchangeRateConsultation.java`, substitua o valor da variável `API_KEY` pela sua chave da Exchange Rate;
4. Verifique se a biblioteca Gson está configurada corretamente no seu projeto;
5. Por fim, execute a classe `Main.java` e realize as conversões no terminal.

