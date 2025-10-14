package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.Integer.sum;

public class Name extends Thread{

    public static void main(String[] arg){
//        Name name = new Name();
//        //set priority
//        name.setPriority(1);
//
//        Welcome welcome = new Welcome();
//        //set priority
//        welcome.setPriority(2);
//
//        name.start();
//        welcome.start();
//        int sum1 = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        ArrayList<Integer> evennums = new ArrayList<Integer>();
//
//        while(evennums.size()<3){
//            int num = scanner.nextInt();
//            //your code goes here
//            evennums.add(num);
//
//        }
//        for (int i = 0; i< evennums.size(); i++){
//            sum1 = sum1 + evennums.get(i);
//        }
//        int avg = sum1 / evennums.size();
//                System.out.println("total of array: "+sum1+ " average "+avg);
//        Scanner scanner = new Scanner(System.in);
//
//        LinkedList<String> words = new LinkedList<String>();
//
//
//        while(words.size()<5){
//            String word = scanner.nextLine();
//            //add the word to LinkedList
//            words.add(word);
//
//        }
//
//        //your code goes here
//        for(String s : words){
//            if(s.length()>4){
//                System.out.println(s);
//            }
//        }
//        ArrayList<Integer> nums = new ArrayList<Integer>();
//        nums.add(3);
//        nums.add(36);
//        nums.add(73);
//        nums.add(40);
//        nums.add(1);
//
//        Collections.sort(nums);
//
//        System.out.println(nums);
//        System.out.println(Collections.max(nums));
//        System.out.println(Collections.min(nums));
//        Collections.reverse(nums);
//        System.out.println(nums);
//        Collections.shuffle(nums);
//        System.out.println(nums);

 /*       Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> nums = new LinkedList<Integer>();

        while(nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);
        }


        int sum = 0;
        //your code goes here
        Iterator it = nums.iterator();
        while (it.hasNext()) {
            Integer i = (Integer) it.next();
            sum += i;
        }

        System.out.println(sum);
*/
 /*       try {
            File x = new File("C:\\Users\\pgora\\OneDrive\\Desktop\\MYSQL.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error "+ e);
        }
*/
 /*       try {
            Scanner scanner = new Scanner(System.in);
            Formatter f = new Formatter("C:\\Users\\pgora\\OneDrive\\Documents\\Automation\\soloLearnJava\\src\\main\\resources\\test.txt");

            int count = 0;
            while (count < 3){
                String s = scanner.next();
                f.format(s+" \r\n");


                count++;

            }
            f.close();

            File x = new File("C:\\Users\\pgora\\OneDrive\\Documents\\Automation\\soloLearnJava\\src\\main\\resources\\test.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error   " + e);
        }
*/
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
        int x = 0;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            x+= it.next();
        }
        System.out.println(x);

        int f=1, i=2;
        while(++i<5)
            f*=i;
        System.out.println(f);

    }
    public void run() {
        System.out.println("Please enter your name");
    }
}
