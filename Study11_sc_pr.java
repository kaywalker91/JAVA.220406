package Study0406;

import java.util.Scanner;

public class Study11_sc_pr 
{

	public static void main(String[] args) 
	{
		
        Scanner sc = new Scanner(System.in);
		
		int kor,eng,math;
		String name;
		
		System.out.print("����:");
		kor = sc.nextInt();
		
		System.out.print("����:");
		eng = sc.nextInt();
		
		System.out.print("����:");
		math = sc.nextInt();
		
		System.out.print("�̸�:");
		name = sc.next();
		
		int sum = kor+eng+math;
		
		System.out.println(name + "��" + " ������ " + sum + "!");

	}

}
