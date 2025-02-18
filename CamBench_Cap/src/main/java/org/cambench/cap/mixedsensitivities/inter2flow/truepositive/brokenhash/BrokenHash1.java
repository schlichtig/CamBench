package main.java.org.cambench.cap.mixedsensitivities.inter2flow.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String algo = "MD5";
        String data = "some data here";
        method1(algo, data);
        algo = "SHA-256";
    }

    public static void method1(String algo, String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algo);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}