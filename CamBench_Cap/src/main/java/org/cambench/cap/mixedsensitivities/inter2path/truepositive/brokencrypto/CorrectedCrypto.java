package main.java.org.cambench.cap.mixedsensitivities.inter2path.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CorrectedCrypto {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        method1("AES","AES/CBC/PKCS5Padding");
    }

    public static void method1(String algoName, String algoConfig) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(algoConfig);
        KeyGenerator keyGen = KeyGenerator.getInstance(algoName);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}