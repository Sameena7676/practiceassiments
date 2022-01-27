package annoyinner.simplilurn;

public interface Car {
public static void main(String[] args) {
		
		Car c=new Car() {
			
			@Override
			public void stop() {
				System.out.println("car started from anonymous class");
				
			}
			
			@Override
			public void start() {
				System.out.println("Car stopped from anonymous class");
				
			}
		};
		
		c.start();
		c.stop();
	}

public void start();

public void stop();

}
