package old;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	
    	long count=0,subCount=0,noOfFullInstance=0,incompleteStringLen=0;
    	String stringToProcess=s;
    	
    	if(s.length()>n) {
    		stringToProcess=s.substring(0, (int) (n));
    	}else if(s.length()<n) {
    		noOfFullInstance=(n/s.length());
    		incompleteStringLen=(n%s.length());
    	}
    	
    	for(int i=0;i<stringToProcess.length();i++) {
    		if(stringToProcess.charAt(i)=='a') {
    			count++;
    			if(incompleteStringLen!=0 && i<incompleteStringLen)
    				subCount++;
    		}
    	}
    	
    	if(noOfFullInstance!=0)
    		count=(count*noOfFullInstance)+subCount;
    	
    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);



        scanner.close();
    }
}
