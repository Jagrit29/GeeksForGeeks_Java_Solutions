class Quadratic 
{
    public void quadraticRoots(int a,int b,int c)
    {
        double a1=a;
        double b1=b;
        double c1=c;
        
        double d=(b1*b1)-(4*a1*c1);
        
        if(d<0)
        {
            System.out.print("Imaginary");
        }
        else
        {
            double r1=(-b1-Math.pow(d,0.5))/(2.0*a1);
            double r2=(-b1+Math.pow(d,0.5))/(2.0*a1);
            System.out.print((int)Math.floor(r2)+" ");
            System.out.print((int)Math.floor(r1));
            //System.out.println();
        }
        
        
    }
}
