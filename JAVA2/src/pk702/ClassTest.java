package pk702;
//
//
public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		// ���� ������?
		// private : ���� Ŭ���� �������� �� �� �ִ� �� (public : �������⼭ �� �� �� �ִ� ��)
		// �ٵ� �ۿ��� ��� �� ��찡 �־���
		// fuction �̿��ؼ� return �� �޾Ƽ� private �Ѱ� �� �� �־���
		
		// getter setter ==> private �ѰŸ� ���� ���Ѱ���		
		
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
		
//		Person.name="ȫ�浿"; // name������ private�ϴϱ� �̷��� �� ��
		// �����ڸ� ��������ʰ� �ٷ� private�� ������ ���� ����� ������?
		
		// 1.��ü�� �����Ͽ� Ŭ���� �̸� ȹ���ϴ� ���
		Class pClass1=person.getClass(); //getClass �ȸ�����µ� ��� ����(Object)
		// ==> Object�� getClass()�޼��带 ���
		System.out.println(pClass1.getName());
		
		// 2. Ŭ������ �����ؼ� Ŭ���� �̸��� ȹ��
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		// 3. Ŭ���� �̸����� ��������
		Class pClass3=Class.forName("pk702.Person");
		System.out.println(pClass2.getName());
		
		
		
	}

}
