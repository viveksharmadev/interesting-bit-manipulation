// https://leetcode.com/problems/hamming-distance/
class hamming-distance {
    // tc -> 1, sc-> 1
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
    
    // tc -> 1 (32 bits in Integer), sc-> 1
    public int hammingDistance(int x, int y) {
        int xor = x^y, res = 0;
        while(xor != 0){
            res += xor & 1;
            xor = xor >> 1; // xor = xor/2
        }
        return res;
    }
}
