import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        String line4 = scanner.nextLine();
        String line5 = scanner.nextLine();
        System.out.println("The form for "+ line1 +
                " is completed. " +
                "We will contact you if we need a chef " +
                "that cooks "+line5 +" dishes.");
    }
}