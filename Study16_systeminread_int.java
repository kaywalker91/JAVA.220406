package Study0406;

import java.io.IOException;

public class Study16_systeminread_int 
{

	public static void main(String[] args) throws IOException
	{
		
		int num1,num2,num3;
		
		System.out.print("Ű���� �ѱ��ڸ� �Է��Ͻÿ�: ");
		num1 = System.in.read();
		num2 = System.in.read();
		num3 = System.in.read();
		System.out.println("�Է��� ����num1 : " + num1);
		System.out.println("�Է��� ����num2 : " + num2);
		System.out.println("�Է��� ����num3 : " + num3);
		
	}

}
