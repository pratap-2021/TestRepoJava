package geekForGeeks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Geeks {

    public  static void main(String[] args){
        Geeks gee = new Geeks();

        zeroParameter zeroParameter = ()-> System.out.println("Shree Shivay Namstubhayam");
        zeroParameter.display();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(23);
        arr.add(24);
        arr.add(29);
        arr.add(31);
        arr.add(65);
        arr.add(66);

        arr.forEach(n -> System.out.println(n));

        arr.forEach(n -> {if(n % 2 == 0)
            System.out.println(" even numbers are :- "+n);

        });



//        File file = new  File("myText.txt");
//
//        try {
//            if (file.createNewFile()){
//                System.out.println("file is created. name is "+file.getName());
//            }
//        } catch (IOException e) {
//            System.out.println("file is not created and error message is"+ e);
//            throw new RuntimeException(e);
//        }
    }
    public void fileWriter(){
        FileWriter writer = null;
        try {
            writer = new FileWriter("myText.txt");
            writer.write("Pratap is a good guy and Monday having good interview with Amnex" +
                    "\"Shree Shivay Namstubhayam\"");
            writer.close();
            System.out.println("Message write successfully in text");

        } catch (IOException e) {
            System.out.println("error was occured in file writing file:- "+e);
            e.printStackTrace();
        }
    }
    public void readFile(){

        try {
            File file = new File("myText.txt");
            Scanner read = new Scanner(file);
            while(read.hasNext()){
                String data = read.nextLine();
                System.out.println(data);
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("error message was occurred "+e);
            throw new RuntimeException(e);
        }
    }
    interface zeroParameter{
        void display();
    }
}
