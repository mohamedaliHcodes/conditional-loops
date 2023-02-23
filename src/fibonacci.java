import java.util.Scanner;

public class fibonacci {
    // find a given fibonacci number given its position
    //say the 7th number in the series is 13
    public static void main(String[] args) {
        System.out.println("Enter the elements position");
        Scanner in =new Scanner(System.in);
        int pos = in.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while (count<=pos){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
