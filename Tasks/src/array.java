

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class array {
	
		public static void main(String[] args) {
			 Scanner scn=new Scanner(System.in);
			 System.out.println("enter the rows");
			 int r=scn.nextInt();
			
		   int[][] a=new int[r][r];
		  
		  /* for(int i=0;i<a.length;i++)
		   {
			  System.out.println("Enter the number of columns for current row");
			   int col=scn.nextInt();
			  
			   int[] temp=new int[col];
			   for(int j=0;j<col;j++)
			   {
				   temp[j]=scn.nextInt();
			   }
			   a[i]=temp;
		   }*/
			 
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
				Arrays.sort(arr[i]);
			    sum+=((arr[i][arr[i].length-1])-arr[i][0]);
			   
			}
			return sum;
		}

}
