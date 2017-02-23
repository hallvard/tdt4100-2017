package encapsulation;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class VehicleController {
	
	private Vehicle vehicle;
	
	@FXML private TextField getVehicleTextField;
	@FXML private TextField getFuelTextField;
	@FXML private TextField getRNTextField;
	
	@FXML private TextField setVehicleTextField;
	@FXML private TextField setFuelTextField;
	@FXML private TextField setRNTextField;
	
	@FXML
	private void initialize() {
		getVehicleTextField.setDisable(true);
		getFuelTextField.setDisable(true);
		getRNTextField.setDisable(true);
	}
	
	private void update() {
		getVehicleTextField.setText(Character.toString(vehicle.getVehicleType()));
		getFuelTextField.setText(Character.toString(vehicle.getFuelType()));
		getRNTextField.setText(vehicle.getRegistrationNumber());
		
	}

	@FXML
	private void create() {
		char type = setVehicleTextField.getText().charAt(0);
		char fuel = setFuelTextField.getText().charAt(0);
		String rn = setRNTextField.getText();
		vehicle = new Vehicle(type, fuel, rn); 
		update(); 
	}
	

}
