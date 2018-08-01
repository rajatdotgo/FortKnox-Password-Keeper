/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.pkg51.core;

import javax.crypto.*;
import javax.crypto.spec.*;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * This class will provide functions to generate key,Encrypt data, Decrypt Data
 *
 * @author SilverPanda
 */


public class Encryption 
{
    
    /**
     * This function will generate a key to be used in encryption
     * 
     * @param hashOfMaster
     * @param hashOfType
     * @return newHashByte
     */
     public  static byte[] generateKey(String hashOfMaster, String hashOfType)
    {
        
        String newHash = "";
        
        if(Utility.minLen(hashOfMaster, hashOfType))
        {
          for(int i = 0; i< hashOfMaster.length() ;i++)
          {
              if( i %2 == 0)
              {
              newHash  += hashOfMaster.charAt(i);
               }
              else
              {
                 newHash  += hashOfType.charAt(i);
              }
          }
        }
        
        else
        {
            for(int i = 0; i< hashOfType.length() ;i++)
          {
              if( i %2 == 0)
              {
              newHash  += hashOfMaster.charAt(i);
               }
              else
              {
                 newHash  += hashOfType.charAt(i);
              }
          }
            
        }
        
        //newHash = hashing.hashIt(newHash);
        
        
        byte[] newHashByteLong = newHash.getBytes(Charset.forName("UTF-8"));
        System.out.println(newHashByteLong.length);
        byte[] newHashByte = new byte[32];
        
        System.arraycopy(newHashByteLong, 0, newHashByte, 0, 32);
        
        return newHashByte;
                        
    } 
    
    
    /**
     * Given bytes of key and a string password 
     * this function will return a byte array of encrypted data
     * 
     * @param key
     * @param password
     * @return cipherText
     * @throws Exception 
     */
    public static byte[] encryptIt(byte[] key, String password) throws Exception
    {
       
        byte[] keyEncrypt = key;
        byte[] pass = password.getBytes(Charset.forName("UTF-8"));
        
        SecretKeySpec keyWord = new SecretKeySpec(keyEncrypt, "AES");
         
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding", "BC");
        
        cipher.init(Cipher.ENCRYPT_MODE, keyWord);
        
        byte[] cipherText = new byte[cipher.getOutputSize(pass.length)];
        
        int ctLength = cipher.update(pass, 0, pass.length, cipherText, 0);
        ctLength += cipher.doFinal(cipherText, ctLength);
        
        return cipherText;
    }
    
    
    /**
     * GIven byte array of key and byte array of cipher text
     * this function will return plain text after decrypting it.
     * 
     * @param key
     * @param cipherText
     * @return
     * @throws Exception 
     */
    public static String decryptIt(byte[] key, byte[] cipherText)throws Exception
    {
        
        int ctLength = cipherText.length;
        byte[] keyDecrypt = key;
        
        SecretKeySpec keyWord = new SecretKeySpec(keyDecrypt, "AES");
         
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding", "BC");
        
        cipher.init(Cipher.DECRYPT_MODE, keyWord);
        
        byte[] plain = new byte[cipher.getOutputSize(ctLength)];
        
        int ptLength = cipher.update(cipherText, 0, ctLength, plain, 0);
        ptLength += cipher.doFinal(plain, ptLength);
        
        byte[] finalplainText = new byte[ptLength];
        
        System.arraycopy(plain, 0, finalplainText, 0, ptLength);
        
        String plainText = new String(finalplainText, Charset.forName("UTF-8"));
        
        return plainText;
    }
    
    
    
}
