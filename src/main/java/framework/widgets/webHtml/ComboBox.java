package framework.widgets.webHtml;

import static framework.utils.DriverFactory.getDriver;

import javax.xml.ws.WebServiceException;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import framework.utils.DSL;
import framework.utils.Highlighter;
import framework.widgets.interfaces.IComboBox;

public class ComboBox extends SuperWebElement implements IComboBox {
	public ComboBox(By by) {
		try {
			DSL.waitLoadElementClickable(by);
			this.element = getDriver().findElement(by);
			this.name = this.getElementName();
		} catch (NoSuchElementException ex) {
			System.out.println("OBJETO_NAO_ENCONTRADO");
		}
	}

	public ComboBox(WebElement element) {
		try {
			this.element = element;
			this.name = this.getElementName();
		} catch (NoSuchElementException ex) {
			System.out.println("OBJETO_NAO_ENCONTRADO");
		}
	}

	public IComboBox select(String paramText) {
		try {

			DSL.waitLoadElementClickable(this.element);
			Highlighter.highlightElement(this.element);
			this.element.click();
			Select select = new Select(this.element);
			select.selectByVisibleText(paramText);
			String getLabel = null;

			try {
				getLabel = this.element.findElement(By.xpath("./preceding-sibling::label")).getText();
			} catch (NoSuchElementException ex) {
				getLabel = "Not named";
			}

			String screenText = select.getFirstSelectedOption().getText();
			String screenTextResult = screenText.replaceAll("[^\\p{L}\\p{Z}]", "").trim();
			String paramTextResult = paramText.replaceAll("[^\\p{L}\\p{Z}]", "").trim();

			if (screenTextResult.equalsIgnoreCase(paramTextResult)) {
				System.out.println("Texto \"" + paramText + "\" selecionado no campo \"" + getLabel + "\".");
			} else if (getLabel.isEmpty()) {
				System.out.println("Não foi possível retornar o nome do campo, cujo o texto selecionado é: \""
						+ paramText + "\".");
			} else if (screenText.isEmpty()) {
				System.out.println("Erro ao selecionar o Texto \"" + paramText + "\" no campo \"" + getLabel + "\".");
				throw new WebServiceException(
						"Erro ao inserir o Texto \"" + paramText + "\" no campo \"" + getLabel + "\".");
			}

		} catch (NoSuchElementException ex) {
			System.out.println("OBJETO_NAO_ENCONTRADO");
		} catch (InvalidElementStateException ex) {
			System.out.println("OBJETO_DESABILITADO");
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException");
		}

		return this;
	}

	public IComboBox click() {
		try {
			Thread.sleep(200);
			DSL.waitLoadElementClickable(this.element);
			Highlighter.highlightElement(this.element);
			this.element.click();

		} catch (NoSuchElementException ex) {
			System.out.println("NoSuchElementException");
		} catch (InvalidElementStateException ex) {
			System.out.println("InvalidElementStateException");
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException");
		} catch (InterruptedException e) {
			System.out.println("InterruptedException");
		}

		return this;
	}
}