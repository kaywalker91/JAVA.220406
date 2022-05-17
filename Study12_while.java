package Study0406;

import java.util.Scanner;

public class Study12_while 
{

	public static void main(String[] args) 
	{
       
		int i = 1,sum = 0;
		
		while(i<=100)
		{
			sum += i++;
		}
		
		System.out.println("1부터 100까지의 합계: " + sum);
		
	}

}
