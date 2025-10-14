package allOperator;

public class interPrep {

    public void addnumber(){
        int a=10000;
        int b=2;
        float d = 3.2f;
        int c;

        c = a+b;
        System.out.println("\nTwo nuber are :"+ c );

    }
    public void whileCondition(){
        int p = 5;
        while(p>0){
            System.out.println(p);
            p--;
        }
        for (int i = 2; i <= 100; i = i +2) {
            System.out.println(i);
        }
    }

    public static void  maxWeight(){
        int i,j;
      int[][]  maxWht = {{1,2,3},{2,0,0}};
      int k =0;
      for(i = 0; i < maxWht.length;i++){
          for(j = 0; j<= maxWht.length;j++){
              System.out.println("arrr  "+maxWht[i][j]);
              k = k + maxWht[i][j];


          }
          System.out.println("sum of row "+" "+i+" "+k);
          k=0;
      }

    }

    static void swapNum(){
        int a = 10;
        int b = 20;
        int k = 0;
        System.out.println("before swap number a:"+a+" b:"+b);
        k = a + b;
        b = k - b;
        a = k - a;
        System.out.println("after swap number a:"+a +" b:"+b);
    }
    static void reverseString(String y){
//        String orgiString = y;
        // Java Program to reverse a string using concat() method
                // Declare original string variable
                String a = y;

                // Declare another string variable
                // and initialize it with an empty string
                String b = "";

                // Iterate through each character in string "a"
                // from the last index to the first.
                for (int i = a.length() - 1; i >= 0; i--) {

                    // Extract the current character at index "i" of the "a" string
                    char ch = a.charAt(i);

                    // Convert the character to a String object
                    // using the "Character.toString" method
                    String ch1 = Character.toString(ch);

                    // Concatenate the converted character String
                    // to the end of the "b" string
                    b = b.concat(ch1);
                }

                System.out.println("" + a);
                System.out.println("" + b);
            }


/*
Input: N = 5
Output: 35
Explanation:
Sum of sum-series of {1, 2, 3, 4, 5} i.e. {1 + 3 + 6 + 10 + 15} is 35.

Find sum-series of every value by using the formulae sum = (N*(N + 1)) / 2
*/
     static long sumOfSumSeries(int n){
        long sum = 0;
        for(int i =0; i<=n;i++){
            sum = sum+(i*(i + 1)) / 2;
        }

        return sum ;
    }


}