package pk701;
//
public class T701_ExitExample {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i==5) {
				System.exit(i); // ������Ʈ�� ����(�׷��� �ؿ� ������Ʈ ���� ���� �ȳ���)
				break; // for���� ���� ����
			}
		}
		System.out.println("������Ʈ ����");
	}

}
