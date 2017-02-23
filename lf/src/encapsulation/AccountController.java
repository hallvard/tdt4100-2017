package encapsulation;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class AccountController {
	
	private Account account;
	
	@FXML private TextField newAccountBalanceTextField;
	@FXML private TextField newAccountInterestRateTextField;
	
	@FXML private TextField getBalanceTextField;
	@FXML private TextField getInterestRateTextField;
	
	@FXML private TextField depositTextField;
	@FXML private TextField withdrawTextField; 
	@FXML private TextField setInterestRateTextField;
	
	@FXML private Button depositButton;
	@FXML private Button withdrawButton; 
	@FXML private Button setInterestRateButton;
	@FXML private Button addInterestButton;

	@FXML
	private void initialize() {
		getBalanceTextField.setDisable(true);
		getInterestRateTextField.setDisable(true);
		update();
	}
	
	private void update() {
		if(account == null) {
			depositTextField.setDisable(true);
			withdrawTextField.setDisable(true);
			setInterestRateTextField.setDisable(true);
			depositButton.setDisable(true);
			withdrawButton.setDisable(true);
			setInterestRateButton.setDisable(true);
			addInterestButton.setDisable(true);
		}
		else {
			depositTextField.setDisable(false);
			withdrawTextField.setDisable(false);
			setInterestRateTextField.setDisable(false);
			depositButton.setDisable(false);
			withdrawButton.setDisable(false);
			setInterestRateButton.setDisable(false);
			addInterestButton.setDisable(false);
			
			getBalanceTextField.setText(Double.toString(account.getBalance()));
			getInterestRateTextField.setText(Double.toString(account.getInterestRate()));
		}
	}
	
	
	
	private double getDoubleFromTextField(TextField textField) {
		return Double.parseDouble(textField.getText());
	}
	
	
	@FXML
	private void handleNewAccount() {
		double balance = getDoubleFromTextField(newAccountBalanceTextField);
		double interestRate = getDoubleFromTextField(newAccountInterestRateTextField);
		account =  new Account(balance, interestRate);
		update();
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
	
	@FXML
	private void handleWithdrawal() {
		double amount = getDoubleFromTextField(withdrawTextField);
		account.withdraw(amount);
		update();
	}
}
