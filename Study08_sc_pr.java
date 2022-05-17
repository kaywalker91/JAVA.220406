package Study0406;

import java.util.Scanner;

public class Study08_sc_pr 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("숫자1입력:");
		a = sc.nextInt();
		
		System.out.print("숫자2입력:");
		b = sc.nextInt();
		
		int sum = a + b;
		double avg = (a + b)/2;
		
		System.out.println("덧셈결과 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}
