package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	boolean intArraySorted(int[] arr) {
		boolean a=true;
		for(int i=0;i<arr.length;i++) {
			int first=arr[i];
			int second=arr[i+1];
			if(second<=first) {
				a=false;
			}
		}
		return a;
	}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	boolean doubleArraySorted(double[] arr) {
		boolean a=true;
		for(int i=0;i<arr.length;i++) {
			double first=arr[i];
			double second=arr[i+1];
			if(second<=first) {
				a=false;
			}
		}
		return a;
	}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	boolean charArraySorted(char[] arr) {
		boolean a=true;
		for(int i=0;i<arr.length;i++) {
			char first=arr[i];
			char second=arr[i+1];
			if(second<=first) {
				a=false;
			}
		}
		return a;
	}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	boolean stringArraySorted(String[] arr) {
		boolean a=true;
		for(int i=0;i<arr.length;i++) {
			String first=arr[i];
			String second=arr[i+1];
			if(second.compareTo(first)>0) {
				a=false;
			}
		}
		return a;
	}
}
