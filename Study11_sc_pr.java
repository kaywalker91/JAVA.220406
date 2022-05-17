package Study0406;

import java.util.Scanner;

public class Study11_sc_pr 
{

	public static void main(String[] args) 
	{
		
        Scanner sc = new Scanner(System.in);
		
		int kor,eng,math;
		String name;
		
		System.out.print("국어:");
		kor = sc.nextInt();
		
		System.out.print("영어:");
		eng = sc.nextInt();
		
		System.out.print("수학:");
		math = sc.nextInt();
		
		System.out.print("이름:");
		name = sc.next();
		
		int sum = kor+eng+math;
		
		System.out.println(name + "의" + " 총점은 " + sum + "!");

	}

}
