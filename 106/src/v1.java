import java.util.Scanner;
class v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES"); //complete
    }
}