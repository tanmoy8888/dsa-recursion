package recursion.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  I/P  => [abc]
 *  O/P  => ["",a,b,c,ab,bc,ca,abc]
 *
 * @author Tanmoy Mukherjee
 */
public class SubSetsOfAGivenString {
    private static final String INPUT ="abc";
    public static void main(String[] args){
    System.out.println("List of SubSet is :: " + subSets(INPUT));
    }
    private  static List<String> subSets(String str){
    return subSetsHelper(str, 0, "", new ArrayList<String>()).stream().skip(1).sorted().collect(Collectors.toList());
    }
    private static List<String> subSetsHelper(String str, int i , String curr ,List<String> list){
    if (i == str.length()) {
        list.add(curr);
        return list;
    }
    subSetsHelper(str,i+1,curr,list);
    subSetsHelper(str,i+1,curr+str.charAt(i),list);
    return list;
    }
}
