package day3;

public class ClassExam {
	
	//field
	private int a; // 필드 생성
	
	//constructor
	public ClassExam() { // (원래는 생략되어있던) 디폴트생성자 1 :값을 그냥 0부터 시작할거면 요거만 적으면 됨
		System.out.println("디폴트생성자");
	}
	
	public ClassExam(int aa) { // 디폴트생성자 2 -> 내가 원하는 값부터 시작하기 위해 - int를 입력받기 위해 생성자를 (임의로)추가로 생성한 것
		a = aa;
	}
	
	//method : setter(외부에서 주는 데이터를 입력하는 함수), getter(외부에서 필드 값을 얻어가는 함수)
	
	public void setA(int num) { //필드명 a에 입력 / int라는 num을 받지만 void: 값을 보낼 필요 없음
		a = num;
	}
	
	public int getA() { // int 형태의 값을 반환
		return a;
	}
	
	public static void main(String[] args) {
		
		ClassExam ce2 = new ClassExam(); // 객체 생성, 생성자1호출
		ClassExam ce3 = new ClassExam(10); // 객체 생성, 생성자2호출 / (10)을 입력하여 10으로 시작
		ClassExam ce4 = new ClassExam(5600); // 객체 생성, 생성자2호출 / (5600)을 입력하여 5600으로 시작
		
		ce2.setA(500); //ce2.a=500 이렇게 필드를 직접적으로 수정하는건 매우 위험 //setter
		System.out.println(ce2.getA()); //(ce2.a); //getter
		System.out.println(ce3.a);
		System.out.println(ce4.a);
		
	}
}



