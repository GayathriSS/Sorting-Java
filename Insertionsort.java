package com.sorting;

import java.util.Scanner;

public class Insertionsort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int j, i, n;
		//Getting input from user
		System.out.println("Enter the number of elements");
		n = in.nextInt();
		int a[] = new int[n];
		System.out.println("Enter value");
		for (int k = 0; k < n; k++) {
			a[k] = in.nextInt();
		}
		//Sorting the array
		for(i=0;i<n;i++){
		    int newval=a[i];
		    j=i;
		    while(j>0 && a[j-1]>newval){
		    	a[j]=a[j-1];
		    	j--;
		    }a[j]=newval;
					
				}
			
		
		for (i = 0; i < n; i++)
			System.out.print(a[i]);
	}

}
