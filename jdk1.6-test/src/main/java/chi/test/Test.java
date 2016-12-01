package chi.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by win10 on 2016/11/21.
 */
public class Test {

//    public static void testSwitch(){
//        String s = "test";
//        switch (s) {
//            case "test" :
//                System.out.println("test");
//            case "test1" :
//                System.out.println("test1");
//                break ;
//            default :
//                System.out.println("break");
//                break ;
//        }
//    }

//    public static void genericInfer(){
//        List<String> tempList = new ArrayList<>();
//    }

//    public static void intShow(){
//        int[] phases = {
//                0b00110001,
//                0b01100010,
//                0b11000100,
//                0b10001001,
//                0b00010011,
//                0b00100110,
//                0b01001100,
//                0b10011000
//        };
//        System.out.println(phases[0]);
//
//    }

//    public static String recycle(String path)throws IOException {
//            BufferedReader br = new BufferedReader(new FileReader(path));
//            try {
//                return br.readLine();
//            } finally {
//                if (br != null)
//                    br.close();
//            }
//        }
//
//    }

//    public static String recycle2(String path) throws IOException {
//        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//            return br.readLine();
//        }
//    }

    public static void catchTest() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(""));
            Connection con = null;
            Statement stmt = con.createStatement();
        } catch (IOException e) {
            //捕获多个异常，e就是final类型的
            e.printStackTrace();
        } catch (SQLException e) {
            //捕获多个异常，e就是final类型的
            e.printStackTrace();
        }
    }
    static class FirstException extends Exception {
    }

    static class SecondException extends Exception {
    }

    public void rethrowException(String exceptionName)
            throws FirstException, SecondException {
        try {
            // ...
        } catch (Exception e) {
            throw e;
        }
    }

}
