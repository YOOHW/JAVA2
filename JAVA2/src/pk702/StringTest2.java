package pk702;
//
//
public class StringTest2 {

	public static void main(String[] args) {
		
		String javastr=new String("JAVA ");
		String androidstr=new String("and android");
		
		System.out.println(javastr);
		// ��ü �ν��Ͻ� �� �� �ּ� ==> ��ü.hashcode
		// ��ü�� �ν��Ͻ� �Ǳ� �� �ּ� ==> system.identityhashcode(��ü)
		System.out.println("ó�� ���ڿ� �ּ� �� : "+System.identityHashCode(javastr));
		
		javastr=javastr.concat(androidstr);
		
		System.out.println(javastr);
		System.out.println("ó�� ���ڿ� �ּ� �� : "+System.identityHashCode(javastr));
		// javastr�̶� androidstr�̶� �ٿ��� �ٽ� javastr�� �־��ٰ� �ؼ�
		// �� �޸𸮿� �ٽ� ���� ���� ���� �ƴ϶� ���ο� ������ ����Ǵ� ����
		
				
		
	}

}
