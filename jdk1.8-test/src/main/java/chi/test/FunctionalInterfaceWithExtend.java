package chi.test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by win10 on 2016/11/24.
 */
public class FunctionalInterfaceWithExtend {
    interface X { int m(Iterable<String> arg); }
    interface Y { int m(Iterable<String> arg); }
    interface Z extends X, Y {}

    interface X1 { Set m(Set<String> arg); }
    interface Y1 { Set<String> m(Set arg); }
    interface Z1 extends X1, Y1 {}

    interface X2 { int m(Set<String> arg); }
    interface Y2 { int m(Set<Integer> arg); }
//    interface Z2 extends X2, Y2 {}

    interface X3 { long m(); }
    interface Y3 { int m(); }
//    interface Z3 extends X3, Y3 {}


    public static void main(String[] argv){
//        Z2 i = (Iterable<String> set)->{
//            return 1;
//        };
//        System.out.println(i.m(new HashSet<String>()));
    }
}
