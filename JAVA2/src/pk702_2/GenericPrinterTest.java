package pk702_2;
//
public class GenericPrinterTest {

	public static void main(String[] args) {

		
//		T타입의 객체는 모든 클래스에서 상속이 가능하여 자동으로 클래스로 형변환이 가능함
		
		
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

		// 물의 재료는 허용되서는 안되지만 제네릭의 특성상 허용하는 모순 발생
//		GenericPrinter<Water> waterPrint = new GenericPrinter<Water>();
//		waterPrint.setMaterial(new Water());
//		Water water = waterPrint.getMaterial();
//		System.out.println(waterPrint);
//		System.out.println(water);
		// ==> Water는 Material 상속 안받음(그래서 위에 주석처리 해줌)
		
		
		
	}

}
