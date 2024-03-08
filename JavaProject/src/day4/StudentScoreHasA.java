
// 성적처리클래스(메인클래스)
// 이름 국 영 수 총점 평균
// 이름 : Name class 사용
// 과목 : Subject
// 총점, 평균은 현재 class에서 생성

package day4;

public class StudentScoreHasA {

	 private Name name ;			// 기존에 만들어둔 Name 이라는 class를 사용해서 레퍼런스를 만드는데 그 레퍼런스 name
	 private Subject kor;			// Subject라는 타입의 Kor라는 '레퍼런스 생성' / kor 이라는 이름은 메인 클래스에서(가져다쓰는쪽에서) 결정하는 것
	 private Subject eng;			// 과목중에 너는 eng라는 이름 가져 ~
	 private Subject mat;
	 
	 private int total;
	 private double avg;
	 
	 public StudentScoreHasA() {	    // 생성자 생성 1: StudentScoreHasA 해당 클래스가 불러질 때(new) 21-24 구문이 자동 실행됨
		name = new Name();				// 뒤에 Name이라는 '객체 생성' -> 이걸 앞에 Name이라는 객체에 넣어줌
		kor = new Subject();
		eng = new Subject();
		mat = new Subject();
	 }

	 public StudentScoreHasA(Name name,Subject kor,Subject mat,Subject eng) {		// 값을 입력해서 시작하는 생성자 임의 생성
		 									// 생성자 생성 2: StudentScoreHasA 해당 클래스가 불러질 때(new) 21-24 구문이 자동 실행됨
		 this.name = name;
		 this.kor = kor;
		 this.mat = mat;
		 this.eng = eng;
	 }
	 
	// setter
	 public void setName(String name) {					// 이 name은 외부에서 주어진 값
			this.name.setName(name);					// setName은 앞서 만들어둔 Name class의 setter 부분
		}
		public void setKor(int kor) {
			this.kor.setSubject(kor);
		}
		public void setEng(int eng) {
			this.eng.setSubject(eng);
		}
		public void setMat(int mat) {
			this.mat.setSubject(mat);
		}
	
	//getter
		public String getName() {
			return this.name.getName();
		}
		public int getKor() {
			return this.kor.getSubject(); 
		}
		public int getMat() {
			return this.mat.getSubject();
		}
		
		public int getEng() {
			return this.eng.getSubject();
		}
		
		public int getTotal() {
			return total = getKor() + getMat() + getEng();
		}
		
		public double getAvg() {
			return avg = (double) getTotal() / 3;
		}
		
	// 값 입력, 출력
	public static void main (String[] args) {			// 실제 값이 입력되고 출력되는 메인 구문
	
	StudentScoreHasA stu = new StudentScoreHasA();		// stu라는 객체를 만든 것
	
		stu.setName("Supperman");
		stu.setKor(90);
		stu.setMat(100);
		stu.setEng(70);
		
		System.out.println(stu.getName());
		System.out.println(stu.getKor());
		System.out.println(stu.getMat());
		System.out.println(stu.getEng());
		System.out.println(stu.getTotal());
		System.out.println(stu.getAvg());

	}
}


