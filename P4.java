// method overloading

class Summing {
    public void sum(int a, int b)    {
        System.out.println(a+b);
    }
    public void sum(double a, double b)    {
        System.out.println(a+b);
    }
    public void sum(double a, int b)    {
        System.out.println(a+b);
    }
    public void sum(int a, double b)    {
        System.out.println(a+b);
    }
}

public class P4{
    public static void main(String[] args) {
        Summing ob = new Summing();
        ob.sum(1,2);
        ob.sum(1.5,8);
        ob.sum(2.2,8);
        ob.sum(1, 1.2);
    }
}
