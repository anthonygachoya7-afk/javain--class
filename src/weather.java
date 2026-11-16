import java.util.Scanner;

public class weather {
    public static void main(String[]agrs){
        Scanner input=new Scanner (System.in);
        System.out.print("enter the days temperature condition:");
        double temperature=input.nextDouble();

        if (temperature<35){
            System.out.println("it is a cold day");

        }
        else if (temperature >45){
            System.out.println("it is a hot day");
        }
        else if(temperature<45 && temperature >35){
            System.out.print("the weather is cool");
        }
        else{
            System.out.println("invalid");
        }
        input.close();
    }
}
