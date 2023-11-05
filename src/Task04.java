import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите строку слова");
        String[] str= scanner.nextLine().split("");
        String[] glas=new String[]{"a", "i", "o", "u", "y", "e"};
        String[] soglas=new String[]{"q", "w", "r","t", "p", "s", "d", "f", "g", "h", " j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
        System.out.println(Arrays.deepToString(str));
        System.out.println(Arrays.toString(glas));
        System.out.println(Arrays.toString(soglas));
    }
}
