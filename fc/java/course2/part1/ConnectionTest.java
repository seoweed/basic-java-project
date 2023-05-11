package fc.java.course2.part1;

import fc.java.course2.model2.Connection;
import fc.java.course2.model2.MSSQLDriver;
import fc.java.course2.model2.MySQLDriver;
import fc.java.course2.model2.OracleDriver;

// import java.sql.* (실제 자바가 제공하는 인터페이스들 jdbc(자바 데이터베이스 프로그래밍))

public class ConnectionTest {
    public static void main(String[] args) {
        Connection oracleDriver = new OracleDriver();
        oracleDriver.getConnection("http", "weed", "123456");
        Connection mySQLDriver = new MySQLDriver();
        mySQLDriver.getConnection("good", "ward", "7894560");
        Connection mssqlDriver = new MSSQLDriver();
        mssqlDriver.getConnection("ssh", "jamise", "456789");
    }
}
