package fc.java.model;

public class CarDAO {
    //create
    public void carInsert(CarDTO car) {
        //db연결 ,insert sql
        System.out.println("car정보가 DB에 저장이 되었습니다.");
    }

    public void carSelect(CarDTO car) {

        //db출력, select sql
        System.out.println("car정보가 DB에서 출력되었습니다.");
    }
}
