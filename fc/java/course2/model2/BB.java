package fc.java.course2.model2;

// BB는 노출을 시키지 않아도 CC 인터페이스로 동작을 시킬 수 있다
public class BB implements CC {
    @Override
    public void x() {
        System.out.println("x 동작이 실행이 된다");
    }

    @Override
    public void y() {
        System.out.println("y 동작이 실행이 된다");
    }

    @Override
    public void z() {
        System.out.println("z 동작이 실행이 된다");
    }
}
