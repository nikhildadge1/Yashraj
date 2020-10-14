
public class Tp1inheritance extends Tp1
{	
	public void methood2()
	{
		System.out.println("method 2nd");
	}
	
	public static void main(String[] args)
	{
		System.out.println("main method");
		Tp1inheritance tpp1= new Tp1inheritance();
		tpp1.methood();
		tpp1.methood2();
	}

}
