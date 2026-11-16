import java.util.Scanner;

public class milesperlitre {
    public static void main(String[]agrs){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number of litres: ");
        double litres=input.nextDouble();
        double MPG=litres*5.3;
         System.out.print("number of miles driven: "+MPG);
         input.close();

    }

}
