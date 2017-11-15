package pl.tok.beginer;

public class IntFunk_FunctionTR {
    @FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);
    }
    public static void main(String[] args) {
        Function<String, Integer> toInteger = (s) -> Integer. valueOf(s);
        Function<Integer, String> toString = (i) -> String. valueOf(i);
        //Function<String, String> fromStringToString = toInteger.andThen(toString);
        Integer i = toInteger.apply("69"); // 69
        String s1 = toString.apply(69); // 69
        //String s2 = fromStringToString.apply("69"); // 69

        System.out.println(i);
        System.out.println(s1);
    }





}
