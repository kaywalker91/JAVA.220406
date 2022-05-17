package Study0406;

import java.io.IOException;

public class Study14_systeminread_char 
{

	public static void main(String[] args) throws IOException 
	{
        char ch;
		
		System.out.print("문자를 입력하시오: ");
		ch = (char) System.in.read();
		System.out.print("입력한 문자는 : " + ch);

	}

}
