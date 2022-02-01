package abstraction;


public class BMW extends CarAbstract {

	public BMW(String name)
	{
		super(name);
	}
	@Override
	public void powerEngine() {
		System.out.println("BMW Engine strated");

	}

}

