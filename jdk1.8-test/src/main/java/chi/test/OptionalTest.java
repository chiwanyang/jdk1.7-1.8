package chi.test;

import java.util.Optional;

/**
 * Created by win10 on 2016/11/27.
 */
public class OptionalTest {
    public static void main(String[] argv) {
        Optional<String> firstName = Optional.of("Tom");
        System.out.println("First Name is set? " + firstName.isPresent());
        System.out.println("First Name: " + firstName.orElseGet(() -> "[none]"));
        System.out.println(firstName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
        System.out.println();
    }

//    public static void main(String[] argv) {
//        Optional<String> firstName = Optional.of(null);
//        System.out.println("First Name is set? " + firstName.isPresent());
//        System.out.println("First Name: " + firstName.orElseGet(() -> "[none]"));
//        System.out.println(firstName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
//        System.out.println();
//    }

}
