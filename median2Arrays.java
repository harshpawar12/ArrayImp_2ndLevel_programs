package ArrayImp2level;

import java.util.Arrays;

/*
 * 19. Find the Median of Two Sorted Arrays
    - Input: `[1, 3]` and `[2]`
    - Output: `2`

 */
public class median2Arrays {
	
	public static void main(String[] args) {
		
		int a[]= {1,3};
		int b[]= {2};
		
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
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			sum+=c[i];
		}
		System.out.println("Medium is:");
		System.out.println(sum/c.length);
		
	}

}
