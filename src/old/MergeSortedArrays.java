package old;

import java.util.Arrays;

public class MergeSortedArrays {

	public static int[] mergeSortedArrays(int[] arr1,int[] arr2) {
		
		/*
		 * Here this problem was that how to manage things when length of both arrays are diffrent
		 * and it was causing issues as once we reach end of first array and secound still has values then it can create issues
		 * 
		 * */
				
		int arr1Length = arr1.length;
		int arr2Length = arr2.length;
		
		int mergedArrLength = arr1Length+arr2Length;
		int[] mergedArr = new int[mergedArrLength];
		
		int[] primary_array,sec_array;
		if(arr1[arr1Length-1]>=arr2[arr2Length-1]) {
			primary_array=arr1;
			sec_array=arr2;
		}else
		{
			primary_array=arr2;
			sec_array=arr1;
		}
		
		int k=0,j=0,i = 0;
		while (i < primary_array.length) {
					
			System.out.println("b "+i + " " +j +" " +k);
			
			if(primary_array[i]>sec_array[j]) {
				mergedArr[k++]=sec_array[j++];
			}else {
				mergedArr[k++]=primary_array[i++];
			}
			
		//	System.out.println("mergedArr[k] "+mergedArr[k]);			
			
			if(j==sec_array.length)
				while(i < primary_array.length)
					mergedArr[k++]=primary_array[i++];
			
			if(i==primary_array.length)
				while(j < sec_array.length)
					mergedArr[k++]=sec_array[j++];
			
	//		System.out.println("e "+i + " " +j +" " +k);
		}
		
		return mergedArr;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(mergeSortedArrays(new int[] {1,3,5,7,8,10,14},new int[] {2,3,6,9})));
	}
}
