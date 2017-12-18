import java.util.Scanner;

public class v6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int result = ' ';
        while(a%b!=0){
            result=b;
            b=a%b;
            a=result;
        }
        result=b;
        System.out.println(result);
    }
}

