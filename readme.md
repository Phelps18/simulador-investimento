# Orientações para execução de testes de Front-end do AutoCredenciamento

## Configuração das ferramentas na estação
No link abaixo, encontram-se as orientações para configuração do ambiente para execução dos testes:
[Documentação para configuração do Java e Maven](http://gn1621cb:8090/confluence/pages/viewpage.action?pageId=8920170)

## Instalação da aplicação de testes

#### Realizar o download do repositório:
```sh
 > git clone https://rs18007@bitbucket.getnet.com.br/scm/crd/frontend-test.git
```

#### Comandos para efetuar a execução da bateria de testes:
```sh
 > cd frontend-test
 > mvn clean -Dtest=RegressionSuite -Durl="http://gncasnhl00118.getnet.local/precadastro" test
```