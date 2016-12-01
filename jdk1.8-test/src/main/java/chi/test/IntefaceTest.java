package chi.test;

/**
 * Created by win10 on 2016/11/24.
 */
public class IntefaceTest {


    public static void main(String[] argv) {
        Inter target = () -> {
            System.out.println("testInner");
        };
        target.toString();
        System.out.println("11");
    }

}


@FunctionalInterface
interface Inter {

    public abstract void run();

    //    public abstract void run2();
//    String toString();
//    Object clone();
//11chi.test.IntefaceTest$$Lambda$1/295530567@3b07d329
}
