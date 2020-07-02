package pk701;
//
public class Key {
	public int number;
	public Key(int number) {
		this.number=number;
	}
	@Override
	public int hashCode() {
		return number;
	}
	// ������ ��������ü�� hashcode���� object�� hashcode���� ������ ������
	@Override
	public boolean equals(Object obj) {
		//�θ� ��ü�� �ڽ� ��ü�� �����Ǿ ����ȯ�� �������� �Ǵ�
		if (obj instanceof Key) {
			// �ٿ�ĳ�������� obj�� Key Ŭ������ compareKey�� ����
			Key compareKey=(Key)obj;
			// this�� number�� compareKey�� number���� ������ true, �ƴϸ� false
			if (number==compareKey.number) {
				return true;
			} else return false;
		}
		return false;
	}
}
