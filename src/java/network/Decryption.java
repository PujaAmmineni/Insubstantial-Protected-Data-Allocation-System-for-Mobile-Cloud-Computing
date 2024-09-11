/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

/**
 *
 * @author java3
 */
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;

import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;



public class Decryption
{

public String decrypt(String txt,String skey)
{
     String decryptedtext = null;
	try
	{            
            //converting string to secretkey
            byte[] bs=Base64.decode(skey);
            SecretKey sec=new SecretKeySpec(bs, "AES");
            System.out.println("converted string to seretkey:"+sec);
         
        System.out.println("secret key:"+sec);
     
        Cipher aesCipher = Cipher.getInstance("AES");//getting AES instance
	aesCipher.init(Cipher.ENCRYPT_MODE,sec);//initiating ciper encryption using secretkey
        
         byte[] byteCipherText =new BASE64Decoder().decodeBuffer(txt); //encrypting data 
	
          //  System.out.println("ciper text:"+byteCipherText);
        aesCipher.init(Cipher.DECRYPT_MODE,sec,aesCipher.getParameters());//initiating ciper decryption
	         
       byte[] byteDecryptedText = aesCipher.doFinal(byteCipherText);
	decryptedtext = new String(byteDecryptedText);
        
         System.out.println("Decrypted Text:"+decryptedtext);
        }
        
       
	catch(InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e)
	{
	           System.out.println(e);	
	}
    return decryptedtext;
}
}

