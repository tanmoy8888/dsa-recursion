package recursion.contest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tanmoy Mukherjee
 */
public class TotalAppealOfAString {
    private static final String INPUT ="code";
    public static void main(String[] args){
        TotalAppealOfAString total = new TotalAppealOfAString();
        total.appealSum(INPUT);
    }

    public long appealSum(String s) {
        Map<String,Integer> map = new HashMap<>();
        int appeal =0;
        int size=s.length();
        if(s != null && !s.isEmpty()){
            char [] arr = INPUT.toCharArray();
            int length =0;
            for(int i=0;i<=size-1;i++){
      //  if (length == 0) {
            for(int j = 1; j <= size-1; j++) {
            System.out.println("Value of i :: "+i+" value of j :: "+j);
            //System.out.println(INPUT.substring(j,i));
            }
            length ++;
          //System.out.println("i = " + i + " char is ::" + arr[i]);
      /*  }
        if(length >0 && length <size){

        }*/

              /*  for(int j = 1; j <i ; j++) {
          System.out.println("Printing value of i :: "+i+" and j :: "+j);
                   // System.out.println("Count :: "+count+" , value of i is :: "+i);
                    System.out.println("....." + INPUT.substring(j,i));*/

                }
           /*     count++;
            if(count == size){
                return appeal;
            }*/

            //}
        }
        return 0;
    }
}
