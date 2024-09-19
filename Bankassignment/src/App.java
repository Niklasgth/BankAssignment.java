import java.util.Scanner;



public class App {
//tror denna variabel behöver vara publik över hela 
public static int currentBalance = 0;

    public static void main(String[] args) throws Exception {
        System.out.println("Greetings customer to the bank");
        System.out.println("Would you like to?");
        System.out.println("---------------------");
        System.out.println("Check your balance?: Press 1:");
        System.out.println("Deposit money: Press 2:");
        System.out.println("Witdraw money from your account: Press 3");
        System.out.println("Quit your bank application: Press 4");

       
        Scanner input = new Scanner(System.in);
        int choise = input.nextInt();
        
        

       
        while (choise != 4){ ;
        
        switch (choise) {
            case 1: 
               checkMyBalance(currentBalance); 
            break;

            case 2: 
               
            
            System.out.println("How mutch would you like to deposit to your account?");
                //balance = input.nextInt();
               
               
                //sum = add + balance;
                //sum = balance;
                //System.out.println("your account i now" + balance);
               
                 break;

            case 3:
            System.out.println("How mutch would you like to witdraw to your account?");
            //witdraw = input.nextInt();

            break;

            default: System.out.println("Invalid command plece choose 1-4");
                break;
        }

    } System.out.println("Application will now quit");

    }
    //en metod för kolla rådande balans
    public static void checkMyBalance(int currentBalance){
    System.out.println(" Your balance is currently at:"+currentBalance+" sek");
    }

}



