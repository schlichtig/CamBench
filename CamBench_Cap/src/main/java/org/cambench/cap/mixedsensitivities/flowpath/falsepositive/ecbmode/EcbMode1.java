package main.java.org.cambench.cap.mixedsensitivities.flowpath.falsepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher;
        String algorithm = "AES/ECB/PKCS5Padding";
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        int condition = 1;

        if(condition != 1){
            algorithm = "AES/ECB/PKCS5Padding";
        } else {
            algorithm = "AES/CBC/PKCS5Padding";
        }

        cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}