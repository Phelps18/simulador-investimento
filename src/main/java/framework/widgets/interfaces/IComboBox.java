package framework.widgets.interfaces;

public interface IComboBox {
	/**
	 * Realiza a a��o de selecionar um valor no ComboBox.
	 * 
	 * @throws ComponentNotFoundException caso o ComboBox n�o seja encontrado.
	 * @return o pr�prio objeto combo box.
	 */
	public abstract IComboBox select(String value);

	/**
	 * Realiza a a��o de clicar no combobox.
	 * 
	 */
	public abstract IComboBox click();
}