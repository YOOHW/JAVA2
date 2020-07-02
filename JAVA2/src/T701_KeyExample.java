import java.util.HashMap;

public class T701_KeyExample {

	public static void main(String[] args) {

//		hashCode
//		identityHashCode
//		========================
//		hashCode + map = hashmap
//		hashcode ========> ����(key)
//		map      ========> ġŲ(value)
//		���� : ġŲ
//		��� : ����
//		
//		�й� : 100
//		���� : ȫ�浿
//		========================
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>(); // ���ڰ��� ������ ���� �ްڴ�!
		// ==> Key ��ü�� �ĺ�Ű�� �Ͽ� String ���� �����ϴ� HashMap ��ü ����
		
		// �ĺ�Ű(hashcode)�� put���� �Է�
		hashMap.put(new Key(1),"ȫ�浿");
		
		// �ĺ�Ű(hashcode)�� �̿��Ͽ� ��(String)�� �о��
		String value=hashMap.get(new Key(1));
		System.out.println(value);
		
		
		
		

	}

}
