package Study0406;

import java.util.Scanner;

public class Study22_sc_elseif 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int input;
			
		System.out.print("학년을 입력하시오:");
		input = sc.nextInt();
		
		if(input == 1) 
		{
			System.out.println("중학교1학년입니다.");
		}
		else if(input == 2)
		{
			System.out.println("중학교2학년입니다.");
		}
		else if(input == 3)
		{
			System.out.println("중학교3학년입니다.");
		}
		else
		{
			System.out.println("1~3만 입력하시오.");
		}
	}

}
