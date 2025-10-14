package org.example;

import java.math.BigInteger;

public class numberAlgo {

    public void evenOddNum(int num){
        if(num % 2 == 0){
            System.out.println(num+" this is even number");
        }else {
            System.out.println(num+" this is odd number");
        }
    }
    static int primeNumber(int num){

        int i = 0;
        boolean flag = false;
        for (i=2; i <= num / 2; i++){
            if (num % i == 0){
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println(num+" is a Prime number");
        }else {
            System.out.println(num+" is not a Prime number");
        }

        return 0;
    }

    protected void prime1To100(){
        for (int i = 2; i<=100;i++){
            boolean check = true;
            for (int j = 2; j<i;j++){
                if (i%j==0){
                    check = false;
                    break;
                }
            }
            if (check==true){
                System.out.print(i+", ");
            }
        }
    }
     protected void factorialNum(int num){
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i=1;i<=num;i++){
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }
         System.out.println("Factorial of "+num+" is "+factorial);
     }

}
