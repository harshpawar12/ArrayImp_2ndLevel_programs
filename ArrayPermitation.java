package ArrayImp2level;

import java.util.Arrays;

/*
 * 20. Check if Two Arrays Are Permutations of Each Other
    - Input: `[1, 2, 3]` and `[3, 2, 1]`
    - Output: `true`

 */
public class ArrayPermitation {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3};
		int b[]= {3,2,1};
		
		Arrays.sort(a);
		Arrays.sort(b);
		boolean b1=false;
		System.out.println("Two Arrays permutation each other:");
		if(Arrays.equals(a, b))
		{
			b1=true;
		}
		System.out.println(b1);
	}

}
