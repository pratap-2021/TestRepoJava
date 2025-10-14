package smallJavaProgramm;

public class practiseProgram {

    public static void main(String[] args) {

        String rev = reverse("Pratap");
        System.out.println(rev);
        boolean prime =isPrimeNum(12);
        System.out.println("Is number is Prime "+prime);

    }
//    java reverse string program

    public static String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i>=0;i--)
            result += str.charAt(i);
        return result;
    }
//    check where is prime number

    public static boolean isPrimeNum(int n){
        if (n <= 1) return false;
        for (int i = 2; i<=Math.sqrt(n); i++){
            if (n%i == 0) return false;
        }
        return true;
    }
}
