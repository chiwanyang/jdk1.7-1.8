package chi.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * Created by win10 on 2016/11/24.
 */
public class StreamParallTest {
    public static void main(String[] argv){
        testSerial();
        testPara();
    }

    public static void testSerial() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 1000000; i++) {
            double d = Math.random() * 1000;
            list.add(d + "");
        }
        long start = System.nanoTime();//获取系统开始排序的时间点
        int count = (int) list.stream().sequential().sorted().count();
        long end = System.nanoTime();//获取系统结束排序的时间点
        long ms = TimeUnit.NANOSECONDS.toMillis(end - start);//得到串行排序所用的时间
        System.out.println("Serial:" + ms + "ms");
    }

    public static void testPara(){
        List<String> list = new ArrayList<String>();
        for(int i=0;i<1000000;i++){
            double d = Math.random()*1000;
            list.add(d+"");
        }
        long start = System.nanoTime();//获取系统开始排序的时间点
        int count = (int)list.stream().parallel().sorted().count();
        long end = System.nanoTime();//获取系统结束排序的时间点
        long ms = TimeUnit.NANOSECONDS.toMillis(end-start);//得到并行排序所用的时间
        System.out.println("parallel:" + ms+"ms");
    }
}
