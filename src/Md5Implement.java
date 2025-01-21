import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Implement {
	public static String getMD5(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger biNum = new BigInteger(1, messageDigest);
			System.out.println(biNum);
			String hashText = biNum.toString(16);
			System.out.println(hashText);
			while (hashText.length() < 32) {
				hashText = "0" + hashText;
			}
			return hashText;
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String args[]) {
		String toBeInput = "MIG642@premkumarchourasia";
		System.out.println("Converted value :: " + getMD5(toBeInput));
		System.out.println(getMD5(toBeInput).length());
	}
}
