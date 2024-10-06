package ArrayImp2level;

import java.util.ArrayList;
import java.util.List;

/*
 * 25. Find the Longest Subarray with Sum Equal to K
    - Input: `[1, 2, 3, 4, 5]`, `K = 9`
    - Output: `[2, 3, 4]`

 */
public class SubArrayKthElment {
	
	public static void main(String[] args) {
		
		int a[]= {1, 2, 3, 4, 5};
		int l=9;
		System.out.println("The subArray with kth Element:");
		List<Integer>te=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum=0;
				List<Integer>al=new ArrayList<Integer>();
				int cnt=0;
				for(int k=i;k<=j;k++)
				{
					cnt++;
					al.add(a[k]);
					sum+=a[k];
				}
				if(sum==l && cnt==3)
				{
					te=al;
					System.out.println(te);
				
				}
				
			}
			
		}
		
	}

}
