import java.util.Scanner;

public class area{
    public static void main(String[]agrs){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the radius of the sphere " );
        double radius=input.nextDouble();
        input.nextLine();
        double PI=3.14;
        double aria=4*PI*radius*radius;
        double volume=4.0/3.0*PI*radius*radius*radius;

        System.out.println("the area of the sphere is :"+aria);
        System.out.println("the volume of the sphere is:"+volume);

    }
}