package JavaClasses.day41_Inheritance.Task02;

public class AccountsObject {

    public static void main(String[] args) {

        CheckingAccount check1 = new CheckingAccount();

        System.out.println(check1);

        SavingAccount save1 = new SavingAccount();

        System.out.println(save1);

        check1.deposit(454);
        System.out.println(check1.balance);
        check1.withdraw(487);
        check1.showBalance();
        System.out.println("===========================");

        save1.showBalance();
        save1.deposit(5123);
        save1.showBalance();
        

    }
}
