

package day4;

// class1
class AA{
	int aa;
	
	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa= aa;
	}
}

//class2
class BB{
	int aa;
	
	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa= aa;
	}
}

//class3
class CC{
	int aa;
	
	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa= aa;
	}
}

//class4
public class HasA2 {
	
	 private AA aa;
	 private BB bb;
	 private CC cc;
	 
	 void setAA(AA aa) {
		 this.aa=aa;	// 객체 주입
		 bb = new BB();
		 cc = new CC();
	 }
	 public static void main(String[] args) {
		 
		 HasA2 hasa2 = new HasA2();
		 AA a = new AA();
		 
		 hasa2.setAA(a);
		 //hasa2.aa = a;							//필드를 이렇게 직접적으로 쓰면 안좋음
	
	 }
}




