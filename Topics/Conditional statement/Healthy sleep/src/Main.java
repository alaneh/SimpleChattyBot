import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        if (k > m) {
            System.out.println("Excess");
        } else {
            if (k < n) {
                System.out.println("Deficiency");
            } else {
                System.out.println("Normal");
            }
        }
    }
}
