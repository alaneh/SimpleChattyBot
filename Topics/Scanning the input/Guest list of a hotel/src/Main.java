import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] s = new String[11];
        for(int i=0; i<8; i++){
            s[i] = scanner.next();
        }
        for(int i=7; i>=0; i--) {
            System.out.println(s[i]);
        }
    }
}