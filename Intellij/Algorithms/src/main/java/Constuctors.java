public class Constuctors {
    public static void main (String args[])
    {
        C c = new C();

    }
}

class A
{

    public A()
    {
        System.out.println("A");
    }
}

class B extends A
{
    public B()
    {
        System.out.println("B");
    }
}

class C extends B
{
    static{
        System.out.println("Static");
    }

    {
        System.out.println("Normal block");
    }

    public C()
    {
        System.out.println("C");
    }

}