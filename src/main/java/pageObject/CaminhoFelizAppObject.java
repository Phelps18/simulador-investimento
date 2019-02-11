package pageObject;

import org.openqa.selenium.By;

import framework.widgets.interfaces.IButton;
import framework.widgets.interfaces.IComboBox;
import framework.widgets.interfaces.ITextField;
import framework.widgets.webHtml.Button;
import framework.widgets.webHtml.ComboBox;
import framework.widgets.webHtml.TextField;

public class CaminhoFelizAppObject {
	
	public ITextField getValorAplicacaoTextField() {
		return new TextField(By.id("valorAplicar"));
	}
	
	public ITextField getInvestmentoPorMesTextField() {
		return new TextField(By.id("valorInvestir"));
	}
	
	public ITextField getQtdTempoTextField() {
		return new TextField(By.id("tempo"));
	}
	
	public IComboBox getExpandirPeriodoComboBox() {
		return new ComboBox(By.className("btSelect"));
	}
	
	public IComboBox getPeriodoComboBox() {
		return new ComboBox(By.xpath("//ul[@class = 'listaSelect']/li/a[@rel = 'A']"));
	}
	
	public IButton getSimularButton() {
		return new Button(By.xpath("//button[@type='submit']"));
	}
	
	public IButton getRefazerButton() {
		return new Button(By.xpath("//a[@class='btn btnAmarelo btnRefazer']"));
	}
}