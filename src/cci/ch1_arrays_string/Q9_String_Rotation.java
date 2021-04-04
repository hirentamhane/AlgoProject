package cci.ch1_arrays_string;

public class Q9_String_Rotation {

    public static void main (String args[]){
        System.out.println( new Q9_String_Rotation().isStringRoration("waterbottel","erbottelwat"));
    }

    boolean isStringRoration(String s1,String s2){

        if (s1.length()!=s2.length())
            return  false;

        StringBuilder subSting = new StringBuilder("");

       for(int i=0,j=0;i<s1.length() && j<s2.length();){
           if(!(s1.charAt(i)==s2.charAt(j))){
               subSting.append(s2.charAt(j));
               j++;
           }else{
               i++;j++;
           }
       }

        if(s1.indexOf(subSting.toString())>0){
            return true;
        }

        return false;

    }
}
