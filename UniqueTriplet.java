package ArrayImp2level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 4. Find All Unique Triplets That Sum to Zero
   - Input: `[-1, 0, 1, 2, -1, -4]`
   - Output: `[[-1, -1, 2], [-1, 0, 1]]`

 */
public class UniqueTriplet {
	
	public static void main(String[] args) {
		
		int a[]= {-1,0,1,2,-1,-4};
		int c=0;
		List<List<Integer>>al=new ArrayList<List<Integer>>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				List<Integer>temp=new ArrayList<Integer>();
				for(int k=j+1;k<a.length;k++)
				{
					int sum=a[i]+a[j]+a[k];
					if(sum==c)
					{
						temp.add(a[i]);
						temp.add(a[j]);
						temp.add(a[k]);
						
						Collections.sort(temp);
						if(!al.contains(temp))
						{
							al.add(temp);
						}
					}
				}
			}
		}
		System.out.println("unique Triplets:");
		System.out.println(al);
	}

}
