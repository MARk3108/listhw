import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1=s.nextLine();
        String str2="FINAL";
        if(str1.contains(str2)){
            System.out.println("ОК");
        }else {
            System.out.println("в процессе разработки");
        }
    }
}
