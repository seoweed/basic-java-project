package fc.java.course1.model;

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
