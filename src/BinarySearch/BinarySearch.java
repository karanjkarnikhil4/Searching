package BinarySearch;

public class BinarySearch {
	
	private int[] integerArray;
	
	public BinarySearch(int[] integerArray) {
		
		this.integerArray = integerArray;
		this.QuickSort(integerArray, 0, integerArray.length-1);
	}


	public static void main(String[] args)
	{
		
		int[] integerArray = {20, 35, -15, 7, 55, 1, -22};
		
		BinarySearch binarySearch = new BinarySearch(integerArray);
		
		System.out.println(binarySearch .Search(integerArray, 1, 0, integerArray.length-1));
		
		
	}
	
	
	public int Search(int[] inputArray, int searchNumber, int startIndex, int endIndex)
	{
		if(startIndex == endIndex)
		{
			if(inputArray[startIndex] == searchNumber)
			{
				return startIndex;
			}
			else
			{
				return -1;
			}
		}
		
		else
		{
			int middleIndex = ((startIndex+endIndex) /2);
			if(inputArray[middleIndex]==searchNumber)
			{
				return middleIndex;
			}
			
			else if(searchNumber > inputArray[middleIndex] )
			{
				startIndex = ++middleIndex;
				return Search(inputArray,searchNumber,startIndex,endIndex);
			}
			
			else
			{
				endIndex = --middleIndex;
				return Search(inputArray,searchNumber,startIndex,endIndex);
			}
		}
		
		
	}
	
	
	
	public static void QuickSort(int[] integerArray, int start, int end) {

	    if (start == end) {
	      return;
	    }

	    int pivot = end;
	    int rightPointer = end - 1;
	    int leftPointer = start;

	    for (; leftPointer <= pivot; leftPointer++) {
	      if (integerArray[leftPointer] > integerArray[pivot]) {
	        for (; rightPointer >= leftPointer; rightPointer--) {
	          if (integerArray[rightPointer] < integerArray[pivot]) {
	            int temp = integerArray[leftPointer];
	            integerArray[leftPointer] = integerArray[rightPointer];
	            integerArray[rightPointer] = temp;
	            break;
	          }

	          if (rightPointer == leftPointer) {
	            int temp = integerArray[pivot];
	            integerArray[pivot] = integerArray[rightPointer];
	            integerArray[rightPointer] = temp;
	            pivot = rightPointer;

	          }

	        }
	      }
	    }

	    if (pivot != 0) {
	      QuickSort(integerArray, start, pivot - 1);
	    }
	    QuickSort(integerArray, pivot, end);

	  }
	    
	}


