package StretagyPattern_example;

public class Your_House extends House{
	public Your_House(){
		toilet = new ToiletOne();
		balcony = new Balcony_small();
	}
	public void display(){
		System.out.println("서울에 있습니다");
	}
}
