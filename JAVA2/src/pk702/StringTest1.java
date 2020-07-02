package pk702;
//
//
public class StringTest1 {

	public static void main(String[] args) {

		// 객체 인스턴스는 각각의 heap 메모리에 저장됨
		String str1=new String("abc");
		String str2=new String("abc");
		// ==> 얘네 둘은 주소 값 다름
		System.out.println(str1==str2); // false 나옴
		// 내용은 같음 
		System.out.println(str1.equals(str2)); // true 
		
		// 문자열은 상수값으로 데이터 영역에 고정된 주소를 사용 --> 상수풀에 저장
		String str3="abc";
		String str4="abc";
		// ==> 얘네 둘은 주소 값 다름
		System.out.println(str3==str4); // true 나옴
		System.out.println(str3.equals(str4)); // true 
		
		
		
		
		
		
		
		
	}

}
