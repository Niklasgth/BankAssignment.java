import java.util.Scanner;

public class App {
//tror denna variabel behöver vara publik över hela 
public static int currentBalance = 0;

    public static void main(String[] args) {
        System.out.println("Greetings customer to the bank");
        System.out.println("Would you like to?");
        System.out.println("---------------------");
        System.out.println("Check your balance?: Press 1:");
        System.out.println("Deposit money: Press 2:");
        System.out.println("Witdraw money from your account: Press 3");
        System.out.println("Quit your bank application: Press 4");

        Scanner choiseScanner = new Scanner(System.in);
        int choise = choiseScanner.nextInt();
        choiseScanner.close ();

        while (choise != 4){ ;
        
        switch (choise) {
            case 1: 
            checkMyBalance(); 
            break;

            case 2: 
            deposit();
            break;

            case 3:
            witdraw();
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
    public static void checkMyBalance(){
    System.out.println(" Your balance is currently at:"+currentBalance+" sek");
    }

  //kod för ta in input, lägga till inputen på publika klassen currentBAlance och sedan stänga scannern     
    public static void deposit() {
        System.out.println("How mutch would you like to deposit to your account?");
        Scanner depositScanner = new Scanner(System.in);
        int deposit = depositScanner.nextInt();
        depositScanner.close();
        deposit+=currentBalance;
        System.out.println("You deposited "+ deposit+ "Sek. on your account.");
        checkMyBalance();
    }

    public static void witdraw() {
        System.out.println("How mutch would you like to witdraw to your account?");
        //witdraw = input.nextInt();
    }

    public static void quit() {
    System.out.println("Application will now quit");
    }
}



