package encapsulation;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.ZoneId;
import java.util.Date;
import java.util.function.Consumer;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PersonController {
	
	private Person person;
	
	@FXML private TextField getNameTextField;
	@FXML private TextField getGenderTextField;
	@FXML private TextField getEmailTextField;
	@FXML private TextField getSSNTextField;
	@FXML private DatePicker getBirthdayDatePicker;
	
	@FXML private TextField setNameTextField;
	@FXML private TextField setGenderTextField;
	@FXML private TextField setEmailTextField;
	@FXML private TextField setSSNTextField;
	@FXML private DatePicker setBirthdayDatePicker;
	
	@FXML private TextArea exceptionTextArea;
	
	@FXML
	private void initialize() {
		person = new Person();
		getNameTextField.setDisable(true);
		getGenderTextField.setDisable(true);
		getEmailTextField.setDisable(true);
		getSSNTextField.setDisable(true);
		getBirthdayDatePicker.setDisable(true);
		update();
	}
	
	private void update() {
		getNameTextField.setText(person.getName());
		getGenderTextField.setText(Character.toString(person.getGender()));
		getEmailTextField.setText(person.getEmail());
		getSSNTextField.setText(person.getSSN());
		if(person.getBirthday() != null) {
			getBirthdayDatePicker.setValue(person.getBirthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
		}
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
	
	private void tryPersonManipulation(Consumer<Person> personConsumer) {
		try {
			personConsumer.accept(person);
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
	
	@FXML
	private void onSetName() {
		tryPersonManipulation((p) -> p.setName(setNameTextField.getText()));
	}
	
	@FXML
	private void onSetGender() {
		tryPersonManipulation((p) -> {
			if(setGenderTextField.getText().length() != 1) {
				throw new IllegalArgumentException("Gender must be one character (this was caught by the FXML-application controller)");
			}
			p.setGender(setGenderTextField.getText().charAt(0));
		});
	}
	
	@FXML
	private void onSetEmail() {
		tryPersonManipulation((p) -> p.setEmail(setEmailTextField.getText()));
	}
	
	@FXML
	private void onSetSSN() {
		tryPersonManipulation((p) -> p.setSSN(setSSNTextField.getText()));
	}
	
	@FXML
	private void onSetBirthday() {
		tryPersonManipulation((p) -> p.setBirthday(new Date(setBirthdayDatePicker.getValue().atStartOfDay(ZoneId.systemDefault()).toEpochSecond() * 1000)));
	}

}
