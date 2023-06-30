/* java.lang 패키지의 최고 조상 클래스 Object의 내장 메소드 중
 * toString() 메소드를 자손에서 오버라이딩을 해서 활용하는 예제)
  
 */

import java.lang.*; //기본 패키지 경로라서 생략 가능

class Point01 extends Object { // extends Object 생략 가능
	int x,y ; //클래스 소속 멤버변수 2개 선언
	
	public Point01() {} // 기본 생성자
	
	public Point01(int x, int y) { //전달인자 개수가 다른 생성자 오버로딩
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x좌표값: " + x + ", y좌표값: " + y + "";
	}
	
}
public class ObjectTest01 {
	public static void main(String[] args) {
		Point01 pt = new Point01(100,200);
		System.out.println(pt.toString());
		System.out.println(pt); // .toString() 생략됨
	}
}
