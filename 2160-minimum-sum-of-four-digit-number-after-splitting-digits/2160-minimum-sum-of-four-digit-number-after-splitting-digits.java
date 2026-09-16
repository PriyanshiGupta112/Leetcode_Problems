import java.util.Arrays;
class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        for (int i=0;i<4;i++) {
            digits[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(digits);
        int new1 = digits[0] * 10 + digits[2];
        int new2 = digits[1] * 10 + digits[3];
        
        return new1 + new2;
    }
}