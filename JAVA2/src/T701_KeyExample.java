import java.util.HashMap;

public class T701_KeyExample {

	public static void main(String[] args) {

//		hashCode
//		identityHashCode
//		========================
//		hashCode + map = hashmap
//		hashcode ========> 맥주(key)
//		map      ========> 치킨(value)
//		맥주 : 치킨
//		사과 : 과일
//		
//		학번 : 100
//		성명 : 홍길동
//		========================
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>(); // 인자값을 형구분 없이 받겠다!
		// ==> Key 객체를 식별키로 하여 String 값을 저장하는 HashMap 객체 생성
		
		// 식별키(hashcode)에 put으로 입력
		hashMap.put(new Key(1),"홍길동");
		
		// 식별키(hashcode)를 이용하여 값(String)을 읽어옴
		String value=hashMap.get(new Key(1));
		System.out.println(value);
		
		
		
		

	}

}
