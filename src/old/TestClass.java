package old;

import java.math.BigDecimal;
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        String N = s.nextLine();
        String D = s.nextLine();
        Long NL = Long.valueOf(N);
        Long DL = Long.valueOf(D);

        Long AnsWithLongPre = (Long) NL/DL;
        String AnsWithLongPreString = AnsWithLongPre.toString();


        // Reading input from STDIN
        System.out.println( AnsWithLongPreString );    // Writing output to STDOUT
    }
}
