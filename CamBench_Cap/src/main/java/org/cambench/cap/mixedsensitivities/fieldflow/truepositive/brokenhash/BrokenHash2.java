package main.java.org.cambench.cap.mixedsensitivities.fieldflow.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass2 hashClass = new HashClass2();
        hashClass.hashAlgo1 = "SHA-1";
        hashClass.hashAlgo2 = "SHA-256";

        String data = "some data here";
        MessageDigest messageDigest = MessageDigest.getInstance(hashClass.hashAlgo1);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());

        hashClass.hashAlgo1 = "SHA-256";
    }

    public static class HashClass2{
        public String hashAlgo1;
        public String hashAlgo2;
    }
}