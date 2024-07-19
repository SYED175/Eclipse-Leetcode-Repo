package com.leetcode.november;

public class NovPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1};
		
//		System.out.println(binarySearch(arr,0));
//		System.out.println(findPivotIndex(arr));
		//PIVOT ELEMENT INVOLVING DUPLICATES.
		int ele = 19;
//		System.out.println(findSquareRoot(37));
		double value = findSquareRoot(ele);
		double factor=1;
		for(int i=0;i<4;i++) {
			factor = factor/10;
			for(double j = value;j*j<ele;j=j+factor) {
				value = j;
//				System.out.println(value);
			}
		}
		System.out.println(value);
	}
	
	public static int binarySearch(int[] arr,int key) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid]==key)
				return mid;
			else if(key<arr[mid])
				end=mid-1;
			else
				start=mid+1;
				
		}
		return -1;
	}
	
	public static int findPivotIndex(int[] nums) {

		int start = 0;
		int end = nums.length-1;
		while(start<end) {
			int mid = start + (end-start)/2;
			if(nums[mid]>nums[end])
				start=mid+1;
			else if(nums[mid]<nums[end])
				end=mid;
			else//, when nums[mid] is equal to nums[end], it means there is a duplicate, and we cannot determine which subarray to search. To handle this situation, we decrement the end pointer by 1 and continue the search.
				end--;
		}
		return start;
	}
	
	public static int findSquareRoot(int value) {
		long start=0;
		long end=value;
		
		while(start<=end) {
			long mid = start + (end-start)/2;
			long target = mid*mid;
			if(target==value)
				return (int) mid;
			else if(target>value)
				end=mid-1;
			else 
				start=mid+1;
		}
		return (int)end;
	}

	public static double findSquareRooot(double x,double y) {
		double start=0;
		double end=1;
		
		while(start<=end) {
			double mid = start+(end-start)/2;
			double target = (y+mid)*(y+mid);
			if(target==x) {
				return mid;
			}
			else if(target>x) {
				end=mid-.1;
				
			}
			else
				start=mid+.1;
			
		}
		return end;
	}
}
