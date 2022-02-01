package inheritance;

	public class TestClass implements First,Secand{
		
		public void show()
		{
			First.super.show();
			Secand.super.show();
		}
		
		public static void main(String[] args) {
			TestClass test=new TestClass();
			test.show();
		}
}