import java.util.Scanner;

public class studentclass {
    public static void main(String[]agrs){
        Scanner input=new Scanner(System.in);
        int members;
        System.out.println("--enter the total number of class members--");
        System.out.print("Class A: ");
         members=input.nextInt();

        int fee=50000;
        int payment=fee*members;
        System.out.println("Class A: "+payment);

    }


}
