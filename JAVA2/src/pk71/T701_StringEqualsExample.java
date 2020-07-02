package pk71;

public class T701_StringEqualsExample {

	public static void main(String[] args) {

		String strVar1=new String("��ȣ��");
		String strVar2="��ȣ��";
		
		//������ ���Ǵ� (�ؽ��ڵ� ��)
		if (strVar1==strVar2) {
			System.out.println("���� String ��ü�� ����");
		} else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
		//���� ���Ǵ� (���� ��)
		if (strVar1.equals(strVar2)) {
			System.out.println("���� String ��ü�� ����");
		} else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
		
		//----------------------------------------------------
		
		
		String str1=new String("abc");
		String str2=new String("abc");
		
		System.out.println(str1==str2); // �ؽ��ڵ� ��
		// ==> �� String �ν��Ͻ� �ּҰ�(heap)�� �ٸ�
		
		System.out.println(str1.equals(str2)); // ���� ��
		// ==> String Ŭ������ equals �޼ҵ尡 �����ǵǾ� ���� ���� ����������
		
		// �ٵ� �Ѵ� true���� �������� �ؾ� ���߿� ���α׷� ���� �� �̻� ����
		
		
		//-------------------------------------------------------
		
		// �ڽ�
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		// Integer�� �ڽ��ؼ� �����͵� ������ ��� �Ȱ��� ����
		
		
	}

}
