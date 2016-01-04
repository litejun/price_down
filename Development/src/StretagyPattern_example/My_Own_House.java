package StretagyPattern_example;

public class My_Own_House extends House {
	public My_Own_House(){
		toilet = new ToiletNo();
		balcony = new Balcony_small();
	}
	public void display(){
		System.out.println("인천에 있습니다");
	}
}
