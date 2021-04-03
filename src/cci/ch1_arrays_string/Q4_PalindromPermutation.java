package cci.ch1_arrays_string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class Q4_PalindromPermutation {

    public static void main(String args[]){
        System.out.println( new Q4_PalindromPermutation().isPalindromePermutation("Tact Cyoay  ii"));
    }

    boolean isPalindromePermutation(String str){

        str = str.toLowerCase(Locale.ROOT);

        if(str.equals(null) || str.length()==0)
            return false;

        Integer[] charCount = new Integer[128];
        Arrays.fill(charCount,0);
        int oddCharCount=0;

        for (char c : str.toCharArray()){
            System.out.println( c );
            if(c != ' ')
                charCount[c]++;
        }

        //System.out.println( Arrays.toString(charCount));
        for(Integer i : charCount){
            if(i%2!=0 && i!=0){
                oddCharCount++;
            }
            if(oddCharCount>1){
                return false;
            }
        }

        return true;
    }
}
