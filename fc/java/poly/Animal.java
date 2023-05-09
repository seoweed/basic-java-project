package fc.java.poly;

// 추상클래스(불완전한 클래스)
// 추상클래스는 단독으로 객체 생성이 안된다.
// 추상클래스는 하위클래스가 필요하다
// 부모에 문제가 있어서 자식이 도와줘야한다.
public abstract class Animal {
//    public void eat() {
//        // 이 줄을 없애고 그냥 사용하면 안될까?
//        // 어차피 재정의(override)를 하면 ?는 나오지 않는데
    // 그래서 나온것이 추상 메서드 abstract
//        // System.out.println("?");
//    }
// 추상메서드(불완전한 메서드): 메서드의 구현부가 없음 abstract 이거 붙이면 됨
    // 추상메서드를 가지고있는 클래스는 추상 클래스가 된다.
    //abstract 이거 붙혀주면 됨
    public abstract void eat();

    // 추상클래스 안에 구현된 메서드를 넣을수 있다
    public void move() {
        System.out.println("무리를 지어 이동한다");
    }
}
