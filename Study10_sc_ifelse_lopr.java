package Study0406;

import java.util.Scanner;

public class Study10_sc_ifelse_lopr 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int cl;
		int tl;
			
		System.out.print("캐릭터레벨:");
		cl = sc.nextInt();
			
		System.out.print("아이템레벨:");
		tl = sc.nextInt();
		
		if(cl>=30 && tl>=40) 
		{
			System.out.println("던전입장 가능합니다!");
		}
		else
		{
			System.out.println("던전입장 불가능합니다!");
		}
		
	}

}
