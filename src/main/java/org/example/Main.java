package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal1 an = new Animal1();

        Scanner read = new Scanner(System.in);
//        String firstName = read.nextLine();
//        String secondName = read.nextLine();
//        int age = read.nextInt();
//        int roomNumber = read.nextInt();
//        an.firstName= firstName;
//        an.secondName = secondName;
//        an.age = age;
//        an.roomNumber = roomNumber;
//
//        an.saveCustomerInfo();
//        String name = read.nextLine();
//        int age = read.nextInt();
//
//        an.name = name;
//        an.age = age;
//        an.setAge(-2);

        //set the age via Setter


//        System.out.println("Name: " + an.name);
//        System.out.println("Age: " + an.getAge());

//        int x = 5;
//        addOneTo(x);
//        System.out.println(x);

//        int a = Math.abs(-20);
//        double b = 19 ;
//        b += 3;
//        double x = Math.max(a, b);
//        x = Math.exp(b);
//
//        System.out.println(a);
//        System.out.println(x);
//       int ac =  an.minFunc(3, 2);
//        System.out.println(ac);
        //do not touch this code
//        Monopoly monopoly = new Monopoly();
//        Chess chess = new Chess();
//        Battleships battleships = new Battleships();
//        System.out.println("Game: "+monopoly.getName());
//        monopoly.play();
//        chess.play();
//        battleships.play();
//        battleships.getName();
//
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//
//        dog.swim();
//        dog.play();
//        cat.swim();
//        cat.play();

//        Scanner scanner = new Scanner(System.in);
//        int choice = scanner.nextInt();
//
//        String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};
//
//        //complete the code
//        try {
//            System.out.println(categories[choice]);
//        } catch(Exception e) {
//            System.out.println("Wrong Option");
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            int num1 = scanner.nextInt();
//            int num2 = scanner.nextInt();
//	        /*
//	        1. Error: division by zero
//	        2. Error: wrong value type
//	        */
//            //your code goes here
//            System.out.println(num1/num2);
//        } catch(ArithmeticException ar) {
//            System.out.println("division by zero");
//
//        } catch(InputMismatchException mis){
//            System.out.println("wrong value type");
//        }

//        evenOddNumber eve = new evenOddNumber();
//        eve.evenOddNum(6);
 /*       arrayPractise arrPrac = new arrayPractise();
        arrPrac.intersection();
        arrPrac.diffArr();
        arrPrac.union();
*/
        numberAlgo numAlgo = new numberAlgo();
        numAlgo.factorialNum(100);
    }
//    static void addOneTo(int num) {
//        num = num + 1;
//    }



}