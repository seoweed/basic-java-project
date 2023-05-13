package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Member;

public class GsonFromJson {
    public static void main(String[] args) {
        String a = "{\"name\":\"weed\",\"age\":40,\"number\":\"01012346578\"}";
        System.out.println("a = " + a);
        Gson gson = new Gson();
        Member member = gson.fromJson(a, Member.class);
        System.out.println("member = " + member);
        System.out.println(member.getName());
    }
}

