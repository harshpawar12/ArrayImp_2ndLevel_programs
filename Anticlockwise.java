package ArrayImp2level;

import java.util.Arrays;

/*
 * 12. Rotate Array Right by K Positions
    - Input: `[1, 2, 3, 4, 5]`, `K = 2`
    - Output: `[4, 5, 1, 2, 3]`


 */
public class Anticlockwise {

	public static void main(String[] args) {
		
		int a[]= {1, 2, 3, 4, 5};
		int k=2;
		
		for(int i=1;i<=k;i++)
		{
			int temp=a[a.length-1];
			for(int j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		System.out.println("Anticlockwise Rotation:");
		System.out.println(Arrays.toString(a));
		
	}
}
