package pk702_2;
//
public class GenericPrinterTest {

	public static void main(String[] args) {

//		GENERIC
//		JAVA Version 1.5�̻���� �߰��� ���
//
//		�Ϲ��� Ÿ��(��ü��) : int, String, double...
//		--> ���� : �ʹ� ��ü���̶� �Ź�~~
//		�ֻ��� Ŭ����(������) : Object
//		--> ���� : �Ǳ�� �Ǵµ� ���������� ���� ��~~
//
//		==> �پ��� Ÿ�Լ����� �����ϰ� �ڵ�(���׸�)
//		�ؾ Ʋ ���� ���빰�� �پ��ϰ�~~
		
		
		
//		TŸ���� ��ü�� ��� Ŭ�������� ����� �����Ͽ� �ڵ����� Ŭ������ ����ȯ�� ������
		
		
		GenericPrinter<Powder> powderPrint = new GenericPrinter<Powder>();
		powderPrint.setMaterial(new Powder());
		Powder powder = powderPrint.getMaterial();
		System.out.println(powderPrint);
		System.out.println(powder);
		
		
		GenericPrinter<Plastic> plasticPrint = new GenericPrinter<Plastic>();
		plasticPrint.setMaterial(new Plastic());
		Plastic plastic = plasticPrint.getMaterial();
		System.out.println(plasticPrint);
		System.out.println(plastic);

		// ���� ���� ���Ǽ��� �ȵ����� ���׸��� Ư���� ����ϴ� ��� �߻�
//		GenericPrinter<Water> waterPrint = new GenericPrinter<Water>();
//		waterPrint.setMaterial(new Water());
//		Water water = waterPrint.getMaterial();
//		System.out.println(waterPrint);
//		System.out.println(water);
		// ==> Water�� Material ��� �ȹ���(�׷��� ���� �ּ�ó�� ����)
		
		
		
	}

}
