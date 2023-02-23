public class countNumOfApp {
    public static void main(String[] args) {
        int num=45536;

       int count = 0;
       while (num>0){ //while the number is greater than zero
            int rem=num % 10;//divide through the number by ten and find reminder
            if(rem==5){
                count++;
            }
            num=num/10;
    }
            System.out.println(count);
        }
    }


