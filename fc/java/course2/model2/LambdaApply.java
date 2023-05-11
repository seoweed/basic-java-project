package fc.java.course2.model2;

public class LambdaApply {
    public static void main(String[] args) {
        StringOperation operation = (s) -> s.toUpperCase();
        StringOperation operation1 = s -> s.toLowerCase();



        System.out.println(operation.apply("weed"));
        System.out.println(operation1.apply("HelloWorld"));

        String input = "Lambda Expressions";
        System.out.println(processString(input, operation));
        System.out.println(processString(input, operation1));
    }
    public static String processString(String input, StringOperation operation) {
        return operation.apply(input);
    }
}
