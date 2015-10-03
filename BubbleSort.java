package sorting;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args)
{
	int[] a;	
	System.out.println("Enter the numbe of Elements");
	Scanner in= new Scanner(System.in);
	int size = in.nextInt();
	a=new int[size];
	for(int i=0;i<size;i++){
		
		a[i]=in.nextInt();
	}
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]);
	}	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<i;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]= a[j];
				a[j]= temp;
			}
			//System.out.print(a[i]);
		}		//System.out.println();
		
	}
	System.out.println("Result is");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]);
	}
	
}
}
