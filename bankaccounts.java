import java.util.Scanner;//banking management system//
public class bankaccounts {
    private String accountnumber;
    private String accountholdername;
    private double balance;
    public bankaccounts(String accountnumber,String accountholdername,double balance){
        this.accountnumber=accountnumber;
        this.accountholdername=accountholdername;
        this.balance=balance;
    

    }
    public String getaccountnumber(){
        return accountnumber;
    }
    public void setaccountnumber(String accountnumber){
        this.accountnumber=accountnumber;
    }
    public String getaccountholdername(){
        return accountholdername;
    }
    public double getbalance(){
        return balance;
    }
    public void displaydetails(){
        System.out.println("account number:"+getaccountnumber());
        System.out.println("account holder name:"+accountholdername);
        System.out.println("balance:"+balance);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account number:");
        String accnum=sc.nextLine();
        System.out.println("enter account holder name:");
        String name=sc.nextLine();
        System.out.println("enter balance:");
        double bal=sc.nextDouble();
        sc.nextLine();
        bankaccounts account=new bankaccounts(accnum, name, bal);
        System.out.println("\n---original account details---");
        account.displaydetails();
        System.out.println("\n enter new account number:");
        String newaccnum=sc.nextLine();
        account.setaccountnumber(newaccnum);
        System.out.println("\n--updated account deatails");
        account.displaydetails();
        sc.close();

    }
}


    

