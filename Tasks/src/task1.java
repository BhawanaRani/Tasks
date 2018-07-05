

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the series");
      String s = sc.nextLine();
      getArrayFromInteger(s);
      
      
	}

	private static void getArrayFromInteger(String s) {
			Integer[] n = new Integer[s.length()];
			for(int i = 0 ; i < s.length();i++)
			{
		
				n[i] = Character.getNumericValue(s.charAt(i));
			}
			
			int sum = 0;
			for(int i = 0;i < n.length - 1;i++)
			{
				if(n[i] == n[i +1])
				{
					sum = sum+n[i];
					
				}
				if(i +2 == n.length-1)
				{
					if(n[n.length-1] == n[0]) {
						
					sum = sum+n[0];
								}
			}
			}
	 System.out.println("sum" + sum);
	
	}

}
