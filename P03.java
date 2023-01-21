//using this keyword
class demo{
    int a;
    int b;
    demo(int a, int b){
        this.a = a;
        this.b = b;
        // here the a and b in the constructor parameters are local variable.
        // While writing a we call the local a 
        // while writhing this.a we call the instace a 
    }
}
public class P3 {
    public static void main(String[] args) {
        demo obj = new demo(12, 20);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
