package DSA_Projects;

class Account{
    int accountNo;
    private int amount;
    String name;

    //Setter
    public void deposite(int cash){
        this.amount = this.amount+cash;
        System.out.println(cash+" is deposited.....");
    }
    //Getter
    public int balance(){
        return this.amount;
    }

    public void withDrawl(int cash){
        if(this.amount >= cash){
            this.amount = this.amount - cash;
            System.out.println("Withdrawing amount = "+cash);
        }
        else{
            System.out.println("Your balance is low !!!!!!");
        }
    }
}

public class BankingApplication {

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Sagar";
        a1.accountNo = 12369;

        a1.deposite(1000);
        a1.deposite(3000);

        System.out.println("\nTotal remiaining amount >>>>>");
        System.out.println(a1.balance());

        a1.withDrawl(500);
        System.out.println("\nTotal remiaining amount after withdrawl >>>>>");
        System.out.println(a1.balance());
    }

}
