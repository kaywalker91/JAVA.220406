package Study0406;

import java.util.Scanner;

public class Study10_sc_ifelse_lopr 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int cl;
		int tl;
			
		System.out.print("ĳ���ͷ���:");
		cl = sc.nextInt();
			
		System.out.print("�����۷���:");
		tl = sc.nextInt();
		
		if(cl>=30 && tl>=40) 
		{
			System.out.println("�������� �����մϴ�!");
		}
		else
		{
			System.out.println("�������� �Ұ����մϴ�!");
		}
		
	}

}
