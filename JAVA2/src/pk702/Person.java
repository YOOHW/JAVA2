package pk702;

public class Person {
	private String name;
	private int age;
	
	// �⺻ ������
	public Person() {}
	
	// ���콺 ������ => source => generate getter and setter Ŭ��
	// �׷��� �ؿ� �Լ� �˾Ƽ� ������
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
