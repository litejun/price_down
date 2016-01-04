package StretagyPattern_example;

public class Simulator {
	public static void main(String args[]){
		House my = new My_Own_House();
		my.size_balcony();
		my.number_toilet();
		my.display();
		
		House you = new Your_House();
		you.size_balcony();
		you.number_toilet();
		you.display();
	}
}
