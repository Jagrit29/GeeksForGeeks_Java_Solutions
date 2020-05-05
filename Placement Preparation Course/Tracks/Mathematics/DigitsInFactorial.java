class Factorial
{
    
    public int digitsInFactorial(int N)
    {
        if(N<=1)
        {
            return 1;
        }
       //Just need to to count the digits in each number from 1 to N;
        double digits=0;
        while(N>0)
        {
            digits+=Math.log10(N);
            N--;
        }
        
        return (int)Math.ceil(digits);
        
        
    }

}
