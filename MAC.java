import java.util.*;

public class MAC {
	private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String SUBSTITUTION = "QWERTYUIOPASDFGHJKLZXCVBNM"; // Example key

	public static String encrypt(String plaintext) {
		//plaintext = plaintext.toUpperCase();
		String ciphertext = "";
		for (char ch : plaintext.toCharArray()) {
			int index = ALPHABET.indexOf(ch);
			ciphertext += (index != -1 ? SUBSTITUTION.charAt(index) : ch);
		}
		return ciphertext.toString();
	}
	public static String decrypt(String ciphertext) {
		String plaintext = "";
		for (char ch : ciphertext.toCharArray()) {
			int index = SUBSTITUTION.indexOf(ch);
			plaintext += (index != -1 ? ALPHABET.charAt(index) : ch);
		}
		return plaintext.toString();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a message: ");
		String message = scanner.nextLine();
		String encrypted = encrypt(message);
		System.out.println("Encrypted: " + encrypted);
		String decrypted = decrypt(encrypted);
		System.out.println("Decrypted: " + decrypted);
	}
}