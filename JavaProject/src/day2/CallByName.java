
//  Instance method
//  -객체 생성 후 사용할 수 있는 매소드
//  Static method
//  -객체 유무와 상관 없이 사용할 수 있는 매소드
 
package day2;

public class CallByName {
   
   public static void main(String[] args) {
      
      CallByName.disp2(); //static은 new 선언을 안해도 바로 호출 가능 : 실행하기 위한 구문 
      
      CallByName cbn = new CallByName(); //객체를 생성하는 과정
     
      cbn.disp1(); //static이 아닌 void는 new 선언을 해야만 가능
      cbn.disp2(); //static은 new 선언을 해도 가능
      
      int num =100;
      
      num = cbn.disp3(num);  // call by value / 리턴 값 받으려면 '=' 을 써야 함. 
      System.out.println(num);
      
      String str = new String("Superman");  //얘는 객체라서 이걸 호출하려면 레퍼런스를 호출해야함(?)
      // System.out.println(str); 
      
      cbn.disp4(str);         //call by reference
      
   }
   
   public void disp4(String s) {
      System.out.println(s);
   }

   public int disp3(int num) {      //값을 주려면 void가 아니라 int 등 반환할 리턴 타입을 넣어야 함.
      System.out.println(num);
      num++;
      System.out.println(num);  //disp3는  call by value
      
      return num;         //지역함수에서 계산한 num 값을 main으로 반환하려면 return을 써야 함.
   }
   
   public void disp1() {      //callbyname}
      System.out.println("call by name1");
      
   }
   public static void disp2() {      //callbyname}
      System.out.println("call by name2");
   }   
   
}
