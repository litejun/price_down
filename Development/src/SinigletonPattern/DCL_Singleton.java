package SinigletonPattern;

public class DCL_Singleton {
	private volatile static DCL_Singleton uniqueInstance;
	
	private DCL_Singleton(){}
	
	public static DCL_Singleton getInstance(){
		if(uniqueInstance == null){
			synchronized (DCL_Singleton.class){
				if(uniqueInstance == null){
					uniqueInstance = new DCL_Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
