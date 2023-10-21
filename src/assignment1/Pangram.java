package assignment1;

public class Pangram {

	public static boolean isPangram(String input) {
	   //creating a boolean array to track the occurrence of each letter
		boolean [] alphabet=new boolean[26];
		
		//convert the input to lowercase to make it case-insensitive
		input=input.toLowerCase();
		
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			if(c>='a'&&c<='z')
			{
			alphabet[c-'a']=true;	
			}
		}
		for(boolean letterPresent:alphabet) 
		{
			if(!letterPresent) 
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[]args) 
	{
	String input ="The quick brown fox jumps over the lazy dog";
	boolean isPangram=isPangram(input);
	
	if(isPangram) 
	{
		System.out.println("The input is pangram");
	}
	else
	{
		System.out.println("The input is not a pangram");
	}
	}

}
