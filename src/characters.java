import java.util.Scanner;

public class characters {
    public static void main(String[]main){
     Scanner input=new Scanner (System.in);
     System.out.print("enter the character: ");
     char letter=input.next().charAt(0);
     if(Character.isUpperCase(letter)){
         System.out.println("it is an upper case letter");

     }
     else if(Character.isLowerCase(letter)){
         System.out.println("it is an lower case letter");
     }
     else{
         System.out.println("invalid");
     }
     input.close();
    }
}
