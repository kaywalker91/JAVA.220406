package Study0406;

import java.util.Scanner;

public class Study20_sc_ifesle 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int age;
			
		System.out.print("나이입력:");
		age = sc.nextInt();
		
		if(age>=19) 
		{
			System.out.println("성인입니다.");
		}
		else
		{
			System.out.println("미성년자입니다.");
		}	

	}

}
