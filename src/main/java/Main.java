import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("tarasov_branch");

        int num1 = new Scanner(System.in).nextInt();

        for (int i = 0; i <= num1; i++){
            for (int j = num1; j > 0; j--){
                if(i * j == num1) {
                    System.out.println(i + "*" + j);
                }
            }
        }
    }
}
