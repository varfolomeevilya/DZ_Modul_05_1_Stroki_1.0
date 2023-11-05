import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < 99999; i++) {
            String str = String.valueOf(i);
            if (str.indexOf("4") != -1) {
                n++;
            }else if(str.indexOf("1")!=-1 & str.indexOf("1")+1==str.indexOf("3")){
                n++;
            }
        }
        System.out.println(" Исключить технику " + n + " номер ");
    }
}
