package chi.test;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 * Created by win10 on 2016/11/21.
 */
public class Test {

    public static void main(String[] argv) {
        intShow();
    }

    public static void testSwitch() {
        String s = "test";
        switch (s) {
            case "test":
                System.out.println("test");
            case "test1":
                System.out.println("test1");
                break;
            default:
                System.out.println("break");
                break;
        }
    }

    public static void intShow() {
        // An 8-bit 'byte' value:
        byte aByte = (byte) 0b00100001;

        // A 16-bit 'short' value:
        short aShort = (short) 0b1010000101000101;

        // Some 32-bit 'int' values:
        int anInt1 = 0b10100001010001011010000101000101;
        int anInt2 = 0b101;
        int anInt3 = 0B101; // The B can be upper or lower case.

        // A 64-bit 'long' value. Note the "L" suffix:
        long aLong = 0b1010000101000101101000010100010110100001010001011010000101000101L;

        float floatTest = 123123123123123.12313f;
        // 来个简单版本的
        byte b = 0b10;
        short s = 0B100;
        int i = 0b1000;
        long l = 0B10000;

        System.out.println(b + "|" + s + "|" + i + "|" + l);
        // ->输出将会是2|4|8|16

    }

    public static String recycle(String path) throws IOException {
        String zipFileName = "test";
        try (
                BufferedReader br = new BufferedReader(new FileReader(path));
                java.util.zip.ZipFile zf = new java.util.zip.ZipFile(zipFileName);

//                java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(outputFilePath, charset)
        ) {
            int i = 2;
            int a = i / 0;
            return br.readLine();
        }
    }

    public static void catchTest() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(""));
            Connection con = null;
            Statement stmt = con.createStatement();
        } catch (IOException | SQLException e) {
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

    public  static void booleanTest(){
    }
}
