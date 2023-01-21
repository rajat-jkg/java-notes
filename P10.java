//lambda function
class P10{
    public static void main(String[] args) {

        // accessing show method using B class
        A obj = new B();
        obj.show();


        //creating lambda funtion for show
        //it is same as above process except it is a shorter way
        A obj2 = ()-> System.out.println("Hello this is lambda");
        obj2.show();
    }
}


// a funtional interface can have only only one method
@FunctionalInterface
interface A{
    void show();
}

class B implements A{
    public void show(){
        System.out.println("Hey");
    }
}