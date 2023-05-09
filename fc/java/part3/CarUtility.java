package fc.java.part3;

import fc.java.model.CarDTO;

public class CarUtility {
    public void carInfo(CarDTO ca) {
        System.out.println(ca.carSn);
        System.out.println(ca.carName);
        System.out.println(ca.carPrice);
        System.out.println(ca.carOwner);
    }
}
