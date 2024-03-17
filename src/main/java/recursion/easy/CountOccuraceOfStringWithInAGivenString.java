package recursion.easy;

/**
 * @author Tanmoy Mukherjee
 */
public class CountOccuraceOfStringWithInAGivenString {
    private static final String SOURCE= "hello world, hello universe";
    private static final String TARGET= "hello";

    public static void main(String[] args){
    System.out.println(
        "Occurrence is  " + findOccurrenceHelper(SOURCE, TARGET));
    }

    private static int findOccurrenceHelper(String source,String target){
      return findOccurrenceHelper(source,target,0);

    }

    private static int findOccurrenceHelper(String source, String target , int index){
        if(index > source.length()-target.length()) return 0;
        int subProbAns = findOccurrenceHelper(source,target,index+1);
        boolean found = source.substring(index,index+target.length()).equals(target);
        return (found) ? subProbAns+ 1 : subProbAns;
    }
}
