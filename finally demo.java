class FinallyDemo
{
    static void A()
    {
        try
        {
            System.out.println("inside A");
            throw new RuntimeException("demo");
        }
        finally
        {
            System.out.println("A finally");
        }
    }
    static void B()
    {
        try
        {
            System.out.println("inside B");
            return;
        }
        finally
        {
            System.out.println("B finally");
        }
    }
    static void C()
    {
        try
        {
            System.out.println("inside C");
        }
        finally
        {
            System.out.println("C finally");
        }
    }
    public static void main(String args[])
    {
        try
        {
            A();
        }
        catch (Exception e)
        {
            System.out.println("Exception caught");
        }
        B();
        C();
    }
}
