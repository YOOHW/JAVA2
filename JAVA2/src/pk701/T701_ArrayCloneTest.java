package pk701;
//
public class T701_ArrayCloneTest {

	public static void main(String[] args) {

		// Enhanced for Loop
		// 일반for문 : for(int i=0; i<5; i++)
		// Enhanced for Loop : for(int num:arr2)
		
		int[] arr1= {1,2,3,4,5};
		int[] arr2;
		
		arr2=arr1.clone();
		
		System.out.println("복사된 arr2 배열 : ");
		for (int num : arr2) {
			System.out.print(num+" ");
		}
		
		arr2[3]=0; //arr2의 요소값을 변경
		
		
		System.out.println("변경 후 arr1 배열 : ");
		for (int num : arr1) {
			System.out.print(num+" ");
		} // 결과  : 1 2 3 4 5
		
		System.out.println();
		
		System.out.println("변경 후 arr2 배열 : ");
		for (int num : arr2) {
			System.out.print(num+" ");
		} // 결과  : 1 2 3 0 5
		
	}

}
