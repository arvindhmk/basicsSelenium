package interfc;
public class Runtimepolymorphism
{
    public static void main (String args[])
    {
        Two T= new Two();
        T.sum(6,9);
    }
}
class One
{
    public void sum(int a,int b)
    {
        int c = a + b;
        System.out.println("Class one " + c);
    }
}
//Late binding, Dynamic binding, Run time polymorphism
class Two extends One
{
    @Override
    public void sum(int a, int b)
    {
        int c = a + b;
        System.out.println("Class Two "+c);
    }
}
