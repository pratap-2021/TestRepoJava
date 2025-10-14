package allOperator;

import java.util.Arrays;

public class W3School {

    public static void reverseString(){
        String originalStr = "Hello Pratap";
        String reversedStr = "";
        for(int i = 0; i < originalStr.length();i++){
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        System.out.println(reversedStr);
    }

    public static void sumOfArray(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("sum of array: "+ sum);
    }
    public static void convertingStrToArray(){
        String myStr = "Hello";
        char[] myArray = myStr.toCharArray();
        System.out.println(myArray[0]);
        for (char i : myArray){
            System.out.print(i);
        }
    }
    public static void sortArray(){
        int[] myArray = {34,2,1,32,54,67,15};
        Arrays.sort(myArray);
        for (int i : myArray){
            System.out.println(i);
        }
    }
    public static void averageArray(){
        int[] myArray = {34,2,1,32,54,67,15};
        int sum = 0;
        double avg = 0;
        for (int i : myArray){
            sum += i;
        }
        avg = sum / myArray.length;
        System.out.println("Average of Array "+avg);
    }
    public static void leastArry(){
        int[] ages = {34,20,18,32,54,67,15};
        int lowest = ages[0];
        for (int i : ages){
            if (lowest> i){
                lowest = i;
            }
        }
        System.out.println(lowest);

    }
}



