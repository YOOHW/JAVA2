package pk701;
class Student{
	int studentId;
	String studentName;
	Student(int studentId, String studentName){
		this.studentId=studentId;
		this.studentName=studentName;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
	
	@Override
	public boolean equals(Object obj) {
		// instanceof : 연산자로써 객체타입 형변환이 가능한지의 여부를 판단
		if (obj instanceof Student) { // Student 객체가 있는지 물어보는 중
			// 부모(오른쪽)가 자식(왼쪽)이 되어야함 ==> 다운캐스팅
			// 다운캐스팅 : 부모클래스의 객체가 자식클래스의 객체로 형변환
			Student std = (Student)obj; // 억지로 같게끔 만들어줌
			if (studentId==std.studentId) {
				return true;
			} else return false;
		}
		return false;
	}
	
}




public class T701_EqualTest {

	public static void main(String[] args) {

		Student studentLee=new Student(100,"이상원");
		Student studentLee2=studentLee;
		Student studentSang=new Student(100,"이상원");
		
		// 동일한 주소의 두 인스턴스 비교
		if (studentLee == studentLee2) {
			System.out.println("주소가 같습니다");
		} else {
			System.out.println("주소가 다릅니다");
		} // 결과 : 주소가 같습니다
		
		if (studentLee.equals(studentLee2)) {
			System.out.println("내용이 같습니다");
		} else {
			System.out.println("내용이 다릅니다");
		} // 결과 : 내용이 같습니다
		
		
		
		
		// 다른 주소를 갖고 있는 객체의 물리적, 논리적 비교
		if (studentLee == studentSang) {
			System.out.println("주소가 같습니다");
		} else {
			System.out.println("주소가 다릅니다");
		} // 결과 : 주소가 다릅니다
		
		if (studentLee.equals(studentSang)) {
			System.out.println("내용이 같습니다");
		} else {
			System.out.println("내용이 다릅니다");
		} // 결과 : 내용이 다릅니다
		// ==> 보기에는 내용은 똑같은데 왜 다르다고 나오는거지?
		// Object 밑에 equals 재정의가 되어있음
		// 앞에서 String, Integer 값 비교할때는 자동으로 equals 재정의 되어있었음
		// 근데 student는사용자 클래스여서 equals를 가져다가 썻지만 재정의가 되지않은 상태
		// 따라서 내용도 다르다고 나오는거임
		// 그래서 위에 클래스에서 equals 오버로딩 시키니까 같다고 나옴!!
		
		
		
		
		
		
		// 인스턴스 생성 시 만들어지는 heap 메모리 주소
		System.out.println("studentLee의 hashcode 값 : "+studentLee.hashCode());
		System.out.println("studentSang의 hashcode 값 : "+studentSang.hashCode());
		
		// 인스턴스 전에 주어지는 실제 주소
		System.out.println("studentLee의 실제 주소 값 : "
		+System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소 값 : "
				+System.identityHashCode(studentSang));

		
		
		
		
		
	}

}
