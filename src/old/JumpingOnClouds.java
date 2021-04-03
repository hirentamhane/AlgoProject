package old;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnClouds {

	static int jumpingOnClouds(int[] c) {

		int i = 0, jump = 0;

		if (c.length == 1 || c.length == 2)
			return 1;

		while (i < c.length) {// 7
			
			// Our goal was that i should be legal that is i<c.length-1 so we should have included that instead of below
			// if (i + 2 < c.length && c[i + 2] == 0) 
			if (c[i + 2] == 0) {
				i = i + 2;
			} else {
				i++;
			}

			jump++;

			
			
			if (i == c.length - 2) {// 5
				jump++;
				break;
			}

			if (i == c.length - 1)// 6
				break;
		}

		return jump;
	}

	static int jumpingOnClouds2(int[] c) {

		int count = 0;
		int i = 0;
		while (i < c.length - 1) {
			if (i + 2 < c.length && c[i + 2] != 1) {
				count++;
				i = i + 2;
			} else {
				count++;
				i++;
			}
		}
		return count;

	}

	static int jumpingOnClouds3(int[] c) {
		int jumps = 0;
		for (int i = 0; i < c.length - 1; i++) {
			jumps++;
			if (i + 2 < c.length && c[i + 2] == 0) {
				i++;
			}
		}
		return jumps;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = jumpingOnClouds(c);

		scanner.close();
	}
}
