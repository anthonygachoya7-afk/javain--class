import java.util.Scanner;

public class squarecube {
    public static void main(String[]agrs){
        Scanner input=new Scanner(System.in);
        System .out.print("enter a value: ");
        int value=input.nextInt();
        int square=value*value;
        int cube=value*value*value;
        System.out.println("square: "+square);
        System.out.println("cube: "+cube);
        input.close();
    }
}
