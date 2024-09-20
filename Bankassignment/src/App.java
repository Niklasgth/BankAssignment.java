import java.util.Scanner;

public class App {

    //detta borde göra variabeln tillgänglig över hela denna app
    static int currentBalance =0;
    
    public static void main(String[] args) {
        //scanner för switchen
       // Scanner choiseScanner = new Scanner(System.in);
        int choise = 0;
      
        //while loop så att den hoppar ut om jag slår 4:a likt vi gjorde i övningsuppgiften
        while (choise != 4){ 

        //kan ju också sättas till en metod för DRY
        introText();

        //testar att göra scannern till egen metod för öppna den på färre ställen
        choise = scan();
        

       //if (choise>-1 && choise <5) {
        //continue;
       /*}else 
            invalidInput();
            choise = scan(); */
       
    

    
            //mina case går direkt till metoder cut  dry.
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

            default: 
            System.out.println("Invalid command, pleace choose 1-4");
                break;
            }
        } 
    }
    

           
    public static void checkMyBalance(){
        line();
    System.out.println(" Your current saldo is "+ currentBalance);
    }

    public static void deposit() {
        //Scanner depScanner = new Scanner(System.in);
        line();
        System.out.println("How mutch would you like to deposit to your account?");
        int dep = scan();
        //inga negativa siffror denna if/else stoppar det
            if (dep <0) {System.out.println();
                     invalidInput();
            }else{ System.out.println("You deposited "+ dep+ " Sek. on your account.");
                currentBalance += dep;}

        
    }   

    public static void withdraw() {
        //Scanner witScanner = new Scanner(System.in);
       line();
        System.out.println("How mutch would you like to withdraw from your account?");
        int wit = scan();

        if (wit >= currentBalance) {
            line();
            System.out.println("Unable to withdraw.");
            System.out.println("You do not have enough funds on your account.");
            
        }else{
            currentBalance -= wit;
            line();
            System.out.println("You witdrew " + wit+ " Sek.");
            
        }
    }

    public static void quit() {
        line();
    System.out.println("Application will now quit");
    }
//klass för göra huvudklassen mer DRY. Lägger all text här.
    public static void introText() {
                //lägger till linje för ökad läslighet
                line();
                System.out.print("Greetings customer. ");
                System.out.println("Would you like to:");
            
                System.out.println("Check your balance?: Press 1:");
                System.out.println("Deposit money?: Press 2:");
                System.out.println("Witdraw money from your account?: Press 3");
                System.out.println("Quit your bank application?: Press 4");
    }

    public static void invalidInput() {
        line();
        System.out.println("Invalid input");

}
    //scanner class with inbuild 
    public static int scan(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
 
            return input;
       
            
    }  
    public static void line() {
        System.out.println("------------------------------");
    }
}

        
    





