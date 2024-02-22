package veryImp;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int[] arr= {7,5,45,66,75,555,9666,9999};
		
		/*
		 * Arrays.sort(arr); System.out.println(arr[0]);
		 * System.out.println(arr[arr.length-1]);
		 */
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			else if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(min+" and "+ max);
	}

}
