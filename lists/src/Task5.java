import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1=s.nextLine();
        String str2=str1.substring(0,str1.indexOf(";"));
        String str3=str1.substring(str1.indexOf(";")+1,str1.lastIndexOf(";"));
        str1=str1.substring(str1.lastIndexOf(";")+1);
        String pass=str1.replaceAll(str1,"***");
        System.out.println(str2+":"+"\n"+"Электронная почта - "+str3+"\n"+"Пароль - "+pass);
    }
}
