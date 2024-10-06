package ArrayImp2level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * 28. Find the Count of Subarrays with Product 
 * Less Than K
    - Input: `[10, 5, 2, 6]`, `K = 100`
    - Output: `7`

 */
public class SubarrayProductLessThanKth {
	
	public static void main(String[] args) {
		
		int a[]= {10, 5, 2, 6};
		int l=100,min=Integer.MAX_VALUE;
		int product=0;
		List<Integer>t=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum=0;
				int cnt=0;
				List<Integer> al=new ArrayList<Integer>();
				for(int k=i;k<=j;k++)
				{
					al.add(a[k]);
					sum+=a[k];
					cnt++;
				}
				if(cnt==2)
				{
					t=al;
				}
			}
		
		}
		
		System.out.println(t);
		
		
		
		
	}

}
