package Study0406;

import java.util.Scanner;

public class Study08_sc_pr 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("����1�Է�:");
		a = sc.nextInt();
		
		System.out.print("����2�Է�:");
		b = sc.nextInt();
		
		int sum = a + b;
		double avg = (a + b)/2;
		
		System.out.println("������� : " + sum);
		System.out.println("��� : " + avg);
		
	}

}
