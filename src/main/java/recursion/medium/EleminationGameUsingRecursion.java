package recursion.medium;

/**
 * @author Tanmoy Mukherjee
 */
public class EleminationGameUsingRecursion {
    public static void main(String[] args){
        EleminationGameUsingRecursion gameUsingRecursion = new EleminationGameUsingRecursion();
    System.out.println(
        "gameUsingRecursion.lastRemaining(9) = " + gameUsingRecursion.lastRemaining(9));
    }

    public int lastRemaining(int n) {
        boolean left = true;
        int head = 1;
        int step = 1;
        int remain = n;
        while(remain > 1){
      System.out.println("remain = " + remain);
            if(left || remain % 2 == 1){
                head = head + step;
        System.out.println("head = " + head);
            }
            step = step * 2;
      System.out.println("step = " + step);
            remain = remain / 2;
      System.out.println("remain = " + remain);
            left = !left;
      System.out.println("left----------------------------------" + left);
        }
        return head;
    }
}
