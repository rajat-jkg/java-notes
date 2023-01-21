//knowing about interfaces

public class Program14{
    public static void main(String[] args) {
        a obj = new B();
        obj.hello();
    }
}

//a sample interface
interface a{
    void hello();
    void bye();
}

//a class implemnting an interface
//any class implementinhg an interface must ovrride all the functions of the implemented interface
//the overridden functions must be public 
class B implements a{
    public void hello(){
        System.out.println("Hello");
    }
    public void bye(){
        System.out.println("Bye");
    }
}