package ArrayImp2level;
/*
 * 13. Check If Array Contains Duplicate Within K Distance
    - Input: `[1, 2, 3, 1, 2, 3]`, `K = 2`
    - Output: `true`

 */
public class ContainsKthDuplicatedist {
	
	public static void main(String[] args) {
		
		int a[]= {1, 2, 3, 1, 2, 3};
		int k=2;
		boolean b=false;
		for(int i=0;i<a.length;i=i+k)
		{
			for(int j=i+1;j<a.length;j=j+k)
			{
				if(a[i]==a[j])
				{
					b=true;
				}
			}
		}
		System.out.println(b);
	}

}
