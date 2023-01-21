//use case of attributes

public class P2 {
    public static void main(String[] args) {
        person P = new person();
        // calling the attribute with the help of the object
        P.name = "Rahul";
        P.age = 26;
        System.out.println("Name:"+P.name);
        System.out.println("Age:"+P.age);

    }
}

class person{
    String name;
    int age;
}
