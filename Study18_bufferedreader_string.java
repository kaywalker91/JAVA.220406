package Study0406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study18_bufferedreader_string 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		String ans;

		System.out.print("정답을 입력하시오 : ");

		ans = br.readLine();

		System.out.print("정답은 : " + ans);
	}
}
