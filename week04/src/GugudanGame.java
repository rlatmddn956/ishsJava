import java.util.Scanner;

public class GugudanGame {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("단을 입력하세요 : ");
        int dan = scanner.nextInt();

        for(int i=1; i<10; i++){
            System.out.println(dan + " x " + i + " = " + (dan*i));
        }
    }

}
