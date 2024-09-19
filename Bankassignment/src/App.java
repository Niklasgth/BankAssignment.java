import java.util.Scanner;

public class App {

    //detta borde göra variabeln tillgänglig över hela denna app
    static int currentBalance =0;
    
    public static void main(String[] args) {
        //scanner för switchen
        Scanner choiseScanner = new Scanner(System.in);
        int choise = 0;
      
        //try_ catch för fånga eventella felkoder från icke siffror
        try {
//while så att den hoppar ut om jag slår 4:a likt vi gjorde i övningsuppgiften
        while (choise != 4){ 
            //lägger till linje för ökad läslighet
        System.out.println("------------------------------");
        System.out.print("Greetings customer of the bank. ");
        System.out.println("Would you like to:");
    
        System.out.println("Check your balance?: Press 1:");
        System.out.println("Deposit money?: Press 2:");
        System.out.println("Witdraw money from your account?: Press 3");
        System.out.println("Quit your bank application?: Press 4");

        choise = choiseScanner.nextInt();
            //mina case går direkt till metoder vilka alla drar nytta av samma 
        switch (choise) {
            case 1: 
            checkMyBalance(); 
            break;

            case 2: 
            deposit();
            break;

            case 3:
            withdraw();
            break;

            case 4:
            quit();
            break;

            default: System.out.println("Invalid command, pleace choose 1-4");
                break;
            }
        }
    } catch (Exception e) {
       System.out.println("Invalid character"); }
    }

    public static void checkMyBalance(){
        System.out.println("------------------------------");
    System.out.println(" Your current saldo is "+ currentBalance);
    }

    public static void deposit() {
        Scanner depScanner = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("How mutch would you like to deposit to your account?");
        int dep = depScanner.nextInt();
        System.out.println("You deposited "+ dep+ " Sek. on your account.");
        currentBalance += dep;

        System.out.println("Your current saldo is "+ currentBalance);
        
    }   

    public static void withdraw() {
       Scanner witScanner = new Scanner(System.in);
       System.out.println("------------------------------");
      System.out.println("How mutch would you like to withdraw from your account?");
       int wit = witScanner.nextInt();

        if (wit >= currentBalance) {
            System.out.println("------------------------------");
            System.out.println("Unable to withdraw.");
            System.out.println("You do not have enough funds on your account.");
            System.out.println("Your current saldo is "+ currentBalance);
        }else{
            currentBalance -= wit;
            System.out.println("------------------------------");
            System.out.println("You witdrew " + wit+ " Sek.");
            System.out.println("Your current saldo is "+ currentBalance);
        }
    }

    public static void quit() {
        System.out.println("------------------------------");
    System.out.println("Application will now quit");
    }
}



