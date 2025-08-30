import java.util.Scanner;
class EmployeeEncap{
    private int Account_balance;
    private int upiPin = 99999;

    public void setbalance(int balance){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enterupi pin");
        int pin = sc.nextInt();
        if(pin==upiPin){
            Account_balance = balance;
            System.out.println("Congratulations Salary is creditrd!");

        }else{
            System.out.println("Salry is credited");
        }
    }
    public int getbalance(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To know the balance please enter UPI Pin");
        int pin = sc.nextInt();
        if(pin==upiPin){
            System.out.println("Available balance is: "+Account_balance);
            return Account_balance;

        }else{
            System.out.println("!!Wron Pin!! Unable to fetch balance");
            return-1;
        }
        

    }
}
public class Encapsulation {
public static void main(String[] args) {
    EmployeeEncap emp = new EmployeeEncap();
    emp.setbalance(90000);
    emp.getbalance();
}
}
    

