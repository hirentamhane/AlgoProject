package cci.ch1_arrays_string;

import java.util.HashMap;

public class Q2_CheckPermutation {

    public static void main(String args[]){
        System.out.println( new Q2_CheckPermutation().isPermutation("x@xuu7","7xxu@u") );
    }

    boolean isPermutation(String str1,String str2){

        if (str1.equals(null)|| str2.equals(null)){
            return false;
        }
        if (str1.length()==0 || str2.length()==0){
            return true;
        }
        if (str1.length()!=str2.length()){
            return false;
        }
        /*
        String large,small;
        if (str1.length()>str2.length()){
            large=str1;
            small=str2;
        }else{
            large=str2;
            small=str1;
        }*/

        HashMap<Character,Integer> strChar = new HashMap<>();

        for (char c : str1.toCharArray()){
            if(strChar.containsKey(c)){
                strChar.compute(c,(k,v)->++v);
            }else {
                strChar.put(c,1);
            }
        }

        for (char c : str2.toCharArray()){

            if(strChar.containsKey(c)){
              Integer count = strChar.get(c);
              count--;
              if(count<0){
                  return false;
              }else {
                  strChar.put(c,count);
              }
            }else{
                return false;
            }
        }

        return true;
    }
}
