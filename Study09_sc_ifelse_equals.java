package Study0406;

import java.util.Scanner;

public class Study09_sc_ifelse_equals 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String sex;
		int age;
			
		System.out.print("�����Է�:");
		sex = sc.next();
			
		System.out.print("�����Է�:");
		age = sc.nextInt();
		
		if(sex.equals("����")) 
		{
			System.out.println("�����Դϴ�.");
		}
		else
		{
			System.out.println("�����Դϴ�.");
		}
		if(age>=19) 
		{
			System.out.println("�����Դϴ�.");
		}
		else
		{
			System.out.println("�̼������Դϴ�.");
		}	
		
	}

}
