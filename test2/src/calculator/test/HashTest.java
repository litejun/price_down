package calculator.test;

import static org.junit.Assert.*;

import java.util.Enumeration;
import java.util.Hashtable;

import org.junit.Test;

public class HashTest {

	@Test
	public void test() {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		//�ؽ� ���̺� Ű�� �� ���� �ֱ�
			ht.put("abc", 1);
			ht.put("abc1", 2);
			ht.put("abc2", 3);
			ht.put("abc", 4);
			Enumeration en = ht.keys();
			
		//�ؽ� ���̺� �ִ� �� ��������	
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
