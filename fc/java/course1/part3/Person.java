package fc.java.course1.part3;

public class Person {
    public String name;
    public int age;
    public String phone;

    public Person() {
    }

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void play() {
        System.out.println("운동을 한다.");
    }

    public void eat() {
        System.out.println("음식을 먹다.");
    }
    public void walk() {
        System.out.println("걷다.");
    }
}
