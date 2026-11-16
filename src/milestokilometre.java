import java.util.Scanner;

public class milestokilometre {
    public static void main(String[]agrs){
        Scanner input=new Scanner (System.in);
        System.out.print("enter the number of miles driven: ");
        double miles=input.nextDouble();
        double formula=miles*1.609;
        System.out.println("miles in kilometre are: "+formula);
        input.close();
    }
}
