import java.util.Scanner;

public class App {

    //detta gör variabeln tillgänglig över hela denna app
    static int currentBalance =0;
    
    public static void main(String[] args) {
       
        int choise = 0;
      
        //while loop så att den hoppar ut om jag slår 4:a
        while (choise != 4){ 
        
        //try/catch för fånga icke siffror
       try {
        introText();
        //kör scannern till egen metod för öppna den på färre ställen samt DRY
        choise = scan();
        
       } catch (Exception e) {
        invalidInput();
        continue;
       }
            //mina case går direkt till metoder enligt  DRY.
        switch (choise) {
            case 1: 
                checkMyBalance(); 
            break;

            case 2: 
            //try/catch för icke siffror
                try {
                     deposit();
                } catch (Exception e) {
                     invalidInput();
                continue;
                 }   
            break;

            case 3:
                 try {
                withdraw();
                 } catch (Exception e) {
                invalidInput();
                continue;
                }
                
            break;

            case 4:
                quit();
            break;

            default: 
                def();
            break;
            }
        } 
    }
    
//klass för göra huvudklassen mer DRY. Lägger all text här.
    public static void introText() {
        line();
        System.out.print("Greetings customer to Niklas Bank. ");
        System.out.println("Would you like to:");
        System.out.println("Check your balance?: Press 1:");
        System.out.println("Deposit money?: Press 2:");
        System.out.println("Witdraw money from your account?: Press 3");
        System.out.println("Quit your bank application?: Press 4");
}
           
    public static void checkMyBalance(){
        line();
        System.out.println(" Your current saldo is "+ currentBalance);
    }

    public static void deposit() {
        line();
        System.out.println("How mutch would you like to deposit to your account?");
       
        int dep = scan();
        //inga negativa siffror får knappas in. Denna if/else stoppar det
            if (dep <0) {System.out.println();
                     invalidInput();
            }else{ System.out.println("You deposited "+ dep+ " Sek. on your account.");
                currentBalance += dep;}
    }   

    public static void withdraw() {
        line();
        System.out.println("How mutch would you like to withdraw from your account?");
        int wit = scan();

        if (wit <0) {System.out.println();
            line();
            invalidInput();
        
        }else if (wit >= currentBalance) {
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

    public static void def(){
        line();
        System.out.println("Invalid command, pleace choose 1-4");
    }

    public static void invalidInput() {
        line();
        System.out.println("Invalid input");

}
    //scanner metod för mer DRY
    public static int scan(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
 
            return input;
    }  
    //hmm blev många upprepade linjer tills jag lärt mig något annat sätt varför inte en linjemetod!
    public static void line() {
        System.out.println("------------------------------");
    }
}