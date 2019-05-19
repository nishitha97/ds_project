package com.distributedsystems.assignment2.configuration;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Service;

import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

@Service
public class AuthenticationConfig {
    private static final String UNICODE_FORMAT = "UTF8";
    public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";//the encryption scheme used
    private KeySpec ks;
    private SecretKeyFactory skf;
    private Cipher cipher;
    byte[] arrayBytes;
    private String myEncryptionKey;
    private String myEncryptionScheme;
    SecretKey key;



    public AuthenticationConfig() throws Exception {
        myEncryptionKey = "theEncryptionKeytheEncryptionKey";//encrytion key used for encryption
        myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;//setting the encryption scheme
        arrayBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);//convert encytion key to byte array
        ks = new DESedeKeySpec(arrayBytes);//generate keyspec using the encryption key
        skf = SecretKeyFactory.getInstance(myEncryptionScheme);//get instance of Secret key factory using the encryption key
        cipher = Cipher.getInstance(myEncryptionScheme);//get cipher instance using the encryption key
        key = skf.generateSecret(ks);//generate secret key
    }

    //encryption happens here
    public String encrypt(String unencryptedString) {
        String encryptedString = null;
        try {
            cipher.init(Cipher.ENCRYPT_MODE, key);//initialize encryption
            byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);//get bytes of the unencrypted string
            byte[] encryptedText = cipher.doFinal(plainText);//convert text to encrypted text
            encryptedString = new String(Base64.encodeBase64(encryptedText));//convert encrypted text in byte form
                                                                              //to String
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encryptedString;
    }

}
