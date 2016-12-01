package chi.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by win10 on 2016/11/24.
 */
public class TestFunction {
    class Person {
        boolean sex;
        String name;
    }

    interface PersonInterface {
        public boolean test(Person person);
    }

    public class People {
        private List<Person> persons = new ArrayList<Person>();

        public List<Person> getMaleList(PersonInterface filter) {
            List<Person> res = new ArrayList<Person>();
            persons.forEach(
                    (Person person) ->
                    {
                        if (filter.test(person)) {//调用 PersonInterface 的方法
                            res.add(person);
                        }
                    }
            );
            return res;
        }
    }

    class People2{
        private List<Person> persons= new ArrayList<Person>();
        public List<Person> getMaleList(Predicate<Person> predicate) {
            List<Person> res = new ArrayList<Person>();
            persons.forEach(
                    person -> {
                        if (predicate.test(person)) {//调用 Predicate 的抽象方法 test
                            res.add(person);
                        }
                    });
            return res;
        }

        public void test(){
            People2 people2 = new People2();
            people2.getMaleList(person -> {return person.sex;});
        }
    }
}
