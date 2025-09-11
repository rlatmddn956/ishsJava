public class PrimeGame {

    import java.util.Scanner;

    public static boolean(int n) {
        int number = sc.nextInt();

        if(number <= 1) {
            return false;

        }else{
        for(int i=2; i<=Math.sqrt(number); i=i+1){
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public class PrimeGame {
        public static void main(String[] args) {
            //System.out.println(Math.sqrt(25.0));

            Scanner sc = new Scanner(System.in);
            boolean isPrime = true;

            if(isPrime(number)){
                System.out.println(number + " is a prime number~");
            }else{
                System.out.println(number + " is NOT prime number~!");
            }
        }
    }

}
