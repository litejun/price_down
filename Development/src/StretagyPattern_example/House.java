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
		System.out.println("모든 집에는 부엌이 있습니다.");
	}
	public void livingroom(){
		System.out.println("모든 집에는 거실이 있습니다.");
	}
	
}
