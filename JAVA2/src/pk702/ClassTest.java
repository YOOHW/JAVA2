package pk702;
//
//
public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		// 접근 한정자?
		// private : 같은 클래스 내에서만 쓸 수 있는 것 (public : 여기저기서 다 쓸 수 있는 것)
		// 근데 밖에서 써야 할 경우가 있었음
		// fuction 이용해서 return 값 받아서 private 한거 쓸 수 있었음
		
		// getter setter ==> private 한거를 쓰기 위한것임		
		
//		class Test{
//			private int code;
//		}
//		public setter(String code) {
//			this.code=code;
//		}
//		public getter() {
//			return code;
//		}
//		class Sample{	
//			Test test=new Test();
//			test.setter(100);
//			test.getter();
//		}

		
		Person person=new Person();
		
//		Person.name="홍길동"; // name변수는 private하니까 이렇게 못 씀
		// 생성자를 사용하지않고 바로 private한 변수를 쓰는 방법이 없을까?
		
		// 1.객체를 생성하여 클래스 이름 획득하는 방법
		Class pClass1=person.getClass(); //getClass 안만들었는데 어디서 왔지(Object)
		// ==> Object의 getClass()메서드를 사용
		System.out.println(pClass1.getName());
		
		// 2. 클래스가 접근해서 클래스 이름을 획득
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		// 3. 클래스 이름으로 가져오기
		Class pClass3=Class.forName("pk702.Person");
		System.out.println(pClass2.getName());
		
		
		
	}

}
