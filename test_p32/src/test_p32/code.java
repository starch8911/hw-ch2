package test_p32;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;
public class code 
{

	public static void main(String[] args)throws IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("�аݭn�b�ĴX�������j�� ?  ��J��� 1~10");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str =br.readLine();
		int res = Integer.parseInt(str);
				
		for(int i=1;i<=10;i++)
		{
			System.out.println("��"+i+"���j��");
			if (i ==res)
				break;
		}
	}

}
