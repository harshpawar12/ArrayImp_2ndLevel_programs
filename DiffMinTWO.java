package ArrayImp2level;

/*
 * 2. Find the Minimum Difference Between Any Two Elements
   - Input: `[3, 1, 4, 1, 5, 9]`
   - Output: `0` (Difference between two 1s)

 */
public class DiffMinTWO {
	
	public static void main(String[] args) {
		
		int a[]= {3,1,4,1,5,9};
		
		int min=Integer.MAX_VALUE,secmin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				secmin=min;
				min=a[i];
			}
			else if(a[i]<secmin)
			{
				secmin=a[i];
			}
		}
		System.out.println("minimum diffrence between:");
		System.out.println(secmin-min);
		
	}

}
