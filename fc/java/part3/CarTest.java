package fc.java.part3;

import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
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

        CarDTO carDT = new CarDTO(carSn, carName,carPrice,carOwner);
        carInfoPrint(carDT);


    }
    // 매개변수가 많아질수록 사용하기 힘들어진다. 따라서 바구니, 클래스, 객체, dto 를 만들어야 한다.
//    public static void carInfoPrint(int carSn, String carName, int price, String carOwner) {
//
//        System.out.println("carSn = " + carSn);
//        System.out.println("carName = " + carName);
//        System.out.println("price = " + price);
//        System.out.println("carOwner = " + carOwner);
//    }

    public static void carInfoPrint(CarDTO carDTO) {
        System.out.println("carSn = " + carDTO.carSn);
        System.out.println("carName = " + carDTO.carName);
        System.out.println("carPrice = " + carDTO.carPrice);
        System.out.println("carOwner = " + carDTO.carOwner);
    }

}
