package LinearSearch;

import BinarySearch.BinarySearch;

public class LinearSearch {
	
	public LinearSearch(int[] integerArray) {
		this.inputarray = integerArray;
	}


	public static void main(String[] args)
	{
		int[] integerArray = {20, 35, -15, 7, 55, 1, -22};
		
		LinearSearch lineatSearch = new LinearSearch(integerArray);
		
		System.out.println(lineatSearch.search(integerArray, 1));
	}
	
	private int[] inputarray;
	
	
	public int search(int[] inputArray, int searchNumber)
	{
		int searchIndex =-1;
		for(int i =0; i<inputArray.length;i++)
		{
			if(inputArray[i]==searchNumber)
			{
				searchIndex = i;
			}
		}
		
		return searchIndex;
	}

}
