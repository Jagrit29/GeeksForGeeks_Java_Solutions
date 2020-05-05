class Factorial
{
    /*
Let's take 10!=10x to get the value of x.

Take log both sides log(10)!=xlog10

log(10*9*8*..*1)=x

log10+log9+log8+...+log1=x

Take the floor of sum and add 1 to get the number of digits.

 */
    
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
