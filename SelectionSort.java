package sorting;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a;
		// Getting input from user
		System.out.println("Enter the numbe of Elements");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = in.nextInt();
		}
		//Selection Sort
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] < a[j])
					min = j;
			}

			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		// Printing Output
		System.out.print("Result is ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

}
