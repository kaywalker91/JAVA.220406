package Study0406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study19_bufferedreader_int 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int num;
		System.out.print("숫자를 입력하시오: ");
		num = Integer.parseInt(br.readLine());
		System.out.print("입력한 숫자는: " + num);

	}
}
