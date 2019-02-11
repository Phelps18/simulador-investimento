package framework.widgets.interfaces;

public interface IButton {
	/**
	 * Realiza a a��o de clicar no bot�o.
	 * 
	 * @return o pr�prio objeto bot�o.
	 */
	public abstract IButton click();

	/**
	 * Realiza a a��o de destacar o bot�o.
	 * 
	 */
	public abstract IButton highlight();
}