package ArrayImp2level;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import codenerapractice.returnsecondmost;

/*
 * 2. Find the Longest Consecutive Sequence
   - Input: `[100, 4, 200, 1, 3, 2]`
   - Output: `4` (Sequence `[1, 2, 3, 4]`)
   
   
   7. Find the Longest Increasing Subsequence
   - Input: `[10, 9, 2, 5, 3, 7, 101, 18]`
   - Output: `[2, 3, 7, 101]`


 */
public class ArraySubSequence {
	
	public static void issequnce(int a[])
	{
		HashSet<Integer>h=new HashSet<Integer>();
		for(int num:a)
		{
			h.add(num);
		}
		System.out.println(h);
		List<Integer>store=new ArrayList<Integer>();
		int maxSequence=0;
		for(int num:a)
		{
			if(!h.contains(num-1))
			{
				int currnum=num;
				int currStreak=1;
				List<Integer>seq=new ArrayList<Integer>();
				seq.add(currnum);

				while(h.contains(currnum+1))
				{
					currnum++;
					currStreak++;
					seq.add(currnum);
				}
				if(currStreak>maxSequence)
				{
					maxSequence=currStreak;
					store=seq;
				}
				maxSequence=Math.max(maxSequence, currStreak);
			}
		}
		System.out.println("Sequence are:"+store);
		System.out.println("sequence length:"+maxSequence);
		
	}
    public static void main(String[] args) {
        int[] a = {100, 4, 200, 1, 3, 2};
        issequnce(a);
      
        
    }
}