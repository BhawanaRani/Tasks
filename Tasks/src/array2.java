

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		 System.out.println("enter the rows");
		 int r=scn.nextInt();
		
	   int[][] a=new int[r][r];
	  
	   for(int i=0;i<a.length;i++)
	   {
		  
		   for(int j=0;j<a[i].length;j++)
		   {
			   a[i][j]=scn.nextInt();
		   }
		
	   }
		 

		long sum=getSum(a);
		System.out.println("sum="+sum);

	}
	public static long getSum(int[][] arr)
	{
		
	
		int sum=0;
	
		for(int i=0;i<arr.length;i++)
		{ 
		   for(int j = 0; j < arr[i].length;j++)
		   {
			 
			   for(int k=j+1;k<arr[i].length;k++)
			   {
				
				   if(arr[i][j]%arr[i][k]==0)
			   {
				   
					   sum+=(arr[i][j]/arr[i][k]);
				   }
				   else if(arr[i][k]%arr[i][j]==0)
			   {
					   System.out.println("div2:"+arr[i][j]+" "+arr[i][k]);
					   sum+=(arr[i][k]/arr[i][j]);
				   }
				 
			   }
		   }
		}
		return sum;
	}
}
	