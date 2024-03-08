
// 내 자신의 생성자를 생성자에서 호출하는 방법

package day3;

public class ThisCall {

	// 필드
	int a;
	int b;

	// 생성자
	public ThisCall() {		// 이건 사실 this가 생략되어있어서 필요 없지만 16-19에서 하나라도 생성자 만드는 순간 디폴트 생성자도 만들어야함
		//this.a = 0;		// 생략되어있는 구문
		//this.b = 0;		// 생략되어있는 구문
		this(0,0);			// 23-26으로 이동하게 만드는 구문
	}
	
	public ThisCall(int a) { // 시작값을 지정하기 위해 임의로 생성자 추가	
		//this.a = a; 
		//this.b = 0;		// 생략되어있는 구문
		this(a,0);			// 23-26으로 이동하게 만드는 구문
		}
	
	public ThisCall(int a, int b) { 
		this.a = a;
		this.b = b;
	}

	// 메소드 setter getter
	public int getA() {					// static이 없기 때문에 인스턴스 함수 : 선언을 해줘야지만 사용 가능
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	// 메소드 main
	public static void main(String[] args) {
		ThisCall th = new ThisCall(); // 0,0				// th라는 객체 생성
		ThisCall th2 = new ThisCall(10); // 10,0
		ThisCall th3 = new ThisCall(20, 30); // 20,30

		System.out.println(th.getA() + "," + th.getB());
		System.out.println(th2.getA() + "," + th2.getB());
		System.out.println(th3.getA() + "," + th3.getB());
	}
}


