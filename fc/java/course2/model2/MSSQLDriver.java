package fc.java.course2.model2;

public class MSSQLDriver implements Connection {
    @Override
    public void getConnection(String url, String userName, String password) {
        System.out.println("MSSQL db에 연결되었습니다");
    }
}
