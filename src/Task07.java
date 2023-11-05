import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if(Character.isLowerCase(str.charAt(i))){
                    str.toUpperCase();
                }

            }
        }
        System.out.print(str);
    }
}

