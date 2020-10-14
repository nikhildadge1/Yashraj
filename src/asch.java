public class asch 
{
	int a;
	int b;
	static int c;
	int d;
	
	asch()
	{
		
		System.out.println("its constructor call");
	}
	
	asch(int d)
	{
		this();
		System.out.println("its second constructor call");
	}
	
	public void santya(int a,int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		asch a1=new asch(6);
		System.out.println("Your addition is");
		a1.santya(4,5);
	}

}
