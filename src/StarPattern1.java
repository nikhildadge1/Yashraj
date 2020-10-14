
public class StarPattern1
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=6;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		int x,y;
		
		for(x=6;x>0;x--)
		{
			for(y=1;y<=x;y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
