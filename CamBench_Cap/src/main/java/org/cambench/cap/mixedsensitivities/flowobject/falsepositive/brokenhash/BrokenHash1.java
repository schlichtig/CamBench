package main.java.org.cambench.cap.mixedsensitivities.flowobject.falsepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass hashObject1 = new HashClass();
        HashClass hashObject2 = new HashClass();
        hashObject1.algorithm = "MD5";
        hashObject2.algorithm = "MD5";
        String data = "some data here";
        hashObject1.algorithm = "SHA-256";

        MessageDigest messageDigest = MessageDigest.getInstance(hashObject1.algorithm);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static class HashClass {
        String algorithm;
    }
}