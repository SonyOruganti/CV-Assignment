package assignment1;

import java.util.HashMap;

public class RomantoInteger 
{

	public static void romanToInteger(String romanNumeral)
	{
		//create a Hashmap to store the value of roman numerals
		HashMap<Character,Integer> romanMap=new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		int result=0;
		int prevValue=0;
		
		//Iterate through the roman numeral from right to left
		for(int i=romanNumeral.length()-1;i>=0;i--)
		{
			char c=romanNumeral.charAt(i);
			int value=romanMap.get(c);
			
			if(value<prevValue)
			{
				result-=value;
			}
			else
			{
				result+=value;
			}
			prevValue=value;
		}
			System.out.println("Roman numeral"+" "+romanNumeral+" "+"is equivalnet to"+" "+result);
	}
		public static void main(String[]args)
		{
			String romanNumeral="IX";
			romanToInteger(romanNumeral);
		}

	}
