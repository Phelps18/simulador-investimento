package framework.widgets.webHtml;

import org.openqa.selenium.WebElement;

public class SuperWebElement {
	protected WebElement element;
	protected String name;
	
	public boolean existsElement() {
		return this.element != null;
	}
	
	public String getElementName() {
		if(!this.element.getText().isEmpty()) {
			return this.element.getText();
		} else if(this.element.getAttribute("value") != null && !this.element.getAttribute("value").isEmpty()) {
			return this.element.getAttribute("value");
		}  else if(this.element.getAttribute("name") != null && !this.element.getAttribute("name").isEmpty()) {
			return this.element.getAttribute("name");
		} else {
			return "not named";
		}
	}
	
	public String getMsg(String base) {
		if(this.name != null) {
			return String.format(base, getClass().getSimpleName(), this.name);
		} else {
			return String.format(base, getClass().getSimpleName(), this.name);
		}
	}
}