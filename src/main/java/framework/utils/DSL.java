package framework.utils;

import static framework.utils.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSL {
	private static int TIMEOUT_IN_SECONDS = 70;
	public static void waitLoadElementClickable(By by) {
		
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), TIMEOUT_IN_SECONDS);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
			
			while(TIMEOUT_IN_SECONDS != 0) {
				if(element.isDisplayed() && element.isEnabled()) {
					Thread.sleep(200);
					break;
				}
				Thread.sleep(1000);
				TIMEOUT_IN_SECONDS--;
			}
		} catch (TimeoutException ex) {
			System.out.println("TimeoutException");
			 throw new TimeoutException();
		} catch (InterruptedException ex) {
			System.out.println("InterruptedException");
		} catch (NullPointerException ex) {
			System.out.println("NULL_POINTER_EXCEPTION");
		}
	}
	
	public static void waitLoadElementClickable(WebElement element) {
		
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), TIMEOUT_IN_SECONDS);
			element = wait.until(ExpectedConditions.elementToBeClickable(element));
			
			while(TIMEOUT_IN_SECONDS != 0) {
				if(element.isDisplayed() && element.isEnabled()) {
					Thread.sleep(200);
					break;
				}
				Thread.sleep(1000);
				TIMEOUT_IN_SECONDS--;
			}
		} catch (TimeoutException ex) {
			System.out.println("TIME_OUT_EXPECPTION");
			 throw new TimeoutException();
		} catch (InterruptedException ex) {
			System.out.println("INTERRUPTED_EXCEPTION");
		} catch (NullPointerException ex) {
			System.out.println("NULL_POINTER_EXCEPTION");
		}
	}
	
	public static void waitLoadElementVisibility(By by) {
		WebElement element = null;
		
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), TIMEOUT_IN_SECONDS);
			
			while(TIMEOUT_IN_SECONDS != 0) {
				element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
				
				if(element.isDisplayed() && element.isEnabled()) {
					Thread.sleep(200);
					break;
				}
				Thread.sleep(1000);
				TIMEOUT_IN_SECONDS--;
			}
		} catch (TimeoutException ex) {
			System.out.println("TimeoutException");
			 throw new TimeoutException();
		} catch (InterruptedException ex) {
			System.out.println("InterruptedException");
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException");
		}
	}
	
	public static boolean isElementVisible(String xpath) {
		boolean result = false;
		WebElement elem = null;
		
		try {
			while(TIMEOUT_IN_SECONDS != 0) {
				
				try {
					elem = getDriver().findElement(By.xpath(xpath));
				} catch (NoSuchElementException e) {}
				
				if(elem != null) {
					result = true;
					Thread.sleep(200);
					break;
				} else if(TIMEOUT_IN_SECONDS == 1) {
					System.out.println("OBJETO_NAO_ENCONTRADO");
				}
				Thread.sleep(1000);
				TIMEOUT_IN_SECONDS--;
			}
			
		} catch (TimeoutException ex) {
			System.out.println("TimeoutException");
			throw new TimeoutException();
		} catch (InterruptedException ex) {
			System.out.println("InterruptedException");
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException");
		}
		return result;
	}
	
	public static void waitLoadElement(WebElement element, int timeOutInSeconds) {
		
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), TIMEOUT_IN_SECONDS);
			WebElement waitElement = wait.until(ExpectedConditions.visibilityOf(element));
			
			while(timeOutInSeconds != 0) {
				if(waitElement.isDisplayed() && waitElement.isEnabled()) {
					Thread.sleep(200);
					break;
				}
				Thread.sleep(1000);
				timeOutInSeconds--;
			}
		} catch (TimeoutException ex) {
			System.out.println("TimeoutException");
			 throw new TimeoutException();
		} catch (InterruptedException ex) {
			System.out.println("InterruptedException");
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException");
		}
	}
	
	public static void switchToFrontWindow() {
		for (String winHandle : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(winHandle);
		}
	}
	
	public static void switchToDefaltContent() {
		getDriver().switchTo().defaultContent();
	}
	
	public static void switchToFrame(String id) {
		waitLoadElementVisibility(By.id(id));
		getDriver().switchTo().frame(id);
	}
}