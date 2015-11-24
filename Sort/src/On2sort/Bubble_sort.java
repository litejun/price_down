package On2sort;
import java.util.*;

public class Bubble_sort {
	public static void bubble(int[] array){
		
		for(int i = 0; i<array.length;i++){
			array[i] = (int)(Math.random()*1000);
		}
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		int temp;

		
		for(int i = 0; i<array.length-1;i++){
			for(int j = 0; j<array.length-1-i;j++){
				if(array[j] > array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		

		for(int i = 0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
