import java.util.Scanner;

public class age {
    public static void main(String[]agrs){
        Scanner input =new Scanner(System.in);
        System.out.print("enter your age: ");
        int years=input.nextInt();
        int months=years*12;
        int days=years*365;
         System.out.println("age in days :"+days);
         System.out.println("age in months :"+months);

         input.close();

    }

}
