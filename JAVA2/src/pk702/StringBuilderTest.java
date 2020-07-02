package pk702;
//
//
public class StringBuilderTest {

	public static void main(String[] args) {
		
		//immutable : 불변하는 것
		String javastr=new String("java");
		// 처음 객체의 인스턴스화 시 메모리 값
		System.out.println("javastr의 문자열 주소 : "+System.identityHashCode(javastr));
		
		
		//String으로부터 StringBuilder 객체 생성
		StringBuilder buffer=new StringBuilder(javastr);
		// 연산이 이루어지기 전 원본 hash값
		System.out.println("연산 전 buffer의 메모리 주소 : "+System.identityHashCode(buffer));
		
		
		buffer.append(" and ");
		buffer.append("android ");
		buffer.append("Programming is fun!");
		
		
		System.out.println("연산 후 buffer의 메모리 주소 : "+System.identityHashCode(buffer));
		//==> 연산 하고 나서도 메모리 주소 같음(buffer는 그 자리에서 변경됨)
		
		javastr=buffer.toString();
		System.out.println(javastr);
		System.out.println("새로 만들어진 javastr의 문자열 주소 : "+System.identityHashCode(javastr));
		
		
		
		
		
		
	}

}
