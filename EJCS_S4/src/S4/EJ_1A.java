package S4;

public class EJ_1A 
{
	public static void main(String[] args) 
	{
		int a = 0;
		while (a < 100)
		{
			System.out.print(a+1);
			a++;
			if(a%10 != 0)
			{
				System.out.print("-");
			}
			if(a%10 == 0)
			{
				System.out.print("\n");
			}
		}
	}
}
