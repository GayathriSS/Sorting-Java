package com.sorting;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of Element");
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i]=randomWithRange(10, 100);
		}
		//int a[] ={9,8,1,5,2,4,3};
		System.out.println("Before Sorting:");
		for(int i=0;i< a.length;i++){
			System.out.print(a[i]+ " , ");
		}
		int newa[] = quicksort(a,0,a.length-1);
		System.out.println("After Sorting:");
		for(int i=0;i< newa.length;i++){
			System.out.print(newa[i]+ " , ");
		}
		
	}
	static int randomWithRange(int min, int max)
	{
		
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	public static int[] quicksort(int[] a,int left,int right){
		int index = par(a,left,right);
		if(left<index-1){
			quicksort(a,left,index-1);
		}
		if(index<right){
			quicksort(a,index,right);
		}
		return a;
	}
	public static int par(int[] a,int left,int right){
		int pivot = a[(left+right)/2];
		while(left<=right){
			while(a[left]<pivot){
				left++;
			}
			while(a[right]>pivot){
				right--;
			}
			if(left<=right){
				swap(a,left,right);
				left++;
				right--;
			}
		}
		return left;
		
	}
public static void swap(int[] a,int left,int right){
	int temp = a[left];
	a[left]=a[right];
	a[right]=temp;
}
}
