package chi.test;

import java.util.Arrays;

/**
 * Created by win10 on 2016/11/24.
 */
public class InterfaceTest {
    interface InterfaceWithDefaultMethod {
        void apply(Object obj);

//        default void say(String name) {
//            System.out.println("hello " + name);
//        }

//        static int sum(int[] array) {
//            return 2;
//        }
    }
}
