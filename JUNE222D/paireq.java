/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class paireq
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
		    int len =sc.nextInt();
		    int[] array = new int[len];
		    for(int j = 0; j < len; j++){
		        array[j] = sc.nextInt();
		    }
		    quickSort(array, 0, len - 1); // doing swapping since takes less time to find element repeating more time takes no auxillary memory
		    int count = 1;
		    int temp = 1;
		    for(int j = 0; j < len - 1; j++){
		        if(array[j] != array[j + 1]){
		            if(temp > count){
		                count = temp;
		            }
		            temp = 0;
		        }
		        temp++;
		    }
		    count = count > temp ? count : temp;
		    System.out.println(len - count);
		}
	}
	
	public static int partition(int[] arr, int low, int high)
    {
 
        int pivot = arr[high];
        int i = (low - 1);
     
        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
 
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
     
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}