class Modular 
{
    public int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
    
  public int modInverse(int a, int m)
    {
        for(int i=1;i<=m;i++)
        {
            if(gcd(i,m)==1)
            {
                if((a*i)%m==1)
                {
                    return i;
                }
            }
        }
        return -1;
        
    }

}
