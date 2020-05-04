import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static BigInteger sum(BigInteger a, BigInteger b) {
		return a.add(b);
	}
	public static void main(String[] args) throws IOException {
		System.out.println("Enter r");
		BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
		BigInteger r = new BigInteger(reader.readLine());
		if(r.compareTo(BigInteger.ZERO) < 0) {
			System.out.println("Entered number not natural");
			return;
		}
		System.out.println("Enter m");
		BigInteger m = new BigInteger(reader.readLine());
		if(m.compareTo(BigInteger.ZERO) < 0) {
			System.out.println("Entered number not natural");
			return;
		}
		if(m.compareTo(r) >= 0) {
			System.out.println("Sum result="+sum(r, m).toString());
		}
	}
}
