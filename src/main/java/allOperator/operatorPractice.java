package allOperator;

public class operatorPractice {

//    Bitwise unary complement operator (~) Example

    public static void bitwiseUnaryComplementOperator(){
        int number = 2;//0010
        System.out.println("value of number before "+number);
        System.out.println("value of number after "+~number);
        System.out.println(" binary number of 2 "+Integer.toBinaryString(number));
    }
    public static void bitwiseAndOperator(){
        int a = 2;
        int b = 4;
        System.out.println(" Result of a & b "+ (a & b));

    }
    public static void bitwiseOROperator(){
        int a = 2, b= 4;
        System.out.println("value of A bitwise OR B in java "+(a|b));
    }


}
