package Olognsort;

import java.util.Scanner;
import java.util.Random;

public class Quick_sort {

    /**
     * �� ��Ʈ ó��
     * 
     * @param array
     * @param left
     * @param right
     */
    public void sort(int[] array, int left, int right) {

    	int i, j;
    	int p, tmp;
    	
    	if(left<right){
    		i=left;
    		j=right;
    		p=array[left];
    		
    		while(i<j)
    		{
    			while(array[j]>p)	j--;
    			while(i<j && array[i]<=p)	i++;
    			
    			tmp = array[i];
    			array[i] = array[j];
    			array[j] = tmp;
    			
    		}

    		array[left] = array[i];
    		array[i] = p;
    		
    		sort(array,left,i-1);
    		sort(array,i+1,right);
    	}
    }

    /**
     * �迭 ���
     * 
     * @param array
     */
    public <E> void printArray(E[] array) {
        for (E value : array) {
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
    
    /**
     * ������ Int �迭 ����
     * 
     * @param capacity
     * @param randomBound
     * @return
     */
    public int[] initArray(int capacity, int randomBound) {
		Scanner scan = new Scanner(System.in);
		
		int temp, size;
		System.out.println("�迭�� ũ�⸦ �Է��ϼ���");
		size = scan.nextInt();
		
		System.out.println("�������� �迭�� ���� ����ְڽ��ϴ�.");
		int[] array = new int[size];
			for(int i = 0; i<array.length;i++){
				array[i] = (int)(Math.random()*1000);
			}
		System.out.println("�ʱ� �迭�� �����Դϴ�.");
			for(int i=0;i<array.length;i++){
				System.out.print(array[i] + " ");
			}
		System.out.println();
		System.out.println("�� ������ �����մϴ�.");
        return array;
    }

    public static void main(int[] array) {
    	Quick_sort quick = new Quick_sort();
    	
    	
    	for(int i = 0; i<array.length;i++){
			array[i] = (int)(Math.random()*1000);
		}
	
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}

		System.out.println();
        
        quick.sort(array, 0, array.length - 1);
        
        for(int i =0;i<array.length;i++){
        	System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}