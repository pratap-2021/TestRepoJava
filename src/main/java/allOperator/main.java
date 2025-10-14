package allOperator;

import java.lang.reflect.Method;

public class main {

    public static void main(String[] args) throws Exception {
        interPrep inPrep = new interPrep();
//       W3School.reverseString();
//       W3School.sumOfArray();
//       W3School.convertingStrToArray();
//       W3School.sortArray();
//       W3School.averageArray();
//       W3School.leastArry();
//       interPrep.maxWeight();
//        interPrep.swapNum();
//        interPrep.reverseString("PRATAP");
//        swapNumber();
//        Fibonacci(10);
       long sum =inPrep.sumOfSumSeries(5);
        System.out.println(sum);
    }

   static void swapNumber(){
        int x = 10, y =5;
        System.out.println(" x value before swap "+x+"Y value before swap "+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("after swap x and y values are "+x+" "+y);
    }
    static void Fibonacci(int N) {
        int num1 = 0, num2 = 1;

        for (int i = 0; i < N; i++) {
            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }

    }

}
