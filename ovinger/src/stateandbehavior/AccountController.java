package stateandbehavior;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AccountController {
	
	private Account account;
	
	@FXML
	private Text toStringText;
	
	@FXML
	private TextField getBalanceTextField;
	@FXML
	private TextField getInterestRateTextField;
	
	@FXML
	private TextField depositTextField;
	@FXML
	private TextField setInterestRateTextField;

	@FXML
	private void initialize() {
		getBalanceTextField.setDisable(true);
		getInterestRateTextField.setDisable(true);
		account = new Account();
		update();
	}
	
	private void update() {
		toStringText.setText(account.toString());
		getBalanceTextField.setText(Double.toString(account.getBalance()));
		getInterestRateTextField.setText(Double.toString(account.getInterestRate()));
	}
	
	private double getDoubleFromTextField(TextField textField) {
		return Double.parseDouble(textField.getText());
	}
	
	@FXML
	private void handleDeposit() {
		double amount = getDoubleFromTextField(depositTextField);
		account.deposit(amount);
		update();
	}
	
	@FXML
	private void handleSetInterestRate() {
		double interestRate = getDoubleFromTextField(setInterestRateTextField);
		account.setInterestRate(interestRate);
		update();
	}
	
	@FXML
	private void handleAddInterest() {
		account.addInterest();
		update();
	}
}
