package mop;

public class BubbleSorting {
	public static void main(String[] args)
	{
		int sortArr[]={30,298,1,489,2};
		
		int tmp=0;
		
		for(int i=0;i<(sortArr.length);i++)
		{
			for(int j=0;j<sortArr.length-1;j++)
			{
				if(sortArr[j]>sortArr[j+1])
				{
					tmp = sortArr[j];
					sortArr[j]=sortArr[j+1];
					sortArr[j+1]=tmp;
				}
			}
		}
		
		for(int i=0;i<sortArr.length;i++)
			System.out.println(sortArr[i]);
	}
	
}
