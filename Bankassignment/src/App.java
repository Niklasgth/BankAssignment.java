import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner choiseScanner = new Scanner(System.in);
        int choise = 0;
        int currentBalance = 0;

        while (choise != 4){ 

        System.out.println("Greetings customer to the bank");
        System.out.print("Would you like to:");
        
        System.out.println("Check your balance?: Press 1:");
        System.out.println("Deposit money?: Press 2:");
        System.out.println("Witdraw money from your account?: Press 3");
        System.out.println("Quit your bank application?: Press 4");

        choise = choiseScanner.nextInt();
        choiseScanner.close();

        switch (choise) {
            case 1: 
            checkMyBalance(currentBalance); 
            break;

            case 2: 
            deposit(currentBalance);

            break;

            case 3:
            //witdraw(currentBalance);
            break;

            case 4:
            quit();

            break;

            default: System.out.println("Invalid command pleace choose 1-4");
                break;
            }
        } 
    }

    //en metod för kolla rådande balans
    public static void checkMyBalance(int currentBalance){
    System.out.println(" Your balance is currently at:"+currentBalance+" sek");
    }

  //kod för ta in input, lägga till inputen på publika klassen currentBAlance och sedan stänga scannern     
    public static int deposit(int currentBalance) {
        Scanner depositScanner = new Scanner(System.in);
        System.out.println("How mutch would you like to deposit to your account?");
        int dep = depositScanner.nextInt();
        System.out.println("You deposited "+ dep+ "Sek. on your account.");
        currentBalance += dep;

        depositScanner.close();
        return currentBalance;
    }   

    public static int witdraw(int currentBalance) {
       Scanner witScanner = new Scanner(System.in);
      System.out.println("How mutch would you like to witdraw to your account?");
       int wit = witScanner.nextInt();

        if (wit >= currentBalance) {
            System.out.println("You don´t have enough funds on your account");
        }else{
            currentBalance -= wit;
        }
        witScanner.close();
        return currentBalance;
    }

    public static void quit() {
    System.out.println("Application will now quit");
    }
}



