package StretagyPattern_example;

public abstract class House {
	Toilet toilet;
	Balcony balcony;
	public House(){
		
	}
	public abstract void display();
	public void number_toilet(){
		toilet.num();
	}
	public void size_balcony(){
		balcony.size();
	}
	public void kichen(){
		System.out.println("��� ������ �ξ��� �ֽ��ϴ�.");
	}
	public void livingroom(){
		System.out.println("��� ������ �Ž��� �ֽ��ϴ�.");
	}
	
}