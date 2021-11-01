package Question1_120;





//https://vceguide.com/which-statement-is-true-112/ 문재
final class IceCream {
public void prepare() {}
}
class Cake {  
public final void bake(int min, int temp) {}  //여기서 final이 선언 되어서
public void mix() {}
}
class Shop {    
private Cake c = new Cake ();
private final double discount = 0.25;
public void makeReady () { c.bake(10, 120); }
}

class Bread extends Cake {      //Cake를 상속하지 않으면 오버라이딩해서 사용할수있다
public void bake(int minutes, int temperature) {}   // Cake를 상속하는 Bread는 bake()를 사용할수 없다.
													//사용할려면 Cake클래스의 bake()의 final지워야한다.

//이건 답 //D. A compilation error occurs in Bread
//Cake클래스에 bake메서드는 final이 선언되어서 사용이 불가능합니다.



///////////////////////////////////////////////////////////////////////
//https://www.examtopics.com/exams/oracle/1z0-809/view/4/    47번문제

final class Cream {   // final이 선언됨
public void prepare() {}
}
class Cake extends Cream {    // final이 선언된 클래스는 상속할 수 없음   //Cake 컴파일 에러
public void bake(int min, int temp) {}  
public void mix() {}
}
class Shop {    
private Cake c = new Cake ();
private final double discount = 0.25;
public void makeReady () { c.bake(10, 120); }
}

class Bread extends Cake {      
public void bake(int minutes, int temperature) {}   

// 답 : B. A compilation error occurs in Cake.





