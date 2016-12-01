package chi.test;

/**
 * Created by win10 on 2016/11/24.
 */
@FunctionalInterface
interface InterfaceWithDefaultMethod {
    void apply(Object obj);

    default void say(String name) {
        System.out.println("hello " + name);
    }
}
class FunctionalInterfaceWithDefaultMethod {
    public static void main(String[] args) {
        InterfaceWithDefaultMethod i = (o) -> {};
        i.apply(null);
        i.say("default method");
    }
}
