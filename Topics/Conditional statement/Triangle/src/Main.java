import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean x = a + b > c;
        boolean y = a + c > b;
        boolean z = b + c > a;
        if (x && y && z) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
