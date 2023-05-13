package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Person;

public class GsonMemAddFromJson {
    public static void main(String[] args) {
        String s = "{\"name\":\"weed\",\"age\":40,\"email\":\"aasdf@naver.com\",\"address\":{\"city\":\"서울\",\"country\":\"대한민국\"}}";

        Gson gson = new Gson();
        // JSON -> Person
        Person person = gson.fromJson(s, Person.class);
        System.out.println("person = " + person);
    }
}
