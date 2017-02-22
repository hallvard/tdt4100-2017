package of7;

public class Room {

	Room leftRoom, rightRoom, topRoom;
	String name;
	
	public Room(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
	
	public boolean canBeReachedFrom(Room room) {
		System.out.println("Sjekker " + room);
		if (room == null) {
			return false;
		}
		if (room == this) {
			return true;
		}
		return this.canBeReachedFrom(room.leftRoom) || this.canBeReachedFrom(room.rightRoom)
				|| this.canBeReachedFrom(room.topRoom);
	}
	
	public static void main(String[] args) {
		Room r1 = new Room("Rom 1");
		Room r2 = new Room("Rom 2");
		Room r3 = new Room("Rom 3");
		Room r4 = new Room("Rom 4");
		Room r5 = new Room("Rom 5");
		
		// Sett referanser
		r1.rightRoom = r2;
		r2.rightRoom = r3;
		r2.topRoom = r4;
		r1.leftRoom = r5;
		
		// Nå blir det krøll
		// r5.rightRoom = r1;
		// r2.rightRoom = r5;
		
		System.out.println(r4.canBeReachedFrom(r1));
		
	}
	
}
