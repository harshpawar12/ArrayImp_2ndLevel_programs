package ArrayImp2level;

import java.util.ArrayList;
import java.util.List;

public class contigeousSubArrayIMP {
	
	public static void isContigeous(int a[])
	{
		int max=0;
		List<Integer>store=new ArrayList<Integer>();
		System.out.println("the contigeous Array is:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				List<Integer>al=new ArrayList<Integer>();
				int zero=0,one=0;
				for(int k=i;k<=j;k++)
				{
					al.add(a[k]);
					
					if(a[k]==0)
					{
						zero++;
					}
					else {
						one++;
					}
				}
				if(zero==one && al.size()>max)
				{
					max=al.size();
					store=al;
				}
			}
		}
		System.out.println(store);

	}
	public static void main(String[] args) {
		
		int a[]= {1,1,1,0,0,0};
		isContigeous(a);
	}

}
