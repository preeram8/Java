
public class EncapsulationActivity {

	public static void main(String[] args) throws InterruptedException {
		
		Plane plane = new Plane(10);
		plane.onboard("Preethy");
		plane.onboard("Stella");
		plane.onboard("Steve");
		
		System.out.println("Plane took off at: " + plane.takeOff());
		System.out.println("List of Passengers in this plane are: " + plane.getPassengers());
		 Thread.sleep(5000);
		 plane.land();
		 System.out.println("Landing time of plane is: " + plane.getLastTimeLanded());
	}

}
