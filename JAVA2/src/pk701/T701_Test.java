package pk701;
import javax.swing.JOptionPane;

public class T701_Test {

	public static void main(String[] args) {

		// 7�� 1�� ������
		
		
		// �ڹ� ��
		// model1 : JAVA�ڵ��� ����
		// model2 : JAVA�ڵ��� �����ϰ� JSP�ڵ�
		
		// �⺻ Ŭ����(Integer, String...) ���� -> java.lang(����Ʈ ���� ���ص� ��)
		// �ܺ���Ű�� Ŭ���� ����-> java.util
		// Ŭ���� �� ���� Ŭ���� : object
		
		
		String str1="";
		String str2="";
		Double num1, num2;
		char ch='A';
		
		num1= Double.parseDouble(JOptionPane.showInputDialog("��1"));
		num2= Double.parseDouble(JOptionPane.showInputDialog("��2"));
		
		
//		try {
//			System.out.println(num1/num2);
//		} catch (Exception e) {
//			System.out.println("num2�� 0�̴�");
//		}
		
		// num2�� 0�� �ƴϸ� �ΰ� ������ ���
		if (num2!=0) {
			System.out.println(num1/num2);
		}
		
		
		if (Character.isDigit(ch)) {
			System.out.println(ch+"�� ���ڰ� �ƴմϴ�.");
		} else {
			System.out.println(ch+"�� �����Դϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
