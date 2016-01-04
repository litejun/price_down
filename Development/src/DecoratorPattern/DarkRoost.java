package DecoratorPattern;

public class DarkRoost extends Beverage{
	public DarkRoost(){
		description = "다크 로스트 커피";
	}
	public double cost(){
		return .99;
	}
}
