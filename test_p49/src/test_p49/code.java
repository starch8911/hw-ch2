package test_p49;




public class code 
{


public static void main(String[] args)
	{
	int[][]test;
	test = new int [2][5];

	test[0][0]=80;
	test[0][1]=50;
	test[0][2]=10;
	test[0][3]=68;
	test[0][4]=90;
	test[1][0]=80;
	test[1][1]=50;
	test[1][2]=10;
	test[1][3]=68;
	test[1][4]=90;
	

	
		for(int i=0; i<test[1].length ;i++)
		{
		System.out.println("第"+(i+1)+"個人分數是"+ test[0][i]+ "分");
		System.out.println("第"+(i+1)+"個人分數是"+ test[1][i]+ "分");
		}	
	
	
	}
}