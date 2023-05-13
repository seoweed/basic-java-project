package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Member;

public class GsonToJson {
    public static void main(String[] args) {
        Member member = new Member("weed", 40, "01012346578");
        Gson gson = new Gson();
        String a = gson.toJson(member);
        System.out.println("a = " + a);

        System.out.println(gson.fromJson(a, Member.class));
    //        System.out.println(gson.fromJson());
        Gson gson1 = new Gson();
        System.out.println(gson1.toJson(member));

    }
}
