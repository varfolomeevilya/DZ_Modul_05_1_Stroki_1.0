import java.util.Scanner;

public class Task02 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите номер символа(1-1000)");
        int n= scanner.nextInt();
        int position= scanner.nextInt();
        String str="";
        String str1="";
        for(int i=1; str.length()<1000;i++){
                str=str + String.valueOf(i);

        }
        for (int i=0; i<=999; i++){
            str1=str1 + String.valueOf(str.charAt(i));
        }
        System.out.println("На позиции " + position + " находится цифра " + str.charAt(position-1));
    }
}
