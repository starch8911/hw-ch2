package test_p19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;
public class code 
{

	public static void main(String[] args)throws IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("�аݧA�O�k�Ͷ�");
		System.out.println("�п�JY or N");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str =br.readLine();
		char letter = str.charAt(0);

		if(letter=='Y' || letter=='y')
		{
			System.out.println("�A�O�k�Ͱ�");
			
		}
		else if (letter=='N' || letter=='n')
		{
			System.out.println("�n�a�A�A���O�k��");
		}
		else
		{
			System.out.println("�п�J Y or N");
		}
		

	
	}

}
