package test_p32;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;
public class code 
{

	public static void main(String[] args)throws IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("請問要在第幾次結束迴圈 ?  輸入整數 1~10");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str =br.readLine();
		int res = Integer.parseInt(str);
				
		for(int i=1;i<=10;i++)
		{
			System.out.println("第"+i+"次迴圈");
			if (i ==res)
				break;
		}
	}

}
