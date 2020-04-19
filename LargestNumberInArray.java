package com.webdriver.javaprogram;

public class LargestNumberInArray {

	public static void main(String[] args) {
		
		int arr[]= {345,767,56,899,999,555,1000};
		
		int val=arr[0];
		
		
		for (int i=0; i<arr.length;i++)
		{
			if(arr[i]>val)
			{
				val=arr[i];
			}
		}
		System.out.println("The largest number in the array is : " + val);

	}
}
