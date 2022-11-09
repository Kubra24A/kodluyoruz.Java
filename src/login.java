package src;

import java.util.Scanner;


public class login {
     
    public static void main (String[] args) {

   String userName, password, oldPassword, newPassword ;
   Scanner inp = new Scanner (System.in) ;
   System.out.println("Your username :");
   userName = inp.nextLine();
   System.out.println("Password :");
   password = inp.nextLine();

   if (userName.equals("AKGUL :") && (password.equals("JavaPro01 :"))) {
     System.out.println("The username and password is correct.");
   } else {
    System.out.println("You entered an incorrect password.\nIf you want to specify a new password,select \"no\" or \"yes\"");
    oldPassword = inp.nextLine();

    if (oldPassword.equals("No")) {
        System.out.println("Login terminated.");
      } else if  (oldPassword.equals("Yes")) {
        System.out.println("Type your new password.");
        newPassword = inp.nextLine();

      if (newPassword.equals("tyr3456")) {
       System.out.println("The password is incorrect try again :");

       if (newPassword.equals("JavaPro01")) {
        System.out.println("Try again if you have entered the same password.");
       }else {
        System.out.println("Your password has been successfully reset.");
       } 
      
       }else {
        System.out.println("You're logged in incorrectly.");
       }
    } 
    
       }

    }
 }





