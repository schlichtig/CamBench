package main.java.org.cambench.cap.contextsensitivity.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CorrectedHash {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String algo1 = Identity("SHA-256");

        String data = "some data here";
        MessageDigest messageDigest = MessageDigest.getInstance(algo1);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static String Identity(String s){
        return s;
    }
}