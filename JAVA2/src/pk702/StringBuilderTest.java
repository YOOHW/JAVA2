package pk702;
//
//
public class StringBuilderTest {

	public static void main(String[] args) {
		
		//immutable : �Һ��ϴ� ��
		String javastr=new String("java");
		// ó�� ��ü�� �ν��Ͻ�ȭ �� �޸� ��
		System.out.println("javastr�� ���ڿ� �ּ� : "+System.identityHashCode(javastr));
		
		
		//String���κ��� StringBuilder ��ü ����
		StringBuilder buffer=new StringBuilder(javastr);
		// ������ �̷������ �� ���� hash��
		System.out.println("���� �� buffer�� �޸� �ּ� : "+System.identityHashCode(buffer));
		
		
		buffer.append(" and ");
		buffer.append("android ");
		buffer.append("Programming is fun!");
		
		
		System.out.println("���� �� buffer�� �޸� �ּ� : "+System.identityHashCode(buffer));
		//==> ���� �ϰ� ������ �޸� �ּ� ����(buffer�� �� �ڸ����� �����)
		
		javastr=buffer.toString();
		System.out.println(javastr);
		System.out.println("���� ������� javastr�� ���ڿ� �ּ� : "+System.identityHashCode(javastr));
		
		
		
		
		
		
	}

}
