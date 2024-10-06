package ArrayImp2level;
/*
 * 23. Find All Elements Appearing More Than N/3 Times
    - Input: `[3, 2, 3, 2, 2]`
    - Output: `[2]`

 */
public class moreAppearing {
	
	public static void main(String[] args) {
		
		int a[]= {3, 2, 3, 2, 2};
		int max=0;
		System.out.println("More than Appearing");
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
				}
			}
		}
		System.out.println(max);
		
	}

}
