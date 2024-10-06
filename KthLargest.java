package ArrayImp2level;

import java.util.Arrays;

/*
 * 18. Find the Kth Largest Element in an Array
    - Input: `[3, 2, 1, 5, 6, 4]`, `K = 2`
    - Output: `5`

 */
public class KthLargest {
	
	public static int isKthvalue(int a[])
	{
		int k=2;
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[1]);
			break;
		}
			
			return k;
		
	}
	
	public static void main(String[] args) {
		
		int a[]= {3, 2, 1, 5, 6, 4};
		isKthvalue(a);
		
	}

}
