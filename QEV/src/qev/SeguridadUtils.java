package qev;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import com.sun.org.apache.xml.internal.security.utils.Base64;


public class SeguridadUtils {
	
	private static String STR_KEY = "56af65d2";

	public static String cifrar(String text) throws Exception {

		Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		SecretKeySpec key = new SecretKeySpec(STR_KEY.getBytes(), "DES");
		cipher.init(Cipher.ENCRYPT_MODE, key);

		return "{DES}" + Base64.encode(cipher.doFinal(text.getBytes()));

	}

	public static String descifrar(String text) throws Exception {

		Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		SecretKeySpec key = new SecretKeySpec(STR_KEY.getBytes(), "DES");
		cipher.init(Cipher.DECRYPT_MODE, key);

		return new String(cipher.doFinal(Base64.decode(text.substring("{DES}".length()))));

	}
}
