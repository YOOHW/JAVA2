package pk701;
import java.util.Date;

class Book{
	String title;
	String author;
	Book(String title, String author){
		this.title=title;
		this.author=author;
	}
	
	@Override   //object�� ��ǥ �̰� ������ �ȵ��ư�(�ּ� �ƴ�)
	public String toString() {
		return title+", "+author;
	}
}

class Bk{
	int bookNumber;
	String bookTitle;
	Bk(int bookNumber, String bookTitle){
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}
	@Override
	public String toString() {
		return bookNumber+", "+bookTitle;
	}
	
}

public class T701_ToStringEx {

	private static Object Date;

	public static void main(String[] args) {

		
		Book book=new Book("JAVA","ȫ�浿");
		System.out.println(book);
		
		String str=new String("test");
		System.out.println(str);
		
		// �� �� �Ȱ��� ��ü ���� ����ϴµ� �� ������ �ؽð�?�� ������??
		// String�ȿ� toString�� ������ �Ǿ��ֱ� ������ ����� ������ ����!!
		
//--------------------------------------------------------------		
		
		Object obj1=new Object();
		Date obj2=new Date();
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
//--------------------------------------------------------------		
		
		Bk book1=new Bk(200,"����");
		System.out.println(book1);
		System.out.println(book1.toString());
		
//--------------------------------------------------------------		
		
		T701_SmartPhone myPhone=new T701_SmartPhone("�Ｚ","�ȵ���̵�");
		String strObj=myPhone.toString();
		
		System.out.println(strObj);
		
		
	}

}
