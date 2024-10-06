package ArrayImp2level;
/*
 * 27. Find the Maximum Difference Between Two Elements Where Larger Element Appears After Smaller Element
    - Input: `[2, 3, 10, 6, 4, 8, 1]`
    - Output: `8` (Difference between 10 and 2)

 */
public class MaxDiifTwoEle {
	
	public static void main(String[] args) {
		
		int a[]= {2, 3, 10, 6, 4, 8, 1};
		int max=0,min=Integer.MAX_VALUE,secmin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				secmin=min;
				min=a[i];
			}
			else if(a[i]<secmin && secmin!=min)
			{
				secmin=a[i];
			}
			
		}
		System.out.println(max-secmin);
		
	}

}
