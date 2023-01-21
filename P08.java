import java.util.ArrayList;

public class P08 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        
        //adding elements
        list.add(120);
        list.add(16);
        list.add(18);
        list.add(90);
        
        System.out.println(list);

        //adding at a position (index)
        list.add(2, 6);
        System.out.println(list);

        //retrieving elements
        System.out.println(list.get(1));
        System.out.println(list.get(3));


        //altering elements
        list.set(0,4);
        System.out.println(list);

        //deleting element
        list.remove(0);
        System.out.println(list);


    }
}
