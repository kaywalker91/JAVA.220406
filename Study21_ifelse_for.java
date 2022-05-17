package Study0406;

public class Study21_ifelse_for 
{
	public static int function(int a,int b,int c)
	{
		int min;
		if(a > b)
		{
			if(b > c)
			{
				min = c;
			}
			else
			{
				min = b;
			}		
		}
		else
		{
			if(a>c)
			{
				min = c;
			}
			else
			{
				min = a;
			}
		}
		for(int i = min; i > 0; i--)
		{
			
		}
		return 0;
	}
			
	
	public static void main(String[] args) 
	{
		

	}

}
