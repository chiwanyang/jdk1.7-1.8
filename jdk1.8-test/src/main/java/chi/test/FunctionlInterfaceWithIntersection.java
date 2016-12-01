package chi.test;

/**
 * Created by win10 on 2016/11/24.
 */
public class FunctionlInterfaceWithIntersection {
    public static void main(String[] args) {
        Object o = (I & J) () -> {
        };
    }

    interface I {
        void foo();
    }

    interface J {
        void foo();
//        void bar();
    }
}
