package fc.java.course2.model2;

public class OracleDriver implements Connection {
    @Override
    public void getConnection(String url, String userName, String password) {
        System.out.println("oracle db에 연결되었습니다");
    }
}
