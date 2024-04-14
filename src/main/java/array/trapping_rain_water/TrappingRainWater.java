/*
package array.trapping_rain_water;

import java.util.ArrayList;
import java.util.List;

*/
/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 * Example 2:
 *
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 *
 *
 * Constraints:
 *
 * n == height.length
 * 1 <= n <= 2 * 104
 * 0 <= height[i] <= 105
 *
 * @author Tanmoy Mukherjee
 *//*

public class TrappingRainWater {
    public static void main(String[] args){
     int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println("trap(arr) = " + trap(arr));
    }
    public static int trap(int[] height) {
        if(height.length == 0) return 0;
        int start = 0;
        int end = height.length-1;
        int water =0;
        int currentIndex=0;
        int [] max = findMaxRightElement(height);
        int maxRight = max[0];
        int maxRightIndex = max[1];
    System.out.println("maxRight = " + maxRight);
        while(start < end){
               if(height[start])
        }
   return water;
    }

    private static int[] findMaxRightElement(int [] height){
        int [] max = new int[2];
        int maxRight = 0;
        int indexOfMaxRight=0;
        for(int i = 0; i < height.length; i++) {
            if(height[i] > maxRight){
                maxRight = height[i];
                indexOfMaxRight = i;
            }
        }
        max[0] = maxRight;
        max[1] = indexOfMaxRight;
        return max;
    }
}
*/
