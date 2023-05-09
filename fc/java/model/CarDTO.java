package fc.java.model;

import java.security.PublicKey;

public class CarDTO {
    public int carSn;
    public String carName;
    public int carPrice;
    public String carOwner;

    public CarDTO(int carSn, String carName, int carPrice, String carOwner) {
        this.carSn = carSn;
        this.carName = carName;
        this.carPrice = carPrice;
        this.carOwner = carOwner;
    }

    public CarDTO() {
    }
}
