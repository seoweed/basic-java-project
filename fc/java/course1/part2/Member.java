package fc.java.course1.part2;

public class Member {
    private String name;
    private int age;
    private String number;
    private String email;
    private String address;
    private float weight;

    public Member(String name, int age, String number, String email, String address, float weight) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.email = email;
        this.address = address;
        this.weight = weight;
    }

    public Member() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
