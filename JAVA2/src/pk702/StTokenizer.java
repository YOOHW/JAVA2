package pk702;

import java.util.StringTokenizer;

public class StTokenizer {
	public static void main(String[] args) {

		String str="Have a Nice Day";
//		StringTokenizer(자르고 싶은 문자열, 자르는 기준 문자의 집합, 자르는 기준을 넣을지 말지)
		StringTokenizer obj=new StringTokenizer(str," ",false);
		
		// StringTokenizer.hasMoreToken()-Token이 저장되어있는 배열
		while(obj.hasMoreTokens()) {
			String t=obj.nextToken();
			System.out.println(t);
		}
		
		
		
	}

}
