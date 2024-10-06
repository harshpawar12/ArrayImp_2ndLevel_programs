package ArrayImp2level;

import java.util.ArrayList;
import java.util.List;

/*
 * 15. Find the Largest Sum Contiguous Subarray (Kadane's Algorithm)
    - Input: `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`
    - Output: `6` (Sum of `[4, -1, 2, 1]`)

 */
public class SubArraySum {
	
	public static void main(String[] args) {
		
		int a[]= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int max=0;
		List<Integer>al=new ArrayList();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				List<Integer>temp=new ArrayList();
				int sum=0;
				for(int k=i;k<j;k++)
				{
					temp.add(a[k]);
					sum+=a[k];
				}
				if(sum>max)
				{
					max=sum;
					al=temp;
				}
			}
		}
		System.out.println("SubArrays sum is:");
		System.out.println(max);
		System.out.println(al);
		
	}

}
