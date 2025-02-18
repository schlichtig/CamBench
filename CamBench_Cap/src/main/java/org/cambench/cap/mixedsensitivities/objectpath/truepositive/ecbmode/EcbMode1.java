package main.java.org.cambench.cap.mixedsensitivities.objectpath.truepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ConfigClass algoConfig1 = new ConfigClass("AES/ECB/PKCS5Padding");
        ConfigClass algoConfig2 = new ConfigClass("AES/CBC/PKCS5Padding");
        Cipher cipher;

        int condition = 1;

        if(condition == 1){
            cipher = Cipher.getInstance(algoConfig1.algorithmConfig);
        } else {
            cipher = Cipher.getInstance(algoConfig2.algorithmConfig);
        }

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static class ConfigClass {
        String algorithmConfig;

        public ConfigClass(String algoConfig){
            algorithmConfig = algoConfig;
        }
    }
}