package ArrayImp2level;

import java.util.Arrays;

/*
 * 8. Move All Zeroes to the End
   - Input: `[0, 1, 0, 3, 12]`
   - Output: `[1, 3, 12, 0, 0]`

 */
public class MoveZeroLast {
	
	public static void main(String[] args) {
		
		int a[]= {0, 1, 0, 3, 12};
		int b[]=new int[a.length];
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				b[x++]=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				b[x++]=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			a[i]=b[i];
		}
		System.out.println("The last the Zero:");
		System.out.println(Arrays.toString(a));
		
	}

}
