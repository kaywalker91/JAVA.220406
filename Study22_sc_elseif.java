package Study0406;

import java.util.Scanner;

public class Study22_sc_elseif 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int input;
			
		System.out.print("�г��� �Է��Ͻÿ�:");
		input = sc.nextInt();
		
		if(input == 1) 
		{
			System.out.println("���б�1�г��Դϴ�.");
		}
		else if(input == 2)
		{
			System.out.println("���б�2�г��Դϴ�.");
		}
		else if(input == 3)
		{
			System.out.println("���б�3�г��Դϴ�.");
		}
		else
		{
			System.out.println("1~3�� �Է��Ͻÿ�.");
		}
	}

}
