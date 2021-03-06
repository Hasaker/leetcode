package classify.bit;

public class ReverseBits {

    public int reverseBits(int n) {
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            res ^= (n & 1) << i;
            n >>= 1;
        }

        return res;
    }
}
