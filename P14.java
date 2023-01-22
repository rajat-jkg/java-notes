//Program for fle handling demonstration
//Path of file is taken assumig it has to be ececued on windows


import java.io.File; //to create file
import java.io.FileWriter; //to write data to file
import java.io.IOException; // to handle IOException
import java.util.Scanner; //to read data from file

public class P14{
    public static void main(String[] args) throws InterruptedException, IOException {
        File F1 = new File("D:\\New.txt");
        System.out.println("Creating new file");
        Thread.sleep(1000);
        if(F1.createNewFile()) System.out.println("File created as "+F1.getName());
        else System.out.println("File "+F1.getName() +" already exists");
        FileWriter fw = new FileWriter(F1);
        for (int i = 0; i < 10; i++){
            System.out.println("Adding text");
            Thread.sleep(500);
            fw.append("Line "+i+"\n");
        }
        fw.close();
        System.out.println("Added text to file");

        Scanner sc = new Scanner(F1);
        System.out.println("Going to read file \nFile text here:");
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
