import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int center = str.length() / 2;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i <= center) {
                    if (j >= center - i && j <= center + i) {
                        System.out.print("testing");
                    } else
                        System.out.print("  ");
                } else {
                    if (j >= center + i - str.length() + 1 && j <= center - i + str.length() - 1) {
                        System.out.print("testing");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}

