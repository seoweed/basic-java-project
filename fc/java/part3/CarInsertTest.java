package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("자동차 일련번호 : ");
        int carSn = scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차 이름 : ");
        String carName = scanner.nextLine();

        System.out.print("자동차 가격 : ");
        int carPrice = scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차 소유자 : ");
        String carOwner = scanner.nextLine();

        CarDTO carDT = new CarDTO(carSn, carName, carPrice, carOwner);

        CarDTO car = new CarDTO();


        CarDAO carDAO = new CarDAO();
        carDAO.carInsert(carDT);

        carDAO.carSelect(carDT);

        CarUtility carUtility = new CarUtility();
        carUtility.carInfo(carDT);

    }



}

