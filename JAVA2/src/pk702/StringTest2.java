package pk702;
//
//
public class StringTest2 {

	public static void main(String[] args) {
		
		String javastr=new String("JAVA ");
		String androidstr=new String("and android");
		
		System.out.println(javastr);
		// 객체 인스턴스 된 후 주소 ==> 객체.hashcode
		// 객체가 인스턴스 되기 전 주소 ==> system.identityhashcode(객체)
		System.out.println("처음 문자열 주소 값 : "+System.identityHashCode(javastr));
		
		javastr=javastr.concat(androidstr);
		
		System.out.println(javastr);
		System.out.println("처음 문자열 주소 값 : "+System.identityHashCode(javastr));
		// javastr이랑 androidstr이랑 붙여서 다시 javastr에 넣었다고 해서
		// 그 메모리에 다시 값이 들어가는 것이 아니라 새로운 공간에 저장되는 것임
		
				
		
	}

}
