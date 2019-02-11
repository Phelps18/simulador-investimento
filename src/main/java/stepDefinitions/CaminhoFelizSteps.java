package stepDefinitions;

import static framework.utils.DriverFactory.*;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;
import framework.utils.ScreenShot;
import pageObject.CaminhoFelizAppObject;

public class CaminhoFelizSteps {
	
	private WebDriver driver = getDriver();
	private CaminhoFelizAppObject caminhoFeliz = new CaminhoFelizAppObject();
	
	@Dado("^que o associado acesse o simulador de investimento do Sicredi$")
	public void acessarSite() {
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
	}
	
	@Quando("^preencher o valor R\\$ (\\d+) para aplica��o$")
	public void preencherValorAplicacao(String arg1) {
		caminhoFeliz.getValorAplicacaoTextField().setText(arg1);
	}

	@E("^preencher o campo da quantidade para poupar todo m�s, com o valor R\\$ (\\d+)$")
	public void preencherQtdInvestida(String arg1) {
		caminhoFeliz.getInvestmentoPorMesTextField().setText(arg1);
	}

	@E("^preencher (\\d+) anos para a quantidade de tempo da aplica��o$")
	public void preencherQtdTempo(String arg1) {
		caminhoFeliz.getQtdTempoTextField().setText(arg1);
	}
	
	@E("^selecione a op��o Anos para o calculo do per�odo$")
	public void selecioneOpcaoPeriodo() {
		caminhoFeliz.getExpandirPeriodoComboBox().click();
		caminhoFeliz.getPeriodoComboBox().click();
	}
	
	@E("^clicar no bot�o simular$")
	public void submeterSimulado() {
		caminhoFeliz.getSimularButton().click();
	}

	@Ent�o("^deve aparecer um bloco de resultado da simula��o$")
	public void evidenciarResultado() {
		ScreenShot.capture();
	}

	@E("^clicar para Refazer a simula��o$")
	public void refazerSimulacao() {
		caminhoFeliz.getRefazerButton().click();
	}
	
	@After
	public void tearDown() {
		killDriver();
	}
}