package heakthran.questions.s2;

import java.util.*;

/**
 * questions is
 * <img src="./img.png"/>
 * <img src="./img_1.png"/>
 */
public class Solution2 {
    public static void main(String[] args) {
        Solution2 solution2=new Solution2();
        int[] b= {10,6,6,8};
        System.out.println(solution2.solution(100 , b ,2));
    }

    public int solution(int X, int[] B, int z) {
        int sum = Arrays.stream(B).reduce(0, Integer::sum);
        int remaining = X - sum;
        int count = 1;
        int trailSum = 0;
        for (int i = B.length - 1; count <=z; i--) {
            trailSum += B[i];
            count++;
        }
        return remaining/ (trailSum/z);
    }
}
