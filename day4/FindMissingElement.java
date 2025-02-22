package week1.day4;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int arr1[]={1, 4,3,2,8, 6, 7,10,9};
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i]!=i+1)
			{
				System.out.println(i+1);
				break;
			}
			
			//System.out.println(arr1[i]);
		}

	}

}
