package ArrayImp2level;

import java.util.Arrays;

/*
 * 6. Find the First Missing Positive Integer
   - Input: `[3, 4, -1, 1]`
   - Output: `2`

 */
public class FirstMissingPossitive {
	
	public static void main(String[] args) {
		
		int a[]= {3,4,-1,2};
		
		int sum=0;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		
	//	System.out.println(val-sum);
		
		
	}

}
