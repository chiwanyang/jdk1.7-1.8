package chi.test;

import java.util.Arrays;

/**
 * Created by win10 on 2016/11/24.
 */
public class StaticMethodFunctionalInterface {
    public static void main(String[] args) {
        int sum = FunctionalInterfaceWithStaticMethod.sum(new int[]{1,2,3,4,5});

        FunctionalInterfaceWithStaticMethod f = () -> {};
    }
}

@FunctionalInterface
interface FunctionalInterfaceWithStaticMethod {
    static int sum(int[] array) {
        return Arrays.stream(array).reduce((a, b) -> a+b).getAsInt();
    }

    void apply();
}
