package ArrayImp2level;

/*
 * 5. Find the Duplicate Element in an Array
   - Input: `[1, 3, 4, 2, 2]`
   - Output: `2`

 */
public class FindDuplicate {
	
	public static void main(String[] args) {
		
		int a[]= {1,3,4,2,2};
		System.out.println("Duplicate In Arrays:");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c!=0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}

}
