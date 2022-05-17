package Study0406;

import java.util.Scanner;

public class Study09_sc_ifelse_equals 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String sex;
		int age;
			
		System.out.print("성별입력:");
		sex = sc.next();
			
		System.out.print("나이입력:");
		age = sc.nextInt();
		
		if(sex.equals("남자")) 
		{
			System.out.println("남자입니다.");
		}
		else
		{
			System.out.println("여자입니다.");
		}
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
