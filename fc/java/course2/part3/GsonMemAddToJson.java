package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Address;
import fc.java.course2.model3.Person;

public class GsonMemAddToJson {
    public static void main(String[] args) {
        Address address = new Address("서울", "대한민국");
        Person person = new Person("weed", 40, "aasdf@naver.com", address);

        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("json = " + json);
    }
}
