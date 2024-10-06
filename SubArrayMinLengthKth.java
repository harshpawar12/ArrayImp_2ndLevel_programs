package ArrayImp2level;

import java.util.ArrayList;
import java.util.List;

/*
 * 26. Find the Minimum Length Subarray with Sum at Least K
    - Input: `[2, 3, 1, 2, 4, 3]`, `K = 7`
    - Output: `2` (Length of `[4, 3]`)

 */
public class SubArrayMinLengthKth {
	
	public static void main(String[] args) {
		
		int a[]= {2, 3, 1, 2, 4, 3};
		int min=Integer.MAX_VALUE;
		int l=7;
		List<Integer>t=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum=0;
				List<Integer>al=new ArrayList<Integer>();
				for(int k=i;k<=j;k++)
				{
					sum+=a[k];
					al.add(a[k]);
				}
				if(sum==l)
				{
					t=al;
					
				}
			}
		}
		System.out.println(t+"--> "+t.size());
		
	}

}
