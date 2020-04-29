package paiza;
import java.util.Scanner;


public class B022 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int point = 0 ;
            int N = sc.nextInt();
            String M = sc.next();
            for (int i = 1; i <= N; i++) {
                String c = sc.next();
                if(c.contains(M)){
                	 System.out.println(M);
                }

             }

     }


    }
