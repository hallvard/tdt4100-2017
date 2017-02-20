package encapsulation;

import java.util.Arrays;
import java.util.List;

public class Vehicle {
	
	private String registrationNumber;
	private char fuelType;
	private char vehicleType;
	private List<Character> validFuels = Arrays.asList('D', 'G', 'E', 'H');
	private List<Character> invalidLetters = Arrays.asList('Æ', 'Ø', 'Å');
	
	public Vehicle(char vehicleType, char fuelType, String registrationNumber){
		checkValidFuelAndVehicleType(fuelType, vehicleType);
		this.fuelType = fuelType;
		this.vehicleType = vehicleType;
		setRegistrationNumber(registrationNumber);
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	public char getFuelType() {
		return fuelType;
	}
	
	public char getVehicleType() {
		return vehicleType;
	}
	
	public void setRegistrationNumber(String regNr){
		checkRegistrationNumber(regNr);
		this.registrationNumber = regNr;
	}
	
	private void checkValidVehicleType(char vehicleType) {
		if (!(vehicleType == 'C' || vehicleType == 'M')){
			throw new IllegalArgumentException("vehicleType must be either C or M, but was " + vehicleType);
		}
	}

	private void checkValidFuelType(char fuelType) {
		if (!validFuels.contains(fuelType)){
			throw new IllegalArgumentException("Valid fuels are 'D', 'G', 'E' and 'H', not :" + fuelType);
		}
	}
	
	private void checkValidFuelAndVehicleType(char fuel, char vehicleType){
		checkValidFuelType(fuel);
		checkValidVehicleType(vehicleType);
		if(fuel == 'H' && vehicleType == 'M'){
			throw new IllegalArgumentException("fuel can not be hydrogen (H) when vehicle type is motorcycle (C)");
		}
	}

	private void checkRegistrationNumber(String regNr) {
		String regLetters = regNr.substring(0, 2);
		String regDigits = regNr.substring(2);
		checkValidLetters(regLetters);
		checkValidDigits(regDigits);
	}

	private void checkValidDigits(String regDigits) {
		if(vehicleType == 'C' && regDigits.length()!=5){
			throw new IllegalArgumentException("Cars should have a registration number with 5 digits");
		}
		if(vehicleType == 'M' && regDigits.length()!=4){
			throw new IllegalArgumentException("Motorcycles should have a registration number with 4 digits");
		}
		if (!isAllDigits(regDigits)){
			throw new IllegalArgumentException(regDigits + " should be digits");
		}
	}

	private boolean isAllDigits(String regDigits) {
		for (int i = 0; i < regDigits.length(); i++){
			if (!Character.isDigit(regDigits.charAt(i))){
				return false;
			}
		}
		return true;
	}

	private void checkValidLetters(String regLetters) {
		if(!(Character.isUpperCase(regLetters.charAt(0)) && Character.isUpperCase(regLetters.charAt(1)))){
			throw new IllegalArgumentException("Registration numbers should start with two uppercase letters but was: " + regLetters);
		}
		if(fuelType == 'E' && !(regLetters.equals("EL") || regLetters.equals("EK"))){
			throw new IllegalArgumentException("For electrical vehicles the letters should be EL or EK but was :" + regLetters);
		}
		if(fuelType == 'H' && !(regLetters.equals("HY"))){
			throw new IllegalArgumentException("For hydrogen vehicles the letters should be HY :" + regLetters);
		}
		if((fuelType == 'D' ||fuelType == 'G') && (regLetters.equals("EL")||regLetters.equals("EK")||regLetters.equals("HY"))){
			throw new IllegalArgumentException("For diesel and petrol vehicles the letters should not be EL, EK or HY, but was: " + regLetters);
		}
		if(invalidLetters.contains(regLetters.charAt(0))||invalidLetters.contains(regLetters.charAt(1))){
			throw new IllegalArgumentException("Letters should not be Æ, Ø or Å, but was " + regLetters);
		}
	}
}
