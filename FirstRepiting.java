package ArrayImp2level;
/*
 * 29. Find the First Repeating Element
    - Input: `[4, 5, 6, 7, 5, 4]`
    - Output: `5`

 */
public class FirstRepiting {
	
	public static void main(String[] args) {
		
		int a[]= {4, 5, 6, 7, 5, 4};
		int x=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					if(x<=1)
					{
						x++;
						System.out.println(a[i]);
					}
				}
			}
		}
		
	}

}
