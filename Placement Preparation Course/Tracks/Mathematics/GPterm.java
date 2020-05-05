class GP 
{
    
    public double termOfGP(int A,int B,int N)
    {
        double a=A; //make inputs double
        double b=B;
        double r=b/a;
        //System.out.println(r);
        
        return Math.floor(a*Math.pow(r,N-1));
    }

}
