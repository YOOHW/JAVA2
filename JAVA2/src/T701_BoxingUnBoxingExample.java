
public class T701_BoxingUnBoxingExample {

	public static void main(String[] args) {

		//Boxing
		Integer obj1=new Integer(100);
		Integer obj2=new Integer("200");
		//Integer obj3=new Integer.valueOf("300");
		
		//UnBoxing
		int value1=obj1.intValue(); //����� ��ü�� �⺻Ÿ�Կ� �־��ִ°�
		int value2=obj2.intValue(); //����� ��ü�� �⺻Ÿ�Կ� �־��ִ°�
		
		System.out.println(value1);
		System.out.println(value2);
		
	}

}
