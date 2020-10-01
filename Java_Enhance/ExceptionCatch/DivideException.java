/**Divide exception example
*@author keviness
*@version 2020/10/1
*/

public class DivideException
{
    public static void main(String[] args)
    {
        TestException a = new TestException(9, 0);
        try
        {
            double c = a.divide();
            System.out.println("The result:" + c);
        }
        catch (Exception e) //Exception or DivisorIsZeroException
        {
            e.printStackTrace();
        }
            
    }
}

class DivisorIsZeroException extends Exception //一般写Exception而非Throwable
{
    public DivisorIsZeroException(String message)
    {
        super(message);
    }
}

class TestException
{
    private int m;
    private int n;

    public TestException(int m, int n)
    {
        this.m = m;
        this.n = n;
    }
    //throws的作用是把在该方法中出现的错误抛出，交于被调用者捕捉和处理
    public double divide() throws DivisorIsZeroException 
    {
        if (this.n == 0)
        {
            throw new DivisorIsZeroException("The divisor is zero!");
        }
        else
        {
            return this.m/this.n;
        }
    }
}