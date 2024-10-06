package ArrayImp2level;
/*
 * 9. Find the Intersection of Two Arrays
   - Input: `[1, 2, 2, 1]` and `[2, 2]`
   - Output: `[2, 2]`

 */
public class intesectionArray {
	
	public static void main(String[] args) {
		
		int a[]= {1, 2, 2, 1};
		int b[]= {2,2};
		
		int x=0;
		
		System.out.println("Intersection in the Arrays:");
		for(int i=0;i<=a.length-1;i++)
		{
			int c=1;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					b[j]='\0';
					System.out.print(a[i]+" ");
				}
			}
			
		}
		
		
	}

}
