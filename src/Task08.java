import java.util.Scanner;

public class Task08 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();
        for(int i=0; i<str.length(); i++){
            if (true){
                System.out.print("Java");
            }
          if(false){
              System.out.print("C++");
          }
          System.out.print(str);
        }
    }
}
