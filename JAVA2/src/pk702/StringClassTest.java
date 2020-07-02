package pk702;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		
		Class strClass=Class.forName("java.lang.String");
		
		
		
		// strClass�� �����ڸ� �̾Ƽ� cons �迭�� ��ڴ�
		Constructor[] cons=strClass.getConstructors();
		// for�� ���鼭 �� ���
		for (Constructor num : cons) {
			System.out.println(num);
		}
		System.out.println();
		
		
		// strClass�� �޼ҵ带 �̾Ƽ� methods �迭�� ��ڴ�
		Method[] methods=strClass.getMethods();
		for (Method num : methods) {
			System.out.println(num);
		}
		System.out.println();
		
		
		// strClass�� �ʵ带 �̾Ƽ� fields �迭�� ��ڴ�
		Field[] fields =strClass.getFields();
		for (Field num : fields) {
			System.out.println(num);
		}
		
		
	}

}
