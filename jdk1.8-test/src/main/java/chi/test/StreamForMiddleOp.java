package chi.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by win10 on 2016/11/24.
 */
public class StreamForMiddleOp {
    public static void main(String[] argv){
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 1000000; i++) {
            double d = Math.random() * 1000;
            list.add(d + "");
        }
        Stream stream = list.stream().filter(temp->temp.length()==100)
                .sorted((t1,t2)->t1.compareTo(t2))
                .map(temp->Integer.valueOf(temp)).distinct();

        stream.forEach(temp->System.out.println(temp));
        stream.collect(Collectors.toList());
        stream.collect(Collectors.toMap(Function.identity(),temp->temp.toString(),(e1,e2)->e1));
        stream.anyMatch((temp)->{return (Integer)temp>10;});
    }



}
