
/*
	this 
	: 자기자신에 접근하는 reference 변수 : heap 영역에 있는 것을 접근 하는 것
	instance 메소드의 첫 번째 매개변수로 항상 존재(보이지않을뿐)
	선언할 수는 없고 사용만 가능 -> 만약 굳이굳이 this를 붙일 경우 중복으로 생성되게 됨(이미 존재하기 때문)
	객체를 구별해주는 역할 -> 디폴트기능 (코드영역에 하나만 만들어서 여러 class에 사용 가능하게 해줌)
	
	1. 필드명과 지역변수 이름이 같을경우 필드임을 구별하기 위해 사용 / ex) a=a; 일 때 앞에 a는 필드a, 뒤에 a는 지역변수 a인데 이름이 같아 구분이 안되므로 this.a=a;로 작성해야 함
	2. 인스턴스메소드에서 자기자신의 객체를 리턴하고 싶을 때 this를 명시적으로 사용
	  public class명 객체명(){		// (int타입.. 등이 아니라)clss 타입의 객체를 리턴하는 것이고, 괄호 안에 this가 들어있기 때문에 호출시 자기자신을 리턴함
	  	return this;
	
	this()
	: 자기자신의 또 다른 생성자를 호출하는 것
	*/

package day3;

public class This {

	int a;
	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public static void main(String []ar) {
		This th = new This();
		
		th.setA(100);
		
	}
	}
	
	
	
