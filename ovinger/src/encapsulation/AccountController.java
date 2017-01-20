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
	
	@FXML private TextArea exceptionTextArea;

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
	
	private void showException(Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		pw.write(e.getMessage() != null ? e.getMessage() : "No message");
		pw.write("\n\n");
		e.printStackTrace(pw);
		exceptionTextArea.setText(sw.toString());
	}
	
	private void clearException() {
		exceptionTextArea.setText("");
	}
	
	private void tryAccountManipulation(UnaryOperator<Account> operator) {
		try {
			account = operator.apply(account);
		}
		catch (Exception e) {
			showException(e);
			throw e;
		}
		finally {
			update();
		}
		
		clearException();	
	}
	
	private void tryAccountManipulation(Consumer<Account> consumer) {
		tryAccountManipulation((a) -> {
			consumer.accept(a);
			return a;
		});
	}
	
	@FXML
	private void handleNewAccount() {
		tryAccountManipulation((a) -> {
			double balance = getDoubleFromTextField(newAccountBalanceTextField);
			double interestRate = getDoubleFromTextField(newAccountInterestRateTextField);
			return new Account(balance, interestRate);
		});
	}
	
	@FXML
	private void handleDeposit() {
		tryAccountManipulation((a) -> {
			double amount = getDoubleFromTextField(depositTextField);
			account.deposit(amount);
		});
	}
	
	@FXML
	private void handleSetInterestRate() {
		tryAccountManipulation((a) -> {
			double interestRate = getDoubleFromTextField(setInterestRateTextField);
			account.setInterestRate(interestRate);
		});
	}
	
	@FXML
	private void handleAddInterest() {
		tryAccountManipulation((a) -> account.addInterest());
	}
	
	@FXML
	private void handleWithdrawal() {
		tryAccountManipulation((a) -> {
			double amount = getDoubleFromTextField(withdrawTextField);
			account.withdraw(amount);
		});
	}
}
