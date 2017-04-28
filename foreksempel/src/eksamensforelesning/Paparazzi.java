package eksamensforelesning;

public class Paparazzi {
	
	private int id ; 
	
	public Paparazzi(int id){
		this.id = id; 
	}
	
	public void celebrityHasBirthday(Celebrity c) {
		System.out.println("Takes lot of photos of " + c.getName() + " filling " + c.getAge() + " years");
		System.out.println("Photos taken by paparazzi " + id);
	}
	
	public static void main(String[] args) {
		Celebrity kongen = new Celebrity("Harald", 80);
		Paparazzi vg = new Paparazzi(1); 
		Paparazzi seoghor = new Paparazzi(2); 
		kongen.addListener(vg); 
		kongen.addListener(seoghor);
		kongen.haveBirthday();
	}
}
