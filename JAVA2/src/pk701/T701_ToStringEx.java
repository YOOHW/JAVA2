package pk701;
import java.util.Date;

class Book{
	String title;
	String author;
	Book(String title, String author){
		this.title=title;
		this.author=author;
	}
	
	@Override   //object의 지표 이거 없으면 안돌아감(주석 아님)
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

		
		Book book=new Book("JAVA","홍길동");
		System.out.println(book);
		
		String str=new String("test");
		System.out.println(str);
		
		// 둘 다 똑같이 객체 만들어서 출력하는데 왜 위에는 해시값?이 나오지??
		// String안에 toString이 재정의 되어있기 때문에 제대로 나오는 것임!!
		
//--------------------------------------------------------------		
		
		Object obj1=new Object();
		Date obj2=new Date();
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
//--------------------------------------------------------------		
		
		Bk book1=new Bk(200,"개미");
		System.out.println(book1);
		System.out.println(book1.toString());
		
//--------------------------------------------------------------		
		
		T701_SmartPhone myPhone=new T701_SmartPhone("삼성","안드로이드");
		String strObj=myPhone.toString();
		
		System.out.println(strObj);
		
		
	}

}
