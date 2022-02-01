package abstraction;

import abstraction.CarDisign.CarDesign;

public class User {


	public static void main(String[] args) {
		
		CarDesign car1= new RollsRoyce("2019");
		CarDesign car2= new BMW("2021");
		
		car1.start();
		car1.powerEngine();
		car1.stop();
		
		car2.start();
		car2.powerEngine();
		car2.powerEngine();
	}
}
