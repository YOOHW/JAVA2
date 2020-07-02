package pk71;

public class T701_StringEqualsExample {

	public static void main(String[] args) {

		String strVar1=new String("이호진");
		String strVar2="이호진";
		
		//물리적 비교판단 (해시코드 비교)
		if (strVar1==strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		//논리적 비교판단 (내용 비교)
		if (strVar1.equals(strVar2)) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		
		//----------------------------------------------------
		
		
		String str1=new String("abc");
		String str2=new String("abc");
		
		System.out.println(str1==str2); // 해시코드 비교
		// ==> 두 String 인스턴스 주소값(heap)이 다름
		
		System.out.println(str1.equals(str2)); // 내용 비교
		// ==> String 클래스의 equals 메소드가 재정의되어 논리적 값이 같음을구현
		
		// 근데 둘다 true값이 나오도록 해야 나중에 프로그램 만들 때 이상 없음
		
		
		//-------------------------------------------------------
		
		// 박싱
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		// Integer에 박싱해서 가져와도 위에랑 결과 똑같이 나옴
		
		
	}

}
