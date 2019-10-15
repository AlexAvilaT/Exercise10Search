package com.Exercise10.app;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch 
{
	/* Search a sorted array by repeatedly dividing the search interval in half.
	Begin with an interval covering the whole array. If the value of the search
	key is less than the item in the middle of the interval, narrow the interval 
	to the lower half. Otherwise narrow it to the upper half. 
	Repeatedly check until the value is found or the interval is empty.*/

	public static void main(String[] args) 
	{
		//constant declaration
		final int ELEMENTS_ARRAY=10; 
		
		//Variables declaration
		int numberToFind=0;
		int indexFound=-1;
		int limInf=0;
		int limSup=ELEMENTS_ARRAY-1;
		int pivotal= (limSup-limInf)/2;
		int temp= 0;
		
				
		//Array declaration 
		int[] miArraycitu = new int[ELEMENTS_ARRAY];
		
		//object construction
		Random randomNumbers = new Random(System.nanoTime());
		Scanner input = new Scanner(System.in);
		
		//Array inizialization
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			miArraycitu[i] = randomNumbers.nextInt(101);
			System.out.print(miArraycitu[i]+" ");
		}
		
		//Sorting algorithm
		
		for(int i=0; i < ELEMENTS_ARRAY; i++)
		{
			for(int j=0; j < ELEMENTS_ARRAY-1; j++)
			{
				if(miArraycitu[j]>miArraycitu[j+1])
				{
					temp=miArraycitu[j+1];
					miArraycitu[j+1]=miArraycitu[j];
					miArraycitu[j]=temp;
							
				}
			}
		}
		//Array Visualization
		System.out.println("  ");
		for(int i=0; i<ELEMENTS_ARRAY; i+=1)
		{
			System.out.print(miArraycitu[i]+" ");
		}
			

		//Ask the user for the number to find
		do
		{
			System.out.println("input the number to find inside the Array(1-100)");
			numberToFind = input.nextInt();
			if(numberToFind<0)
			{
				System.out.println("number must be zero or positive value!");
			}
		}while(numberToFind<0);
			
		//Binary Search algorithm
		
		while(limInf<=limSup)
		{
			pivotal = limInf + (limSup-limInf)/2;
			if(numberToFind==miArraycitu[pivotal])
			{
				indexFound=pivotal;
				break;
			}
			else if(numberToFind>miArraycitu[pivotal])
			{
				limInf = pivotal+1;
			}
			else if(numberToFind<miArraycitu[pivotal])
			{
				limSup=pivotal-1;
			}
		}
		if(indexFound!=-1)
		{
			System.out.println("element found at index;"+indexFound);
		}
		else
		{
			System.out.println("element not found in the Array!");
		}
		input.close();
	}
}		
	
	
	


