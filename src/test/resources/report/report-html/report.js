$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/simulador.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 2,
  "name": "Com o propósito de Simular um Investimento na Poupança, como um Associado",
  "description": "Eu gostaria de preencher o formulário de simulação\r\nE ver a tabela de resultado com Mês e Valor.",
  "id": "com-o-propósito-de-simular-um-investimento-na-poupança,-como-um-associado",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Validar o fluxo feliz do teste",
  "description": "",
  "id": "com-o-propósito-de-simular-um-investimento-na-poupança,-como-um-associado;validar-o-fluxo-feliz-do-teste",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "line": 10,
  "name": "preencher o valor R$ \u003cvalorAplicar\u003e para aplicação",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "preencher o campo da quantidade para poupar todo mês, com o valor R$ \u003cvalorInvestir\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "selecione a opção \u003ctipoPeriodo\u003e para o calculo do período",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "preencher \u003ctempoPoupar\u003e anos para a quantidade de tempo da aplicação",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "clicar no botão simular",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "deve aparecer um bloco de resultado da simulação",
  "keyword": "Então "
});
formatter.step({
  "line": 16,
  "name": "clicar para Refazer a simulação",
  "keyword": "E "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "com-o-propósito-de-simular-um-investimento-na-poupança,-como-um-associado;validar-o-fluxo-feliz-do-teste;",
  "rows": [
    {
      "cells": [
        "valorAplicar",
        "valorInvestir",
        "tempoPoupar",
        "tipoPeriodo"
      ],
      "line": 19,
      "id": "com-o-propósito-de-simular-um-investimento-na-poupança,-como-um-associado;validar-o-fluxo-feliz-do-teste;;1"
    },
    {
      "cells": [
        "1000000",
        "100000",
        "5",
        "Anos"
      ],
      "line": 20,
      "id": "com-o-propósito-de-simular-um-investimento-na-poupança,-como-um-associado;validar-o-fluxo-feliz-do-teste;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 7,
  "name": "que o associado acesse o simulador de investimento do Sicredi",
  "keyword": "Dado "
});
formatter.match({
  "location": "CaminhoFelizSteps.acessarSite()"
});
formatter.result({
  "duration": 7483084560,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Validar o fluxo feliz do teste",
  "description": "",
  "id": "com-o-propósito-de-simular-um-investimento-na-poupança,-como-um-associado;validar-o-fluxo-feliz-do-teste;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "line": 10,
  "name": "preencher o valor R$ 1000000 para aplicação",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "preencher o campo da quantidade para poupar todo mês, com o valor R$ 100000",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "selecione a opção Anos para o calculo do período",
  "matchedColumns": [
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "preencher 5 anos para a quantidade de tempo da aplicação",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "clicar no botão simular",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "deve aparecer um bloco de resultado da simulação",
  "keyword": "Então "
});
formatter.step({
  "line": 16,
  "name": "clicar para Refazer a simulação",
  "keyword": "E "
});
formatter.match({
  "arguments": [
    {
      "val": "1000000",
      "offset": 21
    }
  ],
  "location": "CaminhoFelizSteps.preencherValorAplicacao(String)"
});
formatter.result({
  "duration": 1757912587,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100000",
      "offset": 69
    }
  ],
  "location": "CaminhoFelizSteps.preencherQtdInvestida(String)"
});
formatter.result({
  "duration": 1252967205,
  "status": "passed"
});
formatter.match({
  "location": "CaminhoFelizSteps.selecioneOpcaoPeriodo()"
});
formatter.result({
  "duration": 3366089810,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 10
    }
  ],
  "location": "CaminhoFelizSteps.preencherQtdTempo(String)"
});
formatter.result({
  "duration": 1081098102,
  "status": "passed"
});
formatter.match({
  "location": "CaminhoFelizSteps.submeterSimulado()"
});
formatter.result({
  "duration": 609377588,
  "status": "passed"
});
formatter.match({
  "location": "CaminhoFelizSteps.evidenciarResultado()"
});
formatter.result({
  "duration": 574299224,
  "status": "passed"
});
formatter.match({
  "location": "CaminhoFelizSteps.refazerSimulacao()"
});
formatter.result({
  "duration": 1073591740,
  "status": "passed"
});
formatter.after({
  "duration": 735786313,
  "status": "passed"
});
});