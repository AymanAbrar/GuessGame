import java.util.Scanner;
public class game {
   public static void main(String[]args)throws Exception {
   
int num1;
   
int num2;
   
Scanner scan = new Scanner(System.in);
   
System.out.print("Player one: enter an integer: ");
   
num1 = scan.nextInt();
     


   
System.out.print("Player two: guess the integer: ");
   
num2 = scan.nextInt();
 
         if
 ((num1==num2)) {
       
           
System.out.print("You guessed correctly ");
          
        }
else {
           System.out.print("You guessed wrong; ");
   
while (num1!=num2) {
   
       
System.out.print("try again: ");
       num2 = scan.nextInt();

       if ((num1
==
num2)) {
       
           
System.out.print("You guessed correctly ");
       
       
        }
       
    }
       
    }
   
   
scan.close();
    }
}


