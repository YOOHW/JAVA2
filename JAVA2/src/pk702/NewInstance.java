package pk702;
//
public class NewInstance {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Person person1=new Person();
		System.out.println(person1); // 해시값 나옴
		
		
		// 객체 생성하는 새로운 방법
		// 클래스가 어디있는지 모를 때 이렇게 쓰기도 한다?
		Class pClass= Class.forName("pk702.Person");
		System.out.println(pClass);
		
		
		Person person2=(Person)pClass.newInstance();
		System.out.println(person2);
		
		
	}

}
