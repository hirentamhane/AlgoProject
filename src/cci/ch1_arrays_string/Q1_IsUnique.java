package cci.ch1_arrays_string;

import java.util.HashSet;

public class Q1_IsUnique {

    //Check string has all unique char or not

    boolean isAllCharUnique(String str){
        HashSet<Character> charsOfString = new HashSet<>();
        for(char c : str.toCharArray()){
            if(!charsOfString.add(c))
                return false;
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(new Q1_IsUnique().isAllCharUnique("__"));
    }
}
