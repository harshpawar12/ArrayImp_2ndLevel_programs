package ArrayImp2level;
/*
 * 21. Find the Longest Common Prefix in an Array of Strings
    - Input: `["flower", "flow", "flight"]`
    - Output: `"fl"`

 */
public class commonPrefixString {
	
	public static void main(String[] args) {
		
		String s[]= {"flower","flow"};
		
		for(int i=0;i<s.length;i++)
		{
			int k=1;
			for(int j=0;j<s[i].length();j++)
			{
				if(s[i].charAt(i)==s[i].charAt(j))
				{
					k++;
				}
			}
			if(k!=1)
			{
				System.out.print(s[i].charAt(i));
			}
		}
	}

}
