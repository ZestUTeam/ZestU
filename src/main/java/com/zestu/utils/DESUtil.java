package com.zestu.utils;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class DESUtil {
	private final static String password = "echoilvy";

	public static void main(String[] args) {
		// 明文
		String message = "xxoobbbb";
		System.out.println("DES加密后=======" + Encode(message));
		System.out.println("DES解密后=======" + Decode(Encode(message)));
	}

	/**
	 * 16进制字符串转换成byte[]
	 */
	public static byte[] hexToBytes(String hexString) {

		if (hexString == null || hexString.equals("")) {
			return null;
		}
		int length = hexString.length() / 2;
		char[] hexChars = hexString.toCharArray();
		byte[] bytes = new byte[length];
		String hexDigits = "0123456789abcdef";
		for (int i = 0; i < length; i++) {
			int pos = i * 2; // 两个字符对应一个byte
			int h = hexDigits.indexOf(hexChars[pos]) << 4; // 注1
			int l = hexDigits.indexOf(hexChars[pos + 1]); // 注2
			if (h == -1 || l == -1) { // 非16进制字符
				return null;
			}
			bytes[i] = (byte) (h | l);
		}
		return bytes;
	}

	/**
	 * 将bytes数组转换成16进制输出
	 * 
	 * @param bytes
	 * @return
	 */
	public static String converByteToString(byte[] bytes) {

		String result = "";
		for (int i = 0; i < bytes.length; i++) {
			int temp = bytes[i] & 0xff;
			String tempHex = Integer.toHexString(temp);
			if (tempHex.length() < 2) {
				result += "0" + tempHex;
			} else {
				result += tempHex;
			}
		}
		return result;
	}

	/**
	 * des 加密操作
	 * 
	 * @param message
	 * @param password
	 * @return
	 */
	public static String Encode(String message) {

		try {
			SecureRandom random = new SecureRandom();
			DESKeySpec desKeySpec = new DESKeySpec(password.getBytes());
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, random);
			byte[] result = cipher.doFinal(message.getBytes());
			// result;
			return converByteToString(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * des解密操作
	 * 
	 * @param message
	 * @param password
	 * @return
	 */
	public static String Decode(String decode) {
		byte[] message = hexToBytes(decode);
		try {
			SecureRandom random = new SecureRandom();
			DESKeySpec desKeySpec = new DESKeySpec(password.getBytes());
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.DECRYPT_MODE, secretKey, random);
			byte[] result = cipher.doFinal(message);
			// result;
			return new String(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
