import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean x = a > 0 && b <= 0 && c <= 0;
        boolean y = b > 0 && a <= 0 && c <= 0;
        boolean z = c > 0 && b <= 0 && a <= 0;
        System.out.println(x || y || z);
    }
}
