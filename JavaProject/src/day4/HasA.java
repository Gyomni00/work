
//한 페이지에 여러개의 class를 만들 때 public은 하나만 가능

package day4;

class A {
	private int a;					// a를 선언

	public A() {

	}

	public void setA(int a) {
		this.a = a;					// 때문에 이 this는 class A로 귀결
	}

	public int getA() {
		return a;
	}
}


public class HasA {

	private String name;
	private A age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age.setA(age);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return this.age.getA();
	}

	
	// 생성자 함수

	public HasA() {
		name = "";
		age = new A();
	}

	public static void main(String[] args) {

		HasA has = new HasA();					// 이 선언을 통해서 위에 모든 것들이 유효성을 가지게 됨

		has.setName("superman");
		has.setAge(100000);

		System.out.println(has.getName());
		System.out.println(has.getAge());

	}

}