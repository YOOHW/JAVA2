package pk702;
//
public class StBufferTest {

	public static void main(String[] args) {

//		한번 생성된 String 값은 불변
//		String -> 고정
//		StringBuffer -> 동기화 제공
//		StringBuilder -> 동기화 제공 x 
//		동기화 ==> 순서(멀티스레드) / 단점 : 임계구역

		StringBuffer buf=new StringBuffer("Nice Day! ");
		System.out.println(buf.toString()); // toString 바로 쓰기 가능
		System.out.println(buf.length()); // 문자열의 크기
		System.out.println(buf.capacity()); // 용량
		
		buf.ensureCapacity(100); //용량 크기 증가
		System.out.println(buf.capacity()); // 확인해보면 100 나옴
		
		buf.insert(0, "Hi! ");
		buf.insert(14, "Everybody^^");
		System.out.println(buf);
		
		buf.delete(0, 4);
		System.out.println(buf);
		
		// StringBuffer : 다만 동기화 제공함. 단일 스레드에서는 적합하지 않다
		
		
		
		
		
		
		
		
		
	}

}
