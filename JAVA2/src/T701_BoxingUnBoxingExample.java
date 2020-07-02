
public class T701_BoxingUnBoxingExample {

	public static void main(String[] args) {

		//Boxing
		Integer obj1=new Integer(100);
		Integer obj2=new Integer("200");
		//Integer obj3=new Integer.valueOf("300");
		
		//UnBoxing
		int value1=obj1.intValue(); //포장된 객체를 기본타입에 넣어주는것
		int value2=obj2.intValue(); //포장된 객체를 기본타입에 넣어주는것
		
		System.out.println(value1);
		System.out.println(value2);
		
	}

}
