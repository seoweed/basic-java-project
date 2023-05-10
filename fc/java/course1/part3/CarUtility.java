package fc.java.course1.part3;

import fc.java.course1.model.CarDTO;

public class CarUtility {
    public void carInfo(CarDTO ca) {
        System.out.println(ca.carSn);
        System.out.println(ca.carName);
        System.out.println(ca.carPrice);
        System.out.println(ca.carOwner);
    }
}
