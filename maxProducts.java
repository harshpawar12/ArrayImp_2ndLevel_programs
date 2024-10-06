package ArrayImp2level;

public class maxProducts {
	/*
	 * 1. Find the Maximum Product of Two Elements
   - Input: `[1, 4, 3, 7, 6]`
   - Output: `28` (Product of 4 and 7)

	 */
	public static void main(String[] args) {
		
		int a[]= {1,4,3,7,6};
		int max=0,secmax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secmax=max;
				max=a[i];
			}
			else if(a[i]>secmax && max!=secmax)
			{
				secmax=a[i];
			}
		}
		System.out.println("Max product of Two numbers:");
		System.out.println(max*secmax);
		
	}

}
