package StringPrograms;

public class LeetCode {
	
	public static void main(String[] args) {
		
		//String[] inputArray =  {"co","dil","ity"};
		// String[] inputArray =  {"abc","kkk","def","csv"};
		String[] inputArray =  {"abc","ade","akl"};
		int max = 0;
		for(int i = 0 ; i< inputArray.length ; i++)
		{
			for(int j =0 ; j < inputArray.length ; j++)
			{
				if(i==j)
					continue;
				else
				{
					String s = inputArray[i]+inputArray[j];
					if(checkDuplicateChar(s))
					{
						if(max < s.length())
							max = s.length();
					}
				}
			}
		}
		
		System.out.println(max);
	}
	
	public static boolean checkDuplicateChar(String s) {
		for(int i = 0; i< s.length() ; i++)
		{
			if(s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i)))
				return false;
		}
		return true;
		
	}

}
