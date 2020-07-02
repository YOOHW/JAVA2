package pk701;
import javax.swing.JOptionPane;

public class T701_Test {

	public static void main(String[] args) {

		// 7월 1일 수요일
		
		
		// 자바 모델
		// model1 : JAVA코딩에 의존
		// model2 : JAVA코딩을 절제하고 JSP코딩
		
		// 기본 클래스(Integer, String...) 내장 -> java.lang(임포트 따로 안해도 됨)
		// 외부패키지 클래스 내장-> java.util
		// 클래스 중 대장 클래스 : object
		
		
		String str1="";
		String str2="";
		Double num1, num2;
		char ch='A';
		
		num1= Double.parseDouble(JOptionPane.showInputDialog("값1"));
		num2= Double.parseDouble(JOptionPane.showInputDialog("값2"));
		
		
//		try {
//			System.out.println(num1/num2);
//		} catch (Exception e) {
//			System.out.println("num2가 0이다");
//		}
		
		// num2가 0이 아니면 두개 나눈수 출력
		if (num2!=0) {
			System.out.println(num1/num2);
		}
		
		
		if (Character.isDigit(ch)) {
			System.out.println(ch+"는 문자가 아닙니다.");
		} else {
			System.out.println(ch+"는 문자입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
