package Study0406;

import java.io.IOException;

public class Study16_systeminread_int 
{

	public static void main(String[] args) throws IOException
	{
		
		int num1,num2,num3;
		
		System.out.print("키보드 한글자를 입력하시오: ");
		num1 = System.in.read();
		num2 = System.in.read();
		num3 = System.in.read();
		System.out.println("입력한 숫자num1 : " + num1);
		System.out.println("입력한 숫자num2 : " + num2);
		System.out.println("입력한 숫자num3 : " + num3);
		
	}

}
