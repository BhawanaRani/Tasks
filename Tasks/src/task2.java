

import java.util.ArrayList;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the series");
      String s = sc.nextLine();
      getArrayFromInteger(s);
		}
      
	}

	private static void getArrayFromInteger(String s) {
			Integer[] n = new Integer[s.length()];
			for(int i = 0 ; i < s.length();i++)
			{
		
				n[i] = Character.getNumericValue(s.charAt(i));
			}
			
					ArrayList<Integer> list = new ArrayList<Integer>();
				
			 
			
			int sum = 0;
			for(int i = 0;i < n.length/2;i++)
			{
				
				for(int j=(n.length/2)+i;j<n.length;j++) {
					
					
					
					 if(n[i] == n[j])
					 {
						 list.add(n[i]);
						 list.add(n[j]);

						
					 }
						 
					 break;
					
					
				}
				
			
			}
			
			for(int c=0;c<list.size();c++) {
				
				
				sum=sum+list.get(c);
			}
	 System.out.println("sum" + sum);
	
	}

}