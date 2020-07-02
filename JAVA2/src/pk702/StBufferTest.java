package pk702;
//
public class StBufferTest {

	public static void main(String[] args) {

//		�ѹ� ������ String ���� �Һ�
//		String -> ����
//		StringBuffer -> ����ȭ ����
//		StringBuilder -> ����ȭ ���� x 
//		����ȭ ==> ����(��Ƽ������) / ���� : �Ӱ豸��

		StringBuffer buf=new StringBuffer("Nice Day! ");
		System.out.println(buf.toString()); // toString �ٷ� ���� ����
		System.out.println(buf.length()); // ���ڿ��� ũ��
		System.out.println(buf.capacity()); // �뷮
		
		buf.ensureCapacity(100); //�뷮 ũ�� ����
		System.out.println(buf.capacity()); // Ȯ���غ��� 100 ����
		
		buf.insert(0, "Hi! ");
		buf.insert(14, "Everybody^^");
		System.out.println(buf);
		
		buf.delete(0, 4);
		System.out.println(buf);
		
		// StringBuffer : �ٸ� ����ȭ ������. ���� �����忡���� �������� �ʴ�
		
		
		
		
		
		
		
		
		
	}

}
