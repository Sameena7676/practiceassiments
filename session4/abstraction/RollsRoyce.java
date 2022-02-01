package abstraction;



	public class RollsRoyce extends CarAbstract {

		public RollsRoyce(String name)
		{
			super(name);
		}
		@Override
		public void powerEngine() {
			
			System.out.println("Rolls Royce engine started");

		}

}