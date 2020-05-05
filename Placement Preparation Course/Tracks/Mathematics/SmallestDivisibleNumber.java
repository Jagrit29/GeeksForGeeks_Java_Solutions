//Need to find LCM of 1 to n;
class GfG{
    
    //here b is greater
    public static long gcd(long a,long b)
    {
        if(a==0)
        {
            return (long)b;
        }
        
        return (long)gcd(b%a,a);  //b%a will be smaller than a only;
    }
	public static long getSmallestDivNum(int n){
	    
	    //LCM(a,b)=GCD(a,b)/a*b;
	    long lcm=1;
	    
	    for(long i=1;i<=(long)n;i++)
	    {
	        lcm=(i*lcm)/(gcd(i,lcm));
	    }
	    
	    return lcm;
	    
	    
	    
	    
//add code here.

}
}
