package ArrayImp2level;
/*
 * 11. Find the Majority Element (more than n/2 occurrences)
    - Input: `[3, 2, 3]`
    - Output: `3`

 */
public class majorityElement {
	
	public static void main(String[] args) {
		
		int a[]= {3, 2, 3};
		int max=0;
		int ele=0;
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c!=1)
			{
				if(c>max)
				{
					max=c;
					ele=a[i];
				}
			}
		}
		System.out.println("Majority element in Arrays:");
		System.out.println(ele);
	}

}
