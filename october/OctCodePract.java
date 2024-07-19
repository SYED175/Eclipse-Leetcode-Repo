package com.leetcode.october;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//	CTRL + SHIFT + O   for auto import
public class OctCodePract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int[] arr = {0,0,2,2,0,0,2,0,1,1};
		 int[] arr = {0,0,2,2,1,1,1,0,2,0,0,2,2,0,0,2,0,1,1,1,1,0,2,2,0,0,2,0,1,1,1,0,2,0,0,2,2,0,0,2,0,1,1,1,1,0,2,2,0,1,2,2,1,1,1,0,2,0,1,1,0,2,1,1,0,2,0,1,1};
		 
		 //trying 3 pointer approach
		 int i=0;
		 int j=arr.length-1;
		 
//		 someTry(arr,i,j,2);
//		 while(i<j) {
//			 while(arr[i]==0 || arr[i]==1)
//				 i++;
//			 while(arr[j]==2)
//				 j--;
//			 if(i<j) {
//				 swap(arr,i,j);
//			 }
//		 }
//		 
		 int m=0;
		 int n= someTry(arr,i,j,2);
		 someTry(arr,m,n,1);
//		 while(m<n) {
//			 while(arr[m]==0)
//				 m++;
//			 while(arr[n]==1)
//				 n--;
//			 if(m<n) {
//				 swap(arr,m,n);
////				 m++;
////				 n--;
//			 }
//		 }
		 System.out.println(Arrays.toString(arr));
		 
		 
}
	
	public static int someTry(int[] arr,int left,int right,int val) {
		while(left<right) {
			while(arr[left]!=val)
				left++;
			while(arr[right]==val)
				right--;
			if(left<right) {
				swap(arr,left,right);
			}
		}
		
		return right;
	}
	
	public static void sortOne(int[] arr) {

		 int i=0;
		 int j=arr.length-1;
		 
		 while(i<j) {
			 while(arr[i]==0)
				 i++;
			 while(arr[j]==1)
				 j--;
			 if(i<j) {
			 int temp = arr[i];
			 arr[i] = arr[j];
			 arr[j] = temp;
			 i++;
			 j--;}
			 

			 System.out.println(Arrays.toString(arr));
		 }
	}
	
	public static void sorOneMethod2(int[] arr){
		int i=0;
		 int j=arr.length-1;
		 while(i<j) {
			 if(arr[i]!=0 && arr[j]!=1) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			 }
			 else if(arr[i]==0)
				 i++;
			 else if(arr[j]==1)
				 j--;
		 }
		 
		 System.out.println(Arrays.toString(arr));
	
	}
	
	public static void swap(int[] arr,int m,int n) {
		int temp = arr[m];
		arr[m] = arr[n];
		arr[n] = temp;
	}
}
