
//StudentScoreHasA 파일의 답안 문수팀장님꺼인데 내 name이랑 subject에서 만든 데이터 명이 일치하지 않아서 코드가 돌아가진 않음
// 성적 처리 클래스
// 이름은 Name 클래스
// 과목은 Subject 클래스
// 총점, 평군

package day4;

public class StudentScoreHasA2_A {

	// 총점, 평군
		private Name name;
		private Subject kor;
		private Subject mat;
		private Subject eng;
		
		public HasACalc() {
			name = new Name();
			kor =new Subject();
			mat = new Subject();
			eng = new Subject();		
		}
		
		public void setName(String name) {
			this.name.setName(name);
		}
		
		public void setKor(int kor) {
			this.kor.setSubject(kor);
		}
		
		public void setMat(int mat) {
			this.mat.setSubject(mat);
		}
		
		public void setEng(int eng) {
			this.eng.setSubject(eng);
		}
		
		
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
			return getKor() + getMat() + getEng();
		}
		
		public double getAvg() {
			return (double)getTotal() / 3;
		}
		
		
		public static void main (String[] args) {
			
			HasACalc stu = new HasACalc() ;
			stu.setName("Superman");
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