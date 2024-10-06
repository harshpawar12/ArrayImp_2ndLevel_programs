package ArrayImp2level;

import java.util.ArrayList;
import java.util.List;

/*
 * 24. Find the Maximum Sum Subarray with Exactly K Elements
    - Input: `[2, 1, 5, 1, 3, 2]`, `K = 3`
    - Output: `9` (Sum of `[5, 1, 3]`)

 */
public class SubArrayMaxExactlyKth {
	
	public static void main(String[] args) {
		
		int a[]= {2, 1, 5, 1, 3, 2};
		int n=3;
		int max=Integer.MIN_VALUE;
		List<Integer>t=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				
				int sum=0;
				List<Integer>al=new ArrayList<Integer>();
				int cnt=0;
				for(int k=i;k<j;k++)
				{
					sum+=a[k];
					cnt++;
					al.add(a[k]);
				}
				if(sum>max && cnt==n)
				{
					t=al;
					max=sum;
				}	
				
						
			}
		}
		System.out.println(max);
		System.out.println(t);

	}

}
