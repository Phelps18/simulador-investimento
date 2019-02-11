package framework.widgets.webHtml;

import static framework.utils.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import framework.utils.DSL;
import framework.utils.Highlighter;
import framework.widgets.interfaces.IButton;

public class Button extends SuperWebElement implements IButton{
	public Button(By by) {
		try {
			DSL.waitLoadElementClickable(by);
			this.element = getDriver().findElement(by);
			this.name = this.getElementName();
		} catch(NoSuchElementException ex) {
			System.out.println("Falhou ao mostrar o OBJETO_NAO_ENCONTRADO");
		}
	}
	
	public Button(WebElement element) {	
		try {
			this.element = element;
			this.name = this.getElementName();
		} catch(NoSuchElementException ex) {
			System.out.println("Falhou ao mostrar o OBJETO_NAO_ENCONTRADO");
		}
	}
	
	public IButton click() {
		try {
			Highlighter.highlightElement(this.element);
			this.element.click();
			
		} catch (NoSuchElementException ex) {
			System.out.println("Falhou ao mostrar o OBJETO_NAO_ENCONTRADO");
		} catch (InvalidElementStateException ex) {
			System.out.println("Falhou ao mostrar o OBJETO_DESABILITADO");
		} catch (NullPointerException ex) {
			System.out.println("Falhou ao mostrar o CLICK_FAIL");
		}
		
		return this;
	}
	
	public IButton highlight() {
		try {
			DSL.waitLoadElementClickable(this.element);
			Highlighter.highlightElement(this.element);
			
		} catch (NoSuchElementException ex) {
			System.out.println("Falhou ao mostrar o OBJETO_NAO_ENCONTRADO");
		} catch (InvalidElementStateException ex) {
			System.out.println("Falhou ao mostrar o OBJETO_DESABILITADO");
		} catch (NullPointerException ex) {
			System.out.println("Falhou ao mostrar o CLICK_FAIL");
		}
		
		return this;
	}
}