
/**
 * @author Max
 */
public class EulerProject
{
    public static long gcd(long a, long b)
    {
        long temp;
        while (b != 0)
        {
            temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    long findSmallestMultiple(long number)
    {
        long result = 1;
        for(int i = 2; i <= number; i++)
        {
            result = result / gcd(i, result) * i;
        }
        return result;
    }
    long sumSquareDifference(long number)
    {
        long sum1 = 0, sum2 = 0;
        for(int i = 1; i <= number; i++)
        {
            sum1 += i*i;
            sum2 += i;
        }
        return sum2*sum2 - sum1;
    }
    long divisibleTriangleNumber()
    {
        /*
         * longer version
         * 
        long sum = 0;
        for(int x = 1; x <= 10; x++)
        {
            for(long i = 1; i <= x; i++)
            {
                sum += i;
            }
            System.out.println(sum);
            sum = 0;
        }
        */
        long sum = 0;
        for(long i = 1; i <= 10; i++)
            {
                sum += i;
                System.out.println(sum);
            }
        return 0;
    }
}
