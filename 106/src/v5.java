import java.util.Scanner;
class v5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] data = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                data[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }
}