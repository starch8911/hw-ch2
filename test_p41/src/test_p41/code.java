package test_p41;



public class code 
{


public static void main(String[] args)
	{
	int[]test;
	test = new int [5];

	test[0]=80;
	test[1]=50;
	test[2]=10;
	test[3]=68;
	test[4]=90;
	
	test[7]=20;
	
		for(int i=0; i<5 ;i++)
		{
		System.out.println("第"+(i+1)+"個人分數是"+ test[i]+ "分");
		}	
	
	
	}
}