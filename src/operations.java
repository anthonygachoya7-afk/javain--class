import java.util.Scanner;

public class operations {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter a value: ");
        int value=input.nextInt();
        System.out.print("enter a value: ");
        int number=input.nextInt();
        System.out.print("enter a value: ");
        int no=input.nextInt();
        System.out.print("enter a value: ");
        int digit=input.nextInt();

        int area=digit*value*number*no;
        int sum=digit+value+number+no;
        double avg=(digit+value+number+no)/4.0;

        System.out.println("the sum of the digits is: "+sum);
        System.out.println("the average of the digits is: "+avg);
        System.out.println("the product of the digits is: "+area);

        input.close();

    }
}
