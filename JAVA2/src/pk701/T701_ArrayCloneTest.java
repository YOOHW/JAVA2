package pk701;
//
public class T701_ArrayCloneTest {

	public static void main(String[] args) {

		// Enhanced for Loop
		// �Ϲ�for�� : for(int i=0; i<5; i++)
		// Enhanced for Loop : for(int num:arr2)
		
		int[] arr1= {1,2,3,4,5};
		int[] arr2;
		
		arr2=arr1.clone();
		
		System.out.println("����� arr2 �迭 : ");
		for (int num : arr2) {
			System.out.print(num+" ");
		}
		
		arr2[3]=0; //arr2�� ��Ұ��� ����
		
		
		System.out.println("���� �� arr1 �迭 : ");
		for (int num : arr1) {
			System.out.print(num+" ");
		} // ���  : 1 2 3 4 5
		
		System.out.println();
		
		System.out.println("���� �� arr2 �迭 : ");
		for (int num : arr2) {
			System.out.print(num+" ");
		} // ���  : 1 2 3 0 5
		
	}

}
