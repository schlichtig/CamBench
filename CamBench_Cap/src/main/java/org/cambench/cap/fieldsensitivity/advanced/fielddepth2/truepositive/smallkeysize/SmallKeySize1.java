package main.java.org.cambench.cap.fieldsensitivity.advanced.fielddepth2.truepositive.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class SmallKeySize1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");

        SizeClass sizeClass = new SizeClass();
        sizeClass.selfObject = new SizeClass();
        sizeClass.selfObject.keySize1 = 1024;
        sizeClass.selfObject.keySize2 = 2048;

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(sizeClass.selfObject.keySize1);
        KeyPair keyPair = keyGen.generateKeyPair();

        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
    }

    public static class SizeClass{
        public SizeClass selfObject;
        public int keySize1;
        public int keySize2;
    }
}