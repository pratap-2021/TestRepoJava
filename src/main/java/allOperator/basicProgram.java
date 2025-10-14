package allOperator;

public class basicProgram {
    //swaping program of two integer number without using temp number
    public static void swapNumber(){
        int a= 20, b= 10;
        System.out.println("Originals number before sawping a: "+a+" b:"+b);

        a = a + b; // a = 30 and b = 10
        b = a - b; // b = 20 and a = 30
        a = a - b;// a = 10 and b = 20

        System.out.println(" NUmbers are swap a: "+a+" b:"+b);
    }
    public static void swapNumberUsingBitwise(){
        int a= 2, b= 1;
        System.out.println("Originals number before sawping a: "+a+" b:"+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(" NUmbers are swap a: "+a+" b:"+b);

    }
    // swap numbers using division and multiplication
    public static void swapNumberUsingDivisionAndMultiplication(){
        int a= 5, b= 2;
        System.out.println("Originals number before sawping a: "+a+" b:"+b);

        a = a*b;// a = 10 and b = 2
        b = a/b;// b = 5 and a 10
        a = a/b;// a = 2 and b = 5
        System.out.println(" NUmbers are swap a: "+a+" b:"+b);
    }
    public static void swapNumberUsingTempVariable(){
        int a= 31, b= 7;
        int temp =0;
        System.out.println("Originals number before sawping a: "+a+" b:"+b);
        temp = a + b;//temp = 10 and a = 3 and b = 7
        b = temp -b;// b = 5 and a = 5
        a = temp - a;
        System.out.println(" NUmbers are swap a: "+a+" b:"+b);
    }
    public static void palindromeNumber(int number){
        int reverse = 0;
        int temp = number;
        while (temp != 0){
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        if (number == reverse){
            System.out.println("The given number is palidrome: "+number);
        }else {
            System.out.println("The given number is not palidrome: "+number);
        }

        System.out.println("reverse integer "+reverse);
    }
    public static void factorialNumber(){
        int number = 5;
        int fact = 1;
        /*for (int i =1;i<=number;i++){
            fact = fact * i;
            System.out.println(" factorial of "+number+": "+fact);
        }*/
        while (number != 0){
            fact = fact * number;
            System.out.println("Factorial: "+ number+" "+fact);
            number--;
        }
    }
    public static void fibonacciSeries(){
        int a = 0, b = 1, c=0;
        int number = 20;

        for (int i=1; i<=number;i++){
            System.out.print(a+", ");
            c = a + b;// c = 1
            a = b;// a = 1
            b = c; //b= 1

        }
    }
}
