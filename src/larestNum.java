import java.util.Scanner;

public class larestNum {
    public static void main(String[] args) {
        System.out.println("enter the numbers to compare");

        Scanner in =new Scanner(System.in);
                int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();

        int max=a;
        if(b>max) max = b;
        if(c>max) max = c;
        System.out.println(max);

    }
}
