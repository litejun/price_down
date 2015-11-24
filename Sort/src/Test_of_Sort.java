import java.util.Scanner;

import Olognsort.Heap_sort;
import Olognsort.Merge_sort;
import Olognsort.Quick_sort;
import On2sort.Bubble_sort;
import On2sort.Insert_sort;
import On2sort.Select_sort;

public class Test_of_Sort {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int temp, size;
		System.out.println("�迭�� ũ�⸦ �Է��ϼ���");
		size = scan.nextInt();
		int[] array = new int[size];
		
			for(int i = 0; i<array.length;i++){
				array[i] = (int)(Math.random()*1000);
			}

			for(int i=0;i<array.length;i++){
				System.out.print(array[i] + " ");
			}
		System.out.println();
		
		
		//������ ��Ʈ �ҷ�����(O(n2))
		Bubble_sort bubble = new Bubble_sort();
		Insert_sort insert = new Insert_sort();
		Select_sort select = new Select_sort();
		//������ ��Ʈ �ҷ�����(O(logn))
		Heap_sort heap = new Heap_sort();
		Merge_sort merge = new Merge_sort();
		Quick_sort quick = new Quick_sort();
		
		long start = System.currentTimeMillis();
		System.out.println("���� ������ �����մϴ�.");
		bubble.bubble(array);
		System.out.println("�������� �Ϸ�");
		long end = System.currentTimeMillis();
		
		
		long start2 = System.currentTimeMillis();
		System.out.println("���� ������ �����մϴ�.");
		insert.insert(array);
		System.out.println("���� ���� �Ϸ�");
		long end2 = System.currentTimeMillis();
		
		
		long start3 = System.currentTimeMillis();
		System.out.println("���� ������ �����մϴ�.");
		select.select(array);
		System.out.println("���� ���� �Ϸ�");
		long end3 = System.currentTimeMillis();
		
		
		long start4 = System.currentTimeMillis();
		System.out.println("�� ������ �����մϴ�.");
		heap.heap(array);
		System.out.println("�� ���� �Ϸ�");
		long end4 = System.currentTimeMillis();
		
		
		long start5 = System.currentTimeMillis();
			System.out.println("���� ������ �����մϴ�");
		merge.main(array);
		        System.out.println("�������� ��");
		long end5 = System.currentTimeMillis();
		
		long start6 = System.currentTimeMillis();
			System.out.println("�� ������ �����մϴ� ");
        quick.main(array);
        	System.out.println("�� ���� ��");
		long end6 = System.currentTimeMillis();
		
		
		System.out.println();
		System.out.println("���� : " + (end-start)/1000.0);
		System.out.println("���� : " + (end2-start2)/1000.0);
		System.out.println("���� : " + (end3-start3)/1000.0);
		System.out.println("�� : " + (end4-start4)/1000.0);
		System.out.println("���� : " + (end5-start5)/1000.0);
		System.out.println("�� : " + (end6-start6)/1000.0);
		
		
	}
}