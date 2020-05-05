class Modulo {
    public static long sumUnderModulo(long a, long b)
    {
        int M=1000000007;
        // Your code here, return sum of a and b
        
        long sum=(a%M + b%M)%M;
        
        return sum;
    }   
}
