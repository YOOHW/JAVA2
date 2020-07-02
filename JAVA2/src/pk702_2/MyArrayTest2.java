package pk702_2;

class MyArray{
	private Object[] array=new Object[10];
	int i;
	
	public void add(Object obj) {
		array[i++]=obj;
	}
	
	public Object get(int index) {
		return array[index];
	}
}


public class MyArrayTest2 {

	public static void main(String[] args) {
		
		// index 0번은 배열의 전체 주소가됨(start주소가 전체 주소)
		
		MyArray myArray1=new MyArray();
		myArray1.add(new String("test"));
		String str=(String)myArray1.get(0); // 강제형변환(Object니까)
		System.out.println(str);
		
		MyArray myArray2=new MyArray();
		myArray2.add(new Integer(100));
		Integer num=(Integer)myArray2.get(0); // 강제형변환
		System.out.println(num);
		
		
		
	}

}
