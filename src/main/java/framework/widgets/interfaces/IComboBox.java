package framework.widgets.interfaces;

public interface IComboBox {
	/**
	 * Realiza a ação de selecionar um valor no ComboBox.
	 * 
	 * @throws ComponentNotFoundException caso o ComboBox não seja encontrado.
	 * @return o próprio objeto combo box.
	 */
	public abstract IComboBox select(String value);

	/**
	 * Realiza a ação de clicar no combobox.
	 * 
	 */
	public abstract IComboBox click();
}