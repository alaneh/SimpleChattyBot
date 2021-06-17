import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int i = scanner.nextInt();
        if (i % 2 != 0) {
            i += 1;
        }
        int i2 = scanner.nextInt();
        if (i2 % 2 != 0) {
            i2 += 1;
        }
        int i3 = scanner.nextInt();
        if (i3 % 2 != 0) {
            i3 += 1;
        }
        int n = i + i2 + i3;
        System.out.println(n / 2);
    }
}
