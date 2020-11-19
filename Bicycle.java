 class Bicycle implements BicycleParts, BicycleOperations {
	 
	 public int gears;
	 public int currentSpeed;	 
	 
	 public Bicycle(int gears, int currentSpeed) {
		 this.gears = gears;
		 this.currentSpeed = currentSpeed;
	 }
	 
	 public void applyBrake(int decrement) {
		 currentSpeed -= decrement;
		 System.out.println("apply brake value is: " + currentSpeed);
	 }
	 
	 public void speedUp(int increment) {
		 currentSpeed += increment;
		 System.out.println("speedUp vlaue is: " + currentSpeed);
	 }
	 
	 public String bicycleDesc() {
		 return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	 }
}
