# [Automação] Simulador de investimentos - Sicredi

### Introdução
Foi criado uma automação de testes para o fluxo com sucesso do site "https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/"

### Objetivo
Idealização de uma prova de conceito, levando como premissa os itens citado abaixo atrelados com os conceitos de simplicidade e objetividade.

* Analise, planejamento e técnicas de teste.
* Mapeamento de cenários de testes.
* Orientação a objetos.
* Estrutura dos testes automatizados (Preparação, Execução e Validação).
* Arquitetura do projeto de automação (PageObjects, Features, Step Definitions, Datapool, Dataprovider, suites e Framework).
* Boas práticas de desenvolvimento de software (design pattern, clean code e etc).

### Descrição das ferramentas utilizadas
* Cucumber (Gherkin)
* Java (Maven project)
* Selenium WebDriver
* Framework Customizado (Criado para contemplar as funcionalidades simples que o Selenium WebDriver oferece, abstrair a complexidade, evitando duplicidade de código, obtendo maior agilidade na construção dos scripts)

### pré-requisitos para rodar o teste pela linha de comando
* Instalar JDK
* Instalar o Maven
* Configura-lós na variável de ambiente

#### Comandos da execução dos testes:
```sh
 > git clone https://github.com/Phelps18/simulador-investimento.git
 > cd simulador-investimento
 > mvn clean test
```