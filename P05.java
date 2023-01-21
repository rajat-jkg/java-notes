//Encapsulation

class EncapDemo{
    private String Name;//we have made the data private so that it cannot be accessed by other class directly
    private int Id;
    public void setName(String N) {
        Name=N;
    }
    public void setId(int I){
        Id = I;
    }
    public String getName(){
        return Name;// we are returning the private data in a public class and it can be accessed by the other class through this method
    }
    public int getId(){
        return Id;
    }
}

public class P5 {
    public static void main(String[] args) {
        EncapDemo o = new EncapDemo();
        //from this class, we can access the data of EncapDemo through Methods only. That means we have boung the data with methods.
        //that is how Encapsulation is implemented
        o.setName("Rajat");
        o.setId(1222);
        System.out.println(o.getName());
        System.out.println(o.getId());
    }
}
