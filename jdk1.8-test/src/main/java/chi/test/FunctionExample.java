package chi.test;

import java.util.function.*;

/**
 * Created by win10 on 2016/11/24.
 */
public class FunctionExample {
    public static void main(String[] args) {
        testUnaryOperator();
    }

    public static void testFunction(){
        Function<Integer,String> ob = f1 -> "Age:"+f1;
        System.out.println(ob.apply(20));
    }

    public static void testConsumer(){
        Consumer<Integer> ob = f1 -> System.out.print(f1);
        ob.accept(20);
    }

    public static void testUnaryOperator(){
        UnaryOperator<String> ob = f1 -> "Age:"+f1;
        System.out.println(ob.apply("chi"));
    }

    public static void testSupplier(){
        Supplier<Integer> ob = () -> {return 10;};
        System.out.println(ob.get());
    }

    public static void testBinaryOperator(){
        BinaryOperator<Integer> ob = (f1,f2) -> {return f1+f2;};
        System.out.println(ob.apply(1,2));
    }






    public static void doubleTest(){
        DoubleFunction<String> df = d -> String.valueOf(d*5.3);
        System.out.println(df.apply(43.7));
    }
}
