package encapsulation;

import java.time.ZoneId;
import java.util.Date;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
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
	
	@FXML
	private void onSetName() {
		person.setName(setNameTextField.getText());
		update();
	}
	
	@FXML
	private void onSetGender() {
		if(setGenderTextField.getText().length() != 1) {
			throw new IllegalArgumentException("Gender must be one character (this was caught by the FXML-application controller)");
		}
		person.setGender(setGenderTextField.getText().charAt(0));
		update();
	}
	
	@FXML
	private void onSetEmail() {
		person.setEmail(setEmailTextField.getText());
		update();
	}
	
	@FXML
	private void onSetSSN() {
		person.setSSN(setSSNTextField.getText());
		update();
	}
	
	@FXML
	private void onSetBirthday() {
		person.setBirthday(new Date(setBirthdayDatePicker.getValue().atStartOfDay(ZoneId.systemDefault()).toEpochSecond() * 1000));
		update();
	}

}
