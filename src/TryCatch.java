import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        System.out.println("¬ведите число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        try {
            System.out.println(Math.sqrt(number));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
