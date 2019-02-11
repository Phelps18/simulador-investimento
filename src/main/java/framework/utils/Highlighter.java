package framework.utils;

import static framework.utils.DriverFactory.getDriver;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class Highlighter {
	public static final String HIGHLIGHT_JAVASCRIPT = "arguments[0].style.outline='2px solid red'";
	public static final String REMOVE_HIGHLIGHT_JAVASCRIPT = "arguments[0].style.outline='none'";
	
	public static void highlightElement(WebElement element) {
		executeJs(element, HIGHLIGHT_JAVASCRIPT);
	}
	
	public static void removeHighlightElement(WebElement element) {
		executeJs(element, REMOVE_HIGHLIGHT_JAVASCRIPT);
	}
	
	private static void executeJs(WebElement element, String js) {
		try {
			if(getDriver() instanceof JavascriptExecutor) {
				((JavascriptExecutor) getDriver()).executeScript(js, element);
			}
		} catch (StaleElementReferenceException ex) {
			System.out.println("Não foi possível aplicar highlight no elemento01.");
		} catch (JavascriptException ex) {
			System.out.println("Não foi possível aplicar highlight no elemento02.");
		} catch (WebDriverException ex) {
			System.out.println("Não foi possível aplicar highlight no elemento03.");
		}
	}
}