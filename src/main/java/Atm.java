import java.util.Scanner;
class AtmOperation{
    float balance=50000;
    public void checkPin(){
        System.out.println("Enter your pin");
        Scanner num=new Scanner(System.in);
        int pin= num.nextInt();
        if (pin==5128){
            menu();
        }
        else {
            System.out.println("You Entered wrong Pin");
        }
    }
    public void menu(){
        System.out.println("Which menu you want to chose");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdrawal Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");
        Scanner num=new Scanner(System.in);
        int menu= num.nextInt();
        switch (menu){
            case 1:
                checkBalance();
                break;
            case 2:
                withdrawalMoney();
                break;
            case 3:
                depositMoney();
                break;
            case 4:
                exit();
                return;
            default :
                System.out.println("Invalid choice, please try again.");
        }

    }
    public void checkBalance(){
        System.out.println("Your Balance is ="+ balance);
    }
    public void withdrawalMoney(){
        System.out.println("Enter your Withdrawal Amount");
        Scanner num=new Scanner(System.in);
        float amt= num.nextInt();
        if (amt>=50000){
            System.out.println("You don't have enough money in your account");
        }
        else {
            balance=balance-amt;
            System.out.println("Money Withdrawal Successfully");
            System.out.println("Your current balance is = "+ balance);
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter your deposit amount");
        Scanner num=new Scanner(System.in);
        int amt= num.nextInt();
        balance=balance+amt;
        System.out.println("Money Deposit Successfully");
        System.out.println("Your current balance is = "+ balance);
        menu();
    }
    public void exit(){
        System.out.println("Thank You for using our ATM , have a nice day");
    }
}
public class Atm {
    public static void main(String[] args) {
        AtmOperation obj=new AtmOperation();
        obj.checkPin();
    }
}
