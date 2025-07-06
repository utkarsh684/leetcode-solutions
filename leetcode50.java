class leetcode50 {
    public double myPow(double x, int n) {
        long N=n;
        if(N==0){
            return 1.0;
        }

        if(N<0){
            return (1.0/mypow(x,-N));
        }
        return mypow(x,N);
    }
    private double mypow(double x,long n){
        if(n==0){
            return 1.0;
        }
        double half=mypow(x,n/2);

        if(n%2==0){
            return half*half;
        }
        else{
            return half*half*x;
        }
    }
}