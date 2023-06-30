/*
  Object을 상속받은 자손에서 부모의 equals() 메소드를 오버라이딩을 해서 비교해서 제대로 된 비교를 하는 예제. 
  
 */

class Point02{ // extends Object 생략
	int x,y;
	
	public Point02 () {}
	
	public Point02(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	public boolean equals(Object obj) { // 업캐스팅 되면서 인자가 전달됨.
		//문제) 형변환 유무 판단 연산자인 instanceof 를 사용해서 보다 더 안전한 다운캐스팅이 되게 해보자.
		
		Point02 ptTmp = null; 
		if(obj instanceof Point02) { // 명시적인 다운캐스팅이 가능한가? 사전에 업캐스팅이 되어서 가능함. 
			ptTmp = (Point02) obj; // 명시적인 다운캐스팅
		}
		
		if((x == ptTmp.x) && (y == ptTmp.y)) { //기본 정수타입 값을 == 로 값만 비교
			return true;
		}else {
			return false;
		}
	}
}
public class ObjectTest03 {
	public static void main(String[] args) {
		Point02 pt01 = new Point02(100,200);
		Point02 pt02 = new Point02(100,200);
		
		if(pt01 == pt02) { //참조 타입 객체를 ==로 비교해서 객체주소를 비교 => pt01과 pt02는 각각 객체주소가 다르다.
			System.out.println("pt01과 pt02는 같다.");
		}else {
			System.out.println("pt01과 pt02는 다르다");
		}
		if(pt01.equals(pt02)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}
}
