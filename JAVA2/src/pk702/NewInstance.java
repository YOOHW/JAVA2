package pk702;
//
public class NewInstance {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Person person1=new Person();
		System.out.println(person1); // �ؽð� ����
		
		
		// ��ü �����ϴ� ���ο� ���
		// Ŭ������ ����ִ��� �� �� �̷��� ���⵵ �Ѵ�?
		Class pClass= Class.forName("pk702.Person");
		System.out.println(pClass);
		
		
		Person person2=(Person)pClass.newInstance();
		System.out.println(person2);
		
		
	}

}
