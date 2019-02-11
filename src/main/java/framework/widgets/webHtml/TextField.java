package framework.widgets.webHtml;

import static framework.utils.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import framework.utils.DSL;
import framework.utils.Highlighter;
import framework.widgets.interfaces.ITextField;

public class TextField extends SuperWebElement implements ITextField{
	public TextField(By by) {
		try {
			DSL.waitLoadElementClickable(by);
			this.element = getDriver().findElement(by);
			this.name = this.getElementName();
		} catch(NoSuchElementException ex) {
			System.out.println("NoSuchElementException");
		}
	}
	
	public TextField(WebElement element) {
		try {
			this.element = element;
			this.name = this.getElementName();
		} catch(NoSuchElementException ex) {
			System.out.println("NoSuchElementException");
		}
	}
	
	public ITextField setText(String paramText) {
		try {
			String getLabel = null;
			Highlighter.highlightElement(this.element);
			this.element.click();
			DSL.waitLoadElementClickable(this.element);
			this.element.sendKeys(paramText);
			
			try {
				getLabel = this.element.findElement(By.xpath("./preceding-sibling::label")).getText();
				getLabel = getLabel.replace("*", "");
				if(getLabel == null) {
					getLabel = "Not named";
				}
			} catch (NoSuchElementException ex) {
				getLabel = "Not named";
			}
			System.out.println("Texto \"" + paramText + "\" inserido no campo \"" + getLabel + "\".");
				
		} catch(NoSuchElementException ex) {
			System.out.println("NoSuchElementException");
		} catch (InvalidElementStateException ex) {
			System.out.println("InvalidElementStateException");
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException");
		}
		
		return this;
	}
}