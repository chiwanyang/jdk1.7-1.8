package chi.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by win10 on 2016/11/24.
 */
public class LambdaTest {

    public static void test1() {
        Button button = new Button();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("Helllo Lambda in actionPerformed");
            }
        });
        //下面是使用 Lambda 表达式后：
        button.addActionListener(
                (e) ->
                        System.out.print("Helllo Lambda in actionPerformed"));
    }

    public static void test2(){

    }
}
