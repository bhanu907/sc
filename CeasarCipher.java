import java.util.*;

public class CeasarCipher {
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	public static String encrypt(String str, int shiftKey) {
		str = str.toLowerCase();
		String encryptStr = "";
		for (int i = 0; i < str.length(); i++) {
			int pos = ALPHABET.indexOf(str.charAt(i));
			int encryptPos = (shiftKey + pos) % 26;
			char encryptChar = ALPHABET.charAt(encryptPos);
			encryptStr += encryptChar;
		}
		return encryptStr;
	}

	public static String decrypt(String str, int shiftKey) {
		str = str.toLowerCase();
		String decryptStr = "";
		for (int i = 0; i < str.length(); i++) {
			int pos = ALPHABET.indexOf(str.charAt(i));
			int decryptPos = (pos - shiftKey) % 26;
			if (decryptPos < 0)
				decryptPos = ALPHABET.length() + decryptPos;
			char decryptChar = ALPHABET.charAt(decryptPos);
			decryptStr += decryptChar;
		}
		return decryptStr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string to be encrypted: ");
		String str = sc.next();
		System.out.print("Enter key value: ");
		int key = sc.nextInt();
		String estr = encrypt(str, key);
		String dstr = decrypt(estr, key);
		System.out.println("Encrypted string: " + estr);
		System.out.println("Decrypted string: " + dstr);
	}
}
