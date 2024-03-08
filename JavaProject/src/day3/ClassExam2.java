package day3;

// 계산기 만들기를 필드, 생성자, 메소드로 구분

import java.util.Scanner;

public class ClassExam2 {

	//field : 자주 쓰는 
	
	private int num1, num2; // int 타입의 숫자 a, b 선언
	private String str; // String 타입의 문자 a 선언(연산기호)
	private double result; // 결과값이 float일 수도 있으니까 double
		
	//constructor : 객체 생성
	
	  public ClassExam2() { // 값을 넣어줄 디폴트 객체 생성
	  }
	  
//	  public ClassExam2(int n1, String st, int n2 ) { // 1 + 2 처럼 값을 입력받을 공간 생성할거면 이렇게
//		  num1 = n1;
//		  str = st;
//		  num2 = n2;
//	  }
	  
	//method
	 
	  //setter
	  public void setnum1(int n1) { // 입력받은 숫자 n1
		  num1 = n1;
	  }
	  public void setnum2(int n2) { // 입력받은 숫자 n2
		  num2 = n2;
	  }
	  public void setstr(String st) { // 입력받은 연산기호 st
		  str = st;
	  }
	  
	  //getter
	  public int getnum1() { // num1 반환
		  return num1;
	  }
	  public int getnum2() { // num2 반환
		  return num2;
	  }
	  public String getstr() { // 연산기호 str 반환
		  return str;
	  }
	  
	  //함수 만들기
	  public double plus(int n1, int n2) {
		  return result = n1 + n2;
	  }
	  public double minus(int n1, int n2) {
		  return result = n1 - n2;
	  }
	  public double multiply(int n1, int n2) {
		  return result = n1 * n2;
	  }
	  public double divide(int n1, int n2) {
		  return result = (double)n1 / n2;
	  }
	  
	  //호출(main)
	  public static void main(String[] args) {
		 
		  Scanner sc = new Scanner(System.in); // 사용자에게 값 입력받을 수 있도록
		  
		  ClassExam2 ce = new ClassExam2(); // 값을 넣어줄 객체 ce 생성
		  
		  ce.setnum1(sc.nextInt()); // 이 구문은 main 안에서만 도는 것이므로 class 이름인 ClassExam2. ~~~로 하면 안됨
		  ce.setstr(sc.next());
		  ce.setnum2(sc.nextInt()); // 오직 setter를 통해서만 필드에 접근 가능
		  
		  
		  System.out.println(ce.getnum1() + "" + ce.getstr() + "" + ce.getnum2() + "" + "=");
		  System.out.println(ce.plus(ce.getnum1(), ce.getnum2()));
		  System.out.println(ce.minus(ce.getnum1(), ce.getnum2()));
		  System.out.println(ce.multiply(ce.getnum1(), ce.getnum2()));
		  System.out.println(ce.divide(ce.getnum1(), ce.getnum2()));
	  }
}
		  
// 여유될 때 swhich case 구문 통해서 연산기호에 대한 결과만 출력되게 짜보기

