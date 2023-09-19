package proj;

import java.util.*;
import java.util.Scanner;
public class sortingSearching
	{
	   //Creating variables of classes
	   static int selectionCount = 0;
	   static int quickCount = 0;
	   static int insertionCount = 0;
	   static int totalInsertionCount=0;
	   static int totalHeapCount=0;
	   static int heapCount=0;
	   static int bubbleCount = 0;
	   static int totalBubbleCount = 0;
	   static int totalSelectionCount = 0;
	   static int totalMergeCount = 0;
	   static int totalQuickCount = 0;
	   static int mergeCount = 0;
	   static int binarySearchComparisons=0;
	   static int linearSearchComparisons=0;
	   static int hashSearchComparisons=0;
	   static int [] arr;
	   static int [] arr1;
	   static int [] arr2;
	   static int [] arr3;
	   static int [] arr4;
	   static int [] arr5;
	   static int [] arr6;
	   static int number;
	   int s;
	   static int x;

	public static void main(String[] args) //main method
	{
	    System.out.println("Hello, This is Sorting and Searching System");
	    System.out.println();
	    Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of numbers you want to check ");
        System.out.println(" ");
        int s= sc.nextInt();
        int arr []= new int[s];
	   for (int i=0; i<s;i++) {
		    arr[i]=sc.nextInt();
	   }
	        //arr copies for each sorting algorithm
	        arr1 = Arrays.copyOf(arr, arr.length);
	        arr2 = Arrays.copyOf(arr, arr.length);
	        arr3 = Arrays.copyOf(arr, arr.length);
	        arr4 = Arrays.copyOf(arr, arr.length);
	        arr5 = Arrays.copyOf(arr, arr.length);
	        arr6= Arrays.copyOf(arr, arr.length);
	        
	      
	        System.out.println("Enter number: 1.Bubble sort 2.selection sort 3.insertion sort");
		    int num=sc.nextInt();
		    System.out.println("Enter number: 1.Merge sort, 2.Quick sort, 3.heap sort ");
		    int num2=sc.nextInt();
		    System.out.println("Enter number for searching ");
		    int x=sc.nextInt();
		    sc.close();
		    orginalArray(); 
	        switch (num) {
		    case 1:
		    	System.out.println();
		        bubble();
		      break;
		    case 2:
		    	System.out.println();
		        selection();
		      break;
	        
	      case 3:
    	      System.out.println();
             insertion();
             break;
             }
	        
	        switch (num2) {
		    case 1:
		    	System.out.println();
		        merge();
		      break;
		    case 2:
		    	System.out.println();
		        quick();
		      break;
		    case 3:
		    	System.out.println();
		        heap();
		      break;
	        }
	        
	        
	        
	        // Function Call
	        int r = search(arr, x);
	        if (r == -1)
	            System.out.println(
	                "Element is not present in array");
	        else
	            System.out.println("Element is present");
	        
	        int n = arr.length;
	        int res = binarySearch(arr, 0,n - 1, x);                     
	        System.out.println("Linear Search for unsorted array :"+linearSearchComparisons);
	        System.out.println("Binary Search for sorted array:"+binarySearchComparisons);
	        System.out.println("hash Search :"+"1");
	                                     
	 
	}
	public static void orginalArray() {
		int[] a = arr1;
		System.out.println("Orginal Array");
	
	    for (int i = 0; i < a.length; i++) 
	    {
	        //displays before sorting array
	        System.out.print(a[i] + " ");
	    }}
	public static void bubble()
	{
	    int[] a = arr1;
	   
	    bubbleSort(a);
	    System.out.println("Bubble Sort");
	    for (int i = 0; i < a.length; i++) 
	    {
	        //Prints out bubble sorted array
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
	    //Prints out number of checks to sort array
	    System.out.println("Bubble sort Total Counts: " + bubbleCount);
	    totalBubbleCount += bubbleCount;
	    //resets bubbleCount
	    bubbleCount = 0;
	}

	public static void selection()
	{
	    int[] a = arr2;
	    selectionSort(a);
	    System.out.println("");
	    System.out.println("Selection Sort");
	    for (int i = 0; i < a.length; i++) 
	    {
	        //displays selection sort
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
	    //Prints out number of selections counts
	    System.out.println("Selection sort Total Counts: " + selectionCount);
	    totalSelectionCount += selectionCount;
	    //resets selectionCount
	    selectionCount = 0;
	}
public static void insertion() {
	int[] a = arr3;
        insertionSort(a);
	    System.out.println("insertion Sort");
	    for (int i = 0; i < a.length; i++) 
	    {
	        //displays selection sort
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
	    System.out.println("Insertion sort Total Counts: " + insertionCount);
	    totalInsertionCount += insertionCount;
	    //selection count reset
	    insertionCount = 0;
	    	
}
	public static void merge()
	{   
	    int[] a = arr4;
	    mergeSort(a);
	    System.out.println("Merge Sort");
	    for (int i = 0; i < a.length; i++) 
	    {
	        //displays merge sort
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
	    System.out.println("Merge sort Total counts: " + mergeCount);
	    totalMergeCount += mergeCount;
	    //merge Count reset
	    mergeCount  = 0;
	}

	public static void quick()
	{
	    int[] a = arr5;
	    // it sorts quick sort array 
	    quickSort(a, 0, a.length - 1);
	    System.out.println("Quick Sort");
	    for (int i = 0; i < a.length; i++) 
	    {
	        //displays quick sorted array
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
	    System.out.println("QuickSort Total counts: " + quickCount);
	    totalQuickCount += quickCount;
	    //displays average number of counts
	    quickCount = 0;
	}
	public static void heap()
	{
	    int[] a = arr6;
	    //sorts heap array 
	    heapSort(a);
	    System.out.println(" heap Sort");
	    for (int i = 0; i < a.length; i++) 
	    {
	        //Prints out quick sorted array
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
	    System.out.println("Heap Sort Total counts: " + heapCount);
	    totalHeapCount += heapCount;
	    //displays average number of counts
	    heapCount = 0;
	}	

	public static int[] bubbleSort(int[] a)
	{
	    boolean d = false;
	    int h = a.length;
	    while(d == false)//loops n times
	    {
	        d = true;
	        for(int i = 0; i < h-1; i++)//loops n times
	        {

	            if(a[i] > a[i+1])//Swaps
	            {
	                bubbleCount++;
	                int temp = a[i];
	                a[i] = a[i+1];
	                a[i+1] = temp;
	                d = false;
	            }

	        }
	    }
	    return a;
	}

	public static void mergeSort(int [] a)
	{
	    int si = a.length;//size
	    if(si < 2)
	    {
	        return;
	    }
	    int mid = si/ 2;
	    int leftSize = mid;
	    int rightSize = si - mid;
	    int[] left = new int[leftSize];
	    int[] right = new int[rightSize];
	    //populates leftside
	    for(int i = 0; i < mid; i++)
	    {
	        mergeCount++;
	        left[i] = a[i];
	    }
	    //populates rightside
	    for(int i = mid; i < si; i++)
	    {
	        mergeCount++;
	        right[i-mid] = a[i];
	    }
	    mergeSort(left);
	    mergeSort(right);
	    merge(left, right, a);
	}

	public static void merge(int[] left, int[] right, int[] a)
	{
	    int leftSi = left.length;//si is size
	    int rightSi = right.length;
	    int i = 0;// left index
	    int j = 0;//right index  
	    int k = 0;//a index 
	    while(i < leftSi && j < rightSi)
	    {
	        if(left[i] <= right[j])
	        {
	            //swaps and increments i and k
	            a[k] = left[i];
	            i++;
	            k++;
	        }
	        else
	        {
	            //swaps and increments j  and k
	            a[k] = right[j];
	            j++;
	            k++;
	        }
	    }
	    while(i<leftSi)
	    {
	        a[k] = left[i];
	        i++;
	        k++;
	    }
	    while(j<rightSi)
	    {
	        a[k] = right[j];
	        j++;
	        k++;
	    }
	}

	public static void selectionSort(int[] a )
	{
	    for (int i = 0; i < a.length - 1; i++) 
	    {
	        int posi = i;
	        for (int j = i + 1; j < a.length; j++) 
	        {
	            selectionCount++;
	            if (a[j] < a[posi]) 
	            {
	                posi = j;
	            }   
	        }

	        // swaps 
	        int temp = a[i];
	        a[i] = a[posi];
	        a[posi] = temp;
	    }
	}
	public static void insertionSort(int[] a)
	{
		for (int i = 1; i < a.length; ++i) {
            int keys = a[i];
            int j = i - 1;
              
            while (j >= 0 && a[j] > keys) {
            	insertionCount++;
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = keys;
	}}
	public static void quickSort(int[] a, int left, int right)
	{
	    int ind = seperation(a, left, right);
	    if(left < ind - 1)
	    {
	        // calls quick Sort 
	        quickCount++;
	        quickSort(a, left, ind-1);    
	    }
	    if(ind < right)
	    {
	        //calls quick Sort
	        quickCount++;
	        quickSort(a, ind, right);
	    }
	}
	public static void heapSort(int a[]) {
		int N = a.length;
		for (int i = N / 2 - 1; i >= 0; i--)
            heapify(a, N, i);
		heapCount++;
        // extracts numbers orderly
        for (int i = N - 1; i > 0; i--) {
            // Moves present root to endd
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapCount++;
            
            heapify(a, i, 0);
        }
    }
 
    // heapifyy a subtree rooted with node i
    
   static void heapify(int a[], int N, int i)
    {
        int large = i; // Initializing largestt as a root
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
 
        // comparing left
        if (l < N && a[l] > a[large])
            large = l;
             
        // comparing right child 
        if (r < N && a[r] > a[large])
            large = r;
        
  
        if (large != i) {
            int swap = a[i];
            a[i] = a[large];
            a[large] = swap;
            heapify(a, N, large);
        }
    
	}
	public static int seperation(int[] a, int left, int right)
	{
	    int i = left;
	    int j = right;
	    int piv = a[((left+right)/2)];
	    while(i<=j)
	    {
	        while(a[i] < piv)
	        {
	            i++;
	        }
	        while(a[j] > piv)
	        {
	            j--;
	        }
	        if(i <= j)
	        {
	            //swaps, increments i, and decrements j
	            int temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	            i++;
	            j--;
	        }
	    }
	    return i;
	}
	
	public static int search(int arr[], int x)
    {
        int h = arr.length;
 
        for (int i = 0; i < h; i++) {
        	linearSearchComparisons++;
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

public static int binarySearch(int arr[], int l,
	                     int r, int x)
	    {	
		 arr = bubbleSort(arr);			
	        if (r >= l) {
	            int mid = l + (r - l) / 2;
	           
	            if (arr[mid] == x)
	                return mid;
	            binarySearchComparisons++;
	            //if elemement in left
	            if (arr[mid] > x)
	                return binarySearch(arr, l,
	                                    mid - 1, x);
	            binarySearchComparisons++;
	            //if  element in right
	            return binarySearch(arr, mid + 1,
	                                r, x);
	        }
	 
	        
	        return -1;
	    }	
	 
 public static boolean hash(int arr[],int a) {
	 Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
	 for(int i=0;i<arr.length;i++) {
		 ht.put(i+1, arr[i]);
	 }
	 return ht.containsValue(a);
	 
 }
}