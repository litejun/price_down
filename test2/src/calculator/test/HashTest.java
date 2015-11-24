package calculator.test;

import static org.junit.Assert.*;

import java.util.Enumeration;
import java.util.Hashtable;

import org.junit.Test;

public class HashTest {

	@Test
	public void test() {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		//해시 테이블에 키와 값 집어 넣기
			ht.put("abc", 1);
			ht.put("abc1", 2);
			ht.put("abc2", 3);
			ht.put("abc", 4);
			Enumeration en = ht.keys();
			
		//해시 테이블에 있는 값 꺼내오기	
			System.out.println(ht.contains(4));
			System.out.println(ht.get("abc"));
			ht.remove("abc");
			while(en.hasMoreElements())
			{
				String key = en.nextElement().toString();
				System.out.println(key + " : " + ht.get(key));

			}
		
	}

}
