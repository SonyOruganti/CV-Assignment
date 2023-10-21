package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originalArray = {1,2,3,4,5,6,7};
		
		//converting the array to a list
		List<Integer> list = new ArrayList<>();
		for(int value : originalArray) {
			list.add(value);
		}
		
        //shuffle the list
		Collections.shuffle(list);
		
		//converting the list back to an array
		for(int i=0;i<originalArray.length;i++) {
			originalArray[i]=list.get(i);
		}
		//print shuffled array
		for(int num:originalArray) {
			System.out.print(num+" ");
		}
	}

}
