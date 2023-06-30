/* String 문자열 내장 클래스에 오버라이딩 된 equals() 메서드와 자바 비교연산자 중 하나인 (==) 같다 연산의 활용과 차이점
 * 활용과 차이점 => 프로젝트 개발할 때 자바 개발자들이 실수하는 부분이 있다.
  
  
 */

public class ObjectTest02 {
	public static void main(String[] args) {
		int a = 10, b = 10;
		if(a==b) { // 기본타입 값에서 == 같다 비교연산으로 비교하면 값을 비교한다.
			System.out.println(a + " 와 " + b + "는 값이 같다.");
		}else {
			System.out.println(a + " 와 " + b + "는 값이 다르다.");
		}
		
		String password01 = new String("1234");
		String password02 = new String("1234"); // 두 객체 주소가 다르다.
		
		if(password01 == password02) { // 참조 타입에서 == 로 비교하면 문자열 내용값을 비교하는 것이 아니라 객체 주소를 비교한다. => false
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(password01.contentEquals(password02)) { //String 참조 타입에서는 오버라이딩된 equals() 메소드로 비교하면 객체주소를 비교하는 것이 아니라 문자열 내용값만 비교함.
			System.out.println("같다");
			
		}else {
			System.out.println("다르다");
		}
	}
}
