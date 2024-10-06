package ArrayImp2level;

import java.util.ArrayList;
import java.util.List;

public class contigeousSubArrayAlternate {
	
	public static void isAltenate(int a[])
	{
		int max=0;
		System.out.println("Alternative in List:");
		List<Integer>store=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				List<Integer>al=new ArrayList<Integer>();

				for(int k=i;k<j-1;k++)
				{
					if(a[k]==a[k+1])
					{
						al.add(a[k+1]);
						break;
					}else {
						al.add(a[k]);
					}
				}
				if(al.size()>max)
				{
					max=al.size();
					store=al;
				}
			}
			
		}
		System.out.println(store);

	}
	public static void main(String[] args) {
		
		int a[]= {1, 0, 1, 0, 1, 0, 0, 1};
		isAltenate(a);
		
	}

}
