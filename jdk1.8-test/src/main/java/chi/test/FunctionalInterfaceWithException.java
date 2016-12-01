package chi.test;

/**
 * Created by win10 on 2016/11/24.
 */
//必须捕获到函数式生命中抛出的异常
public class FunctionalInterfaceWithException {
    public static void main(String[] args) {
        int testInt =12;
        InterfaceWithException target = i -> {
//            testInt;
        };
        try {
            target.apply(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

@FunctionalInterface
interface InterfaceWithException {
    void apply(int i) throws Exception;

}

//public class FunctionalInterfaceWithException {
//    public static void main(String[] args) {
//        InterfaceWithException target = i -> {throw new Exception();};
//    }
//}
//@FunctionalInterface
//interface InterfaceWithException {
//    void apply(int i);
//}
