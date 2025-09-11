public class PrimeGame {

    import java.util.Scanner;

    public static boolean(int n) {




        return true;
    }

    public class PrimeGame {
        public static void main(String[] args) {
            //System.out.println(Math.sqrt(25.0));

            Scanner sc = new Scanner(System.in);
            boolean isPrime = true;
            int number = sc.nextInt();

            if(number <= 1) {
                isPrime = false

            }

            for(int i=2; i<=Math.sqrt(number); i=i+1){
                if(number % i == 0) {
                    isPrime = false
                    break;
                }
                //System.out.print(i + " ");
            }
            if(isPrime){
                System.out.println(number + " is a prime number~");
            }else{
                System.out.println(number + " is NOT prime number~!");
            }
        }
    }

}
