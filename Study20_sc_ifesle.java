package Study0406;

import java.util.Scanner;

public class Study20_sc_ifesle 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int age;
			
		System.out.print("�����Է�:");
		age = sc.nextInt();
		
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
