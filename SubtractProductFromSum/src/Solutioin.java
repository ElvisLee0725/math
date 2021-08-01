/*
- Get the product and sum from each digit of n
- Use product minus sum
- Time: O(1), Space: O(1)
*/
class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().subtractProductAndSum(4421));
    }
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n > 0) {
            int cur = n % 10;
            product *= cur;
            sum += cur;

            n /= 10;
        }
        return product - sum;
    }
}