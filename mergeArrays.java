package ArrayImp2level;

import java.util.Arrays;

/*
 * 10. Merge Two Sorted Arrays
    - Input: `[1, 3, 5]` and `[2, 4, 6]`
    - Output: `[1, 2, 3, 4, 5, 6]`


 */
public class mergeArrays {
	
	public static void main(String[] args) {
		
		int a[]= {1, 3, 5};
		int b[]= {2, 4, 6};
		int c[]=new int[a.length+b.length];
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			x++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[x++]=b[i];
		}
		Arrays.sort(c);
		System.out.println("merged Arrays:");
		System.out.println(Arrays.toString(c));
		
		
	}

}
