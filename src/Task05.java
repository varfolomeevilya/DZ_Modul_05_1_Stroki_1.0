import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] split = str.split("[\\s:]");
        int count = 0;
        for (String s : split) {
            if (str.length() % 2 == 0) {
                count++;
            }
        }
        System.out.print(count);
    }
}
