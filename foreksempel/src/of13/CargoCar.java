package of13;

public class CargoCar extends TrainCar {

	private int cargoWeight;
	
	public CargoCar(int deadWeight, int cargoWeight) {
		super(deadWeight); // Hva skjer hvis super(deadWeight) kommenteres ut?
		this.cargoWeight = cargoWeight;
	}
	
	public int getCargoWeight() {
		return cargoWeight;
	}

	public void setCargoWeight(int cargoWeight) {
		this.cargoWeight = cargoWeight;
	}
	
}
