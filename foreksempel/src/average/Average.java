package average;

public class Average {

	int valueCount = 0;
	double sum = 0.0;
	
	void acceptValue(double value) {
		sum = sum + value;
		valueCount = valueCount + 1;
	}
	
	double getAverage() {
		return sum / valueCount;
	}
}
