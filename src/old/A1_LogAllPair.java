package old;

public class A1_LogAllPair {

	public static void main(String args[]) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		LogAllPair(array1);
	}

	private static void LogAllPair(int[] array1) {
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1.length;j++) {
				System.out.println(array1[i]+" "+array1[j]);
			}
		}
	}
}
