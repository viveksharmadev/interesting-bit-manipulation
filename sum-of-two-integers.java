// https://leetcode.com/problems/sum-of-two-integers/
class Solution {
    // tc -> 1(32 bits), sc-> 1(32 bits)
    public int getSum(int a, int b) {
        if(a==0) return b;
        else if(b==0) return a;
        
        while(b!=0){
            int carry = a & b; // 1&1 = 1 for carry
            a = a ^ b; // To simulate add for binary numbers
            b = carry << 1; // to keep going from left to right for next iteration
        }
        
        return a;
    }
}
