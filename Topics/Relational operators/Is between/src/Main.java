import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean x = b > a && b > c;
        boolean y = b < a && b < c;
        boolean z = b == a && b == c;
        System.out.println(x || y || z);
    }
}