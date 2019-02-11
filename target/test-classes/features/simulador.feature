# language: pt
Funcionalidade: Com o propósito de Simular um Investimento na Poupança, como um Associado
  Eu gostaria de preencher o formulário de simulação
  E ver a tabela de resultado com Mês e Valor.

  Contexto: 
    Dado que o associado acesse o simulador de investimento do Sicredi

  Esquema do Cenário: Validar o fluxo feliz do teste
    Quando preencher o valor R$ <valorAplicar> para aplicação
    E preencher o campo da quantidade para poupar todo mês, com o valor R$ <valorInvestir>
    E selecione a opção <tipoPeriodo> para o calculo do período
    E preencher <tempoPoupar> anos para a quantidade de tempo da aplicação
    E clicar no botão simular
    Então deve aparecer um bloco de resultado da simulação
    E clicar para Refazer a simulação

    Exemplos: 
      | valorAplicar | valorInvestir | tempoPoupar | tipoPeriodo |
      |      1000000 |        100000 |           5 | Anos        |
