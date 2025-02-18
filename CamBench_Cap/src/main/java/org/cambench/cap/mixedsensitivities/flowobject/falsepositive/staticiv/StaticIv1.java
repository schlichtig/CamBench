package main.java.org.cambench.cap.mixedsensitivities.flowobject.falsepositive.staticiv;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class StaticIv1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = new SecureRandom();

        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);

        IvClass ivObject1 = new IvClass();
        IvClass ivObject2 = new IvClass();
        ivObject1.ivBytes = "abcdefghijklmnop".getBytes();
        ivObject2.ivBytes = "abcdefghijklmnop".getBytes();
        ivObject1.ivBytes = randomBytes;

        IvParameterSpec iv = new IvParameterSpec(ivObject1.ivBytes);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }

    public static class IvClass {
        byte[] ivBytes;
    }
}