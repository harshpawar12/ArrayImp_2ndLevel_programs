package ArrayImp2level;

import java.util.ArrayList;
import java.util.List;

/*
 * 22. Find All Subarrays with Zero Sum
    - Input: `[1, 2, -3, 3]`
    - Output: `[[1, 2, -3], [-3, 3]]`

 */
public class SubArrayZeroSum {
	
	public static void main(String[] args) {
	
		int a[]= {1,2,-3,3};
		int sum1=0;
		List<Integer>summm=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum=0;
				List<Integer>al=new ArrayList<Integer>();

				for(int k=i;k<=j;k++)
				{
					al.add(a[k]);
					sum+=a[k];
				}
				if(sum==sum1)
				{
					summm=al;
					System.out.println(summm+"-->"+sum1);
				}
				
				
			}
			

			
		}
		
	}

}
