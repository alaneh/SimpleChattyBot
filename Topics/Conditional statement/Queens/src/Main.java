import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int c = Math.abs(a - x);
        int z = Math.abs(b - y);
        if (c == z || a == x || b == y) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
