package cci.ch1_arrays_string;

public class Q5_AnyOne {

    public static void main(String args[]){
        System.out.println( new Q5_AnyOne().anyOne("poik","pooko"));
    }

    boolean anyOne(String s1, String s2){

        int s1_len=s1.length(),skip_count=0;
        String large=null,small=null;
        int s2_len=s2.length();
        int s1ms2 = s1_len-s2_len;

        if(s1ms2==1){
            large=s1;
            small=s2;
        }else if(s1ms2==-1|| s1ms2==0){
            large=s2;
            small=s1;
        }else {
            return false;
        }


        for(int i=0,k=0;i<small.length();){

            if(!(small.charAt(i)==large.charAt(k))){



                if((small.charAt(i)==large.charAt(k+1))){
                    k=k+2;i++;
                }else if(i==small.length()-1){
                    return false;
                }
                else if((small.charAt(i+1)==large.charAt(k))){
                    i=i+2;k++;
                }else if((small.charAt(i+1)==large.charAt(k+1))){
                    i=i+2;k=k+2;
                }

                skip_count++;

            }else {
                i++;k++;
            }

            if(skip_count>1){
                return false;
            }else {
                if(skip_count==1 && s1ms2!=0)
                    return false;
            }

        }

        return true;

    }
}
