

import java.util.Scanner;

public class Day3Part1 {

	public static void main(String[] args) {
		int number = 607;

		// print a n x n spiral matrix in O(1) space
	int shortestPath=	spiralPattern(number,368078 );
 System.out.println("shortest path:"+shortestPath);
	}

	static int spiralPattern(int n,int num) {
		int element;
		int k = 0,l=0,a=0,b=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				// x stores the layer in which (i, j)th
				// element lies
				int x;

				// Finds minimum of four inputs
				x = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));

				// For upper right half
				if (i <= j)
				{
					element=(n - 2 * x) * (n - 2 * x) - (i - x) - (j - x) ;
					System.out.print((n - 2 * x) * (n - 2 * x) - (i - x) - (j - x) + "\t");
				}
				// for lower left half
				else
				{
					element=(n - 2 * x - 2) * (n - 2 * x - 2) + (i - x) + (j - x);
					System.out.print((n - 2 * x - 2) * (n - 2 * x - 2) + (i - x) + (j - x) + "\t");
				}
				if(element==num)
			    {
				k=i;
				l=j;
			   }
			  if(element==1)
			  {
				  a=i;
				  b=j;
			  }
				
			}
			System.out.println();

		}
int path=0;
int d=0;

		if(k<=a)
		{
			if(k==a) d=0;
			else d=a-k;
			if(l<b) path=d+(b-l);
			else path=d+l-b;
		}
		else
		{
			if(k==a) d=0;
			else d=k-a;
			if(l<b) path=d+(b-l);
			else path=d+l-b;
					}
		return path;	
	}

}
