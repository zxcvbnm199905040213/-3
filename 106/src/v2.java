import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class v2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String s = "";
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[] A = new int[26];
        int[] a = new int[26];
        int n = 0;
        StringTokenizer st = new StringTokenizer(s, " ,.?!:");
        while(st.hasMoreTokens()){
            String s2 = st.nextToken();
            n++;
            for (int i = 0; i < s2.length(); i++ ){
                char c = s2.charAt(i);
                if (c >= 'A' && c <= 'Z'){
                    A[c-'A']++;
                }
                else if (c >= 'a' && c <= 'z'){
                    a[c-'a']++;
                }
            }
        }

        System.out.println(n);
        for(int i = 0; i < 26; i++){
            if (A[i] > 0){
                System.out.println((char)('A'+i) + " : " + A[i]);
            }
            if (a[i] > 0){
                System.out.println((char)('a'+i) + " : " + a[i]);
            }
        }
    }
}
