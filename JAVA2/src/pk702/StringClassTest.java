package pk702;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		
		Class strClass=Class.forName("java.lang.String");
		
		
		
		// strClass의 생성자를 뽑아서 cons 배열에 담겠다
		Constructor[] cons=strClass.getConstructors();
		// for문 돌면서 다 출력
		for (Constructor num : cons) {
			System.out.println(num);
		}
		System.out.println();
		
		
		// strClass의 메소드를 뽑아서 methods 배열에 담겠다
		Method[] methods=strClass.getMethods();
		for (Method num : methods) {
			System.out.println(num);
		}
		System.out.println();
		
		
		// strClass의 필드를 뽑아서 fields 배열에 담겠다
		Field[] fields =strClass.getFields();
		for (Field num : fields) {
			System.out.println(num);
		}
		
		
	}

}
