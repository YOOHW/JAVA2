package pk702;

public class Person {
	private String name;
	private int age;
	
	// 기본 생성자
	public Person() {}
	
	// 마우스 오른쪽 => source => generate getter and setter 클릭
	// 그러면 밑에 함수 알아서 생성됨
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
