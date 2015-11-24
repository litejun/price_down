package On2sort;

import java.util.Scanner;

public class Insert_sort {
	public static void insert(int array[]){
		
		for(int i = 0; i<array.length;i++){
			array[i] = (int)(Math.random()*1000);
		}

		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
	System.out.println();

		int in;
		int j=0;

			for(int i = 1; i<array.length;i++){
				in = array[i];
				for(j = i-1; (j>=0) &&(in<array[j]);j--){
					array[j+1] = array[j];
				}
				array[j+1] = in;
			}
			

			for(int i = 0;i<array.length;i++){
				System.out.print(array[i] + " ");
			}
			System.out.println();
	}
}
