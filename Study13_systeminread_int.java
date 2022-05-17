package Study0406;

import java.io.IOException;

public class Study13_systeminread_int 
{

	public static void main(String[] args) throws IOException
	{
		
		int num;
		
		System.out.print("숫자를 입력하시오: ");
		num = System.in.read();
		System.out.print("입력한 숫자는 : " + num);
		
	}

}
