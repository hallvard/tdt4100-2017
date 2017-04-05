package of13;

public class TrainCar {
	
	private int deadWeight;
	
	public TrainCar(int deadWeight) {
		this.deadWeight = deadWeight;
	}
	
	public int getTotalWeight() {
		return deadWeight;
	}
	
	public void setDeadWeight(int deadWeight) {
		this.deadWeight = deadWeight;
	}
	
	public int getDeadWeight() {
		return deadWeight;
	}
	
	public String getTrainCarType() {
		return "train car";
	}
	
	public String toString() {
		return "Dette er en " + getTrainCarType() + ", og den veier " + getTotalWeight() + " kg.";
	}
	
}
