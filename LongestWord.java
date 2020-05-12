import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int ele = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > s[ele].length()) {
                ele = i;
            }
        }
        System.out.println(s[ele]);

    }

}
