class leetcode231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        double x = Math.log(n) / Math.log(2);
        double epsilon = 1e-10; 

        return Math.abs(x - Math.round(x)) < epsilon;
    }
}