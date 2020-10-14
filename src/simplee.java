public class simplee 
{
	simplee()
	{
		System.out.println("First constructor");
	}
	
	simplee(int a)
	{
		this();
		System.out.println("Second constructor");
	}
	
	public void display()
	{
		System.out.println("I'm in display ");
	}
	
	public static void main(String[] args)
	{
		simplee s = new simplee(3);
		s.display();
	}
}
