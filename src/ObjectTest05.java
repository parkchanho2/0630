/*
 java.lang 패키지의 final cass인 문자열을 다루는 내장 api String 클래스 특징)
  	문자열 String은 자기 자신 내용을 수정 못한다. 문자열 내용이 수정되면 새로운 무자열 객체가 생성된다.
  	
 */
public class ObjectTest05 {
	public static void main(String[] args) {
		String str01 = "java";
		System.out.println("대문자로 변경: " + str01.toUpperCase());
		System.out.println("str01 그대로: " + str01);
		
		String str02 = new String(" Programing");
		System.out.println("\'java\' 문자 길이: " + str01.length()); //length() 메소드로 문자 길이 반환
		
		String result = str01.concat(str02);
		System.out.println("두문자 연결: " + result);
		System.out.println("\'java\'의 세번 째 단일문자: " + str01.charAt(2)); //charAt(2) 내장 메소드는 주어진 인자값 2에 해당하는 단일문자를 구함.
		
		System.out.println("\' Programming\' 에서 단일문자 r이 몇번째 저장되어 있는가? " + (str02.indexOf('r')+1));
		// indexOf('r') 내장 메서드는 단일문자 r을 맨왼쪽에서 부터 찾아서 가장 먼저 나오는 해당 문자 위치번호를 0부터 카운터 해서 반환 => 3
		
		//문제) String 내장 api의 내장 메서드 중에서 str02변수에 저장된 문자열 값중에서 단일문자 r을 맨 오른쪽부터 찾아서 가장먼저 나오는 해당 문자 위치번호를 +1 을 해서 반환 해보자
		// indexOf 맨 왼쪽 부터 카운트함. lastIndexOf 맨 오른쪽 부터 카운트 함 
		System.out.println("번호: " + (str02.lastIndexOf('r')+1));
	}
}
