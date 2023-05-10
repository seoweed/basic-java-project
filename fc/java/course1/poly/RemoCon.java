package fc.java.course1.poly;
// 추상클래스 = 추상메서드 + 구현메서드
public interface RemoCon {
    // 부모가 인터페이스면 자식의 내부 동작방식을 전혀 몰라도 동작시킬 수가 있다.
    // 인터페이스는 추상메서드만 들어가고 구현메서드는 들어갈 수 없다.
    // 인터페이스는 구현 객체가 없기 때문에 객체 생성을 할 수 없다.
    // 부모의 역할만 할 수있다. 인터페이스는 100% 다형성을 보장한다.

    // 인터페이스에서 사용하는 final static 상수
    public int MAXCH = 99;
    public int MINCH = 1;
    // 위의 상수와 아래의 상수는 같음(인터페이스에서 상수를 선언할때는 final static 생략 가능)
//    public final static int MAXCH = 99;
//    public final static int MINCH = 1;


    // chUp, chDown, volUp, volDown
    public  void chUp();

    public  void chDown();
    public  void volUp();

    public  void volDown();

    public void internet();



}
