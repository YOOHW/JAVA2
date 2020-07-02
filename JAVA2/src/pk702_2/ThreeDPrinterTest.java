package pk702_2;
//
public class ThreeDPrinterTest {

	public static void main(String[] args) {

		ThreeDPrinter printer = new ThreeDPrinter();

		Powder p1 = new Powder();
		printer.setMaterial(p1);
		
		// 다운캐스팅
		Powder p2 = (Powder)printer.getMaterial();
	}

}
