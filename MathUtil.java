public class MathUtil 
{
    public static void Pow_of_X(int base,int exponent)
    {
        int product=1;
        for(int i=0;i<exponent;i++)
        {
            product=product*base;
        }
        System.out.println(base + "power" + exponent+ "is : "+product);
    }
    
}
