package fc.java.course2.model2;
// 인터페이스는 자바가 제공을 해주고 다양한 db 회사들이 구현체를 인터페이스를 이용해서 구현체를 만든다.(다형성)
public interface Connection {
     void getConnection(String url, String userName, String password);

}
