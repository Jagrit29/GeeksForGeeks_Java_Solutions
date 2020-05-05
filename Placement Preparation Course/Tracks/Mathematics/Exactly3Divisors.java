class Divisors
{
    
    public boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
    public int exactly3Divisors(int N)
    {
        int count=0;
        
        for(int i=2;i<=N;i++)
        {
            double sq=Math.sqrt(i);
            //Example:
            //1. Suppose i=16; sq=4.0,  4.0-Math.floor(4.0)=0;
            //2. 3; 1.14;   1.14-1 !=0;
            if(sq-Math.floor(sq)==0) //Checking perfect Square;
            {
                if(isPrime((int)sq))  //Now checking whether the number is prime or nto;
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}
