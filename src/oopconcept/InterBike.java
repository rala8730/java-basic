package oopconcept;

class InterBike implements InterfaceVehicle {
	int gear; 
	int speed;
	@Override
	public void changegear(int newgear) {
		gear= newgear;
	}
	@Override
	public void speedup(int increment) {
		speed+=increment;
	}
	@Override
	public void applybrakes(int decrement) {
		speed-=decrement;
	}
	public void printStates() {
		System.out.println("speed: "+ speed +" gear:"+gear);
	}
	
	
}
