package com.Exercise10.app;

import java.util.Random;
import java.util.Scanner;

public class NonGreedyWhile
{
	public static void main(String[] args) 
	{
		/*llenar un vector con elementos  del 0 al 100 y pedirle al usuario un numero e 
		indicar en que posicion esta y cuantas veces se repite*/

	//constant declaration
		final int ELEMENTS_ARRAY=100;
	//variable declaration
		int numberToFind=0;
		int indexFound=-1;
		boolean isFound=false;
		
		//ARRAY DECLARATION
		int[]vector = new int[ELEMENTS_ARRAY];
		
		Random numbers = new Random(System.nanoTime());
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i < ELEMENTS_ARRAY; i++)
		{
			vector[i] = numbers.nextInt(101);
		}
		for(int i=0; i < ELEMENTS_ARRAY; i++)
		{
			System.out.print(vector[i]+" ");
		}
		
		do
		{
			System.out.println(" ");
			System.out.println("Input the value to find inside the Array:");
			
			numberToFind=input.nextInt();
			if(numberToFind <= 0)
			{
				System.out.println("The number must be greater than or equal to zero");
			}
		}while(numberToFind<0); 
	
			for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			if(numberToFind==vector[i]) 
			{
				indexFound=i;
				break;
			}
		}
		if(indexFound!=-1)
		{
			System.out.println("element found at index;  "+indexFound);
		}
		else
		{
			System.out.println("Element not found at index");
		}
		while(!isFound)
		{
		
		}
		input.close();
	
	}
}
				





	

