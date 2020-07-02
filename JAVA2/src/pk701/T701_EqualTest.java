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
		// instanceof : �����ڷν� ��üŸ�� ����ȯ�� ���������� ���θ� �Ǵ�
		if (obj instanceof Student) { // Student ��ü�� �ִ��� ����� ��
			// �θ�(������)�� �ڽ�(����)�� �Ǿ���� ==> �ٿ�ĳ����
			// �ٿ�ĳ���� : �θ�Ŭ������ ��ü�� �ڽ�Ŭ������ ��ü�� ����ȯ
			Student std = (Student)obj; // ������ ���Բ� �������
			if (studentId==std.studentId) {
				return true;
			} else return false;
		}
		return false;
	}
	
}




public class T701_EqualTest {

	public static void main(String[] args) {

		Student studentLee=new Student(100,"�̻��");
		Student studentLee2=studentLee;
		Student studentSang=new Student(100,"�̻��");
		
		// ������ �ּ��� �� �ν��Ͻ� ��
		if (studentLee == studentLee2) {
			System.out.println("�ּҰ� �����ϴ�");
		} else {
			System.out.println("�ּҰ� �ٸ��ϴ�");
		} // ��� : �ּҰ� �����ϴ�
		
		if (studentLee.equals(studentLee2)) {
			System.out.println("������ �����ϴ�");
		} else {
			System.out.println("������ �ٸ��ϴ�");
		} // ��� : ������ �����ϴ�
		
		
		
		
		// �ٸ� �ּҸ� ���� �ִ� ��ü�� ������, ���� ��
		if (studentLee == studentSang) {
			System.out.println("�ּҰ� �����ϴ�");
		} else {
			System.out.println("�ּҰ� �ٸ��ϴ�");
		} // ��� : �ּҰ� �ٸ��ϴ�
		
		if (studentLee.equals(studentSang)) {
			System.out.println("������ �����ϴ�");
		} else {
			System.out.println("������ �ٸ��ϴ�");
		} // ��� : ������ �ٸ��ϴ�
		// ==> ���⿡�� ������ �Ȱ����� �� �ٸ��ٰ� �����°���?
		// Object �ؿ� equals �����ǰ� �Ǿ�����
		// �տ��� String, Integer �� ���Ҷ��� �ڵ����� equals ������ �Ǿ��־���
		// �ٵ� student�»���� Ŭ�������� equals�� �����ٰ� ������ �����ǰ� �������� ����
		// ���� ���뵵 �ٸ��ٰ� �����°���
		// �׷��� ���� Ŭ�������� equals �����ε� ��Ű�ϱ� ���ٰ� ����!!
		
		
		
		
		
		
		// �ν��Ͻ� ���� �� ��������� heap �޸� �ּ�
		System.out.println("studentLee�� hashcode �� : "+studentLee.hashCode());
		System.out.println("studentSang�� hashcode �� : "+studentSang.hashCode());
		
		// �ν��Ͻ� ���� �־����� ���� �ּ�
		System.out.println("studentLee�� ���� �ּ� �� : "
		+System.identityHashCode(studentLee));
		System.out.println("studentSang�� ���� �ּ� �� : "
				+System.identityHashCode(studentSang));

		
		
		
		
		
	}

}
