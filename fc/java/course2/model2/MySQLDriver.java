package fc.java.course2.model2;

public class MySQLDriver implements Connection {

    @Override
    public void getConnection(String url, String userName, String password) {
        System.out.println("MySQL db에 연결되었습니다");
    }
}
