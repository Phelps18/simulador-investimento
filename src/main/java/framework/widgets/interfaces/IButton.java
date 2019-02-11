package framework.widgets.interfaces;

public interface IButton {
	/**
	 * Realiza a ação de clicar no botão.
	 * 
	 * @return o próprio objeto botão.
	 */
	public abstract IButton click();

	/**
	 * Realiza a ação de destacar o botão.
	 * 
	 */
	public abstract IButton highlight();
}