package array.medium;

import java.util.ArrayList;

/**
 * @author Tanmoy Mukherjee
 */
public class MaximumAbsoluteDifference {
    public static void main(String[] args){
      ArrayList<Integer> list = new ArrayList<>();
      /*list.add(3);
      list.add(-2);
      list.add(5);
      list.add(-4);*/
        list.add(1);
        list.add(3);
        list.add(-1);
    System.out.println("maxArr(list) = " + maxArr(list));
    }
    public static int maxArr(ArrayList<Integer> A) {
    int n = A.size();
    int minAiPi = Integer.MAX_VALUE;
    int maxAiPi = Integer.MIN_VALUE;
    int minAiMi = Integer.MAX_VALUE;
    int maxAiMi = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      minAiPi = Math.min(minAiPi, A.get(i) + i);
      maxAiPi = Math.max(maxAiPi, A.get(i) + i);

      minAiMi = Math.min(minAiMi, A.get(i) - i);
      maxAiMi = Math.max(maxAiMi, A.get(i) - i);
    }
        int diffAiPi = maxAiPi - minAiPi;
        int diffAiMi = maxAiMi - minAiMi;

        return Math.max(diffAiMi,diffAiPi);
    }
}
